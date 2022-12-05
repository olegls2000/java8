package com.lesson18hw;

import com.annotation.MyStringProcessor;
import com.annotation.NumberRangeProcessor;
import com.annotation.ProcessManager;
import com.employe.QA;

public class Lesson18HW {
  public static void main(String[] args) throws Exception {
    QA newQa = new QA(20_000, "Joe", "asteriks");
    QA newQa1 = new QA(30_000, "Joe", "Onyx");

    ProcessManager processManager = ProcessManager.getInstance();
    processManager.addProcessor(MyStringProcessor.getInstance());
    processManager.addProcessor(NumberRangeProcessor.getInstance());

    processManager.process(newQa);
    processManager.process(newQa1);

  /*  MyAnnotationProcessor stringProcessor = MyStringProcessor.getInstance();
    MyAnnotationProcessor numberRangeProcessor = NumberRangeProcessor.getInstance();

    stringProcessor.process(newQa);
    numberRangeProcessor.process(newQa);

    stringProcessor.process(newQa1);
    numberRangeProcessor.process(newQa1);

    List<MyAnnotationProcessor> processors =
        Arrays.asList(stringProcessor, numberRangeProcessor, null, null);
    for (MyAnnotationProcessor processor : processors) {
      processor.process(newQa);
    }*/
  }

}



