package com.uren.activemqdemo.listener;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {
  
  @JmsListener(destination = "student.queue")
  public void consume(String student) {
    System.out.print("Received message student:" + student);
  }
  
  @JmsListener(destination = "teacher.queue")
  public void consumeTeacher(String student) {
    System.out.print("Received message teacher:" + student);
  }
}
