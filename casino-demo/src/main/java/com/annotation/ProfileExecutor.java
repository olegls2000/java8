package com.annotation;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class ProfileExecutor {

  //Singleton!!!
  public void execute(Object object) throws Exception {
    final var clazz = object.getClass();
    final List<Method> profiledMethods = getProfiledMethods(clazz.getDeclaredMethods());
    for (Method profiledMethod : profiledMethods) {
      executionWithProfiling(profiledMethod, object);
    }
  }

  private void executionWithProfiling(Method profiledMethod, Object object) throws Exception {
    final long beforeStart = System.currentTimeMillis();
    profiledMethod.invoke(object);
    final long afterFinish = System.currentTimeMillis();
    final long executionTime = afterFinish - beforeStart;
    System.out.println(
        String.format("Execution of method: %s took %d milli seconds", profiledMethod.getName(),
            executionTime));
  }

  private List<Method> getProfiledMethods(Method[] methods) {
    final List<Method> result = new ArrayList<>();
    for (Method method : methods) {
      if (method.isAnnotationPresent(Profile.class)) {
        result.add(method);
      }
    }
    return result;
  }
}
