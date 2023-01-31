package com.annotation;

import java.lang.reflect.Field;

public class MyStringProcessor implements MyAnnotationProcessor{
  private static MyStringProcessor instance;

  public static MyStringProcessor getInstance() {
    if (instance == null) {
      instance = new MyStringProcessor();
    }
    return instance;
  }

  private MyStringProcessor() {
  }

  @Override
  public void process(Object objectToProcess) throws Exception {
    final Class clazz = objectToProcess.getClass();
    final Field[] fields = clazz.getDeclaredFields();
    for (Field field : fields) {
      if (!field.isAnnotationPresent(MyString.class)) {
        continue;
      }
      final MyString annotation = field.getAnnotation(MyString.class);
      final String startWith = annotation.startWith();
      final int maxSize = annotation.maxSize();
      field.setAccessible(true);
      final Object rawValue = field.get(objectToProcess);
      final String stringValue = (String) rawValue;
      if (stringValue.length() < maxSize && stringValue.startsWith(startWith)) {
        return;
      }
      final String fieldName = field.getName();
      final var message =
          String.format("Field with name %s has invalid value: %s, must be ...: [ %s, %d ]",
              fieldName, stringValue, startWith, maxSize);
      throw new RuntimeException(message);
    }
  }
}
