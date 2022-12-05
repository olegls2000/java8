package com.annotation;

import java.util.ArrayList;
import java.util.List;

public class ProcessManager {

  private static ProcessManager instance;

  public static ProcessManager getInstance() {
    if (instance == null) {
      instance = new ProcessManager();
    }
    return instance;
  }

  private ProcessManager() {
  }

  private List<MyAnnotationProcessor> processors = new ArrayList<>();

  public void addProcessor(MyAnnotationProcessor processor) {
    processors.add(processor);
  }

  public void process(Object objectToProcess) {
    try {
      for (MyAnnotationProcessor processor : processors) {
        processor.process(objectToProcess);
      }
    } catch (Exception e) {
      new RuntimeException(e);
    }
  }
}
