package com.annotation;

import java.lang.reflect.Field;

//Singleton!!
public class NumberRangeProcessor implements MyAnnotationProcessor {

  private static NumberRangeProcessor instance;

  public static NumberRangeProcessor getInstance() {
    if (instance == null) {
      instance = new NumberRangeProcessor();
    }
    return instance;
  }

  private NumberRangeProcessor() {
  }

  @Override
  public void process(Object fox) throws Exception {
    final Class clazz = fox.getClass();
    final Field[] fields = clazz.getDeclaredFields();
    for (Field field : fields) {
      if (!field.isAnnotationPresent(NumberRange.class)) {
        continue;
      }
      final NumberRange annotation = field.getAnnotation(NumberRange.class);
      final int max = annotation.max();
      final int min = annotation.min();
      field.setAccessible(true);
      final Object rawValue = field.get(fox);
      final int intValue = (int) rawValue;
      if (intValue > max || intValue < min) {
        final String fieldName = field.getName();
        final var message =
            String.format("Field with name %s has invalid value: %d, must be in range: [ %d, %d ]",
                fieldName, intValue, min, max);
        throw new RuntimeException(message);
      }
    }
  }
}
