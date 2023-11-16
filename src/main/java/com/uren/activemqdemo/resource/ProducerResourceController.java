package com.uren.activemqdemo.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.uren.activemqdemo.model.Student;
import com.uren.activemqdemo.model.Teacher;

import jakarta.jms.Queue;

@RestController
@RequestMapping("rest/publish")
public class ProducerResourceController {
  
  @Autowired
  private JmsTemplate jmsTemplate;
  
  @Autowired
  private Queue studentQueue;
  
  @Autowired
  private Queue teacherQueue;
  
  @Autowired
  private Gson gson;

  @PostMapping("/publish-student")
  public String publish(@RequestBody Student student) {
    jmsTemplate.convertAndSend(studentQueue, gson.toJson(student));
    return "Published Successfully Student";
  }
  
  @PostMapping("/publish-teacher")
  public String publishteacher(@RequestBody Teacher student) {
    jmsTemplate.convertAndSend(teacherQueue, gson.toJson(student));
    return "Published Successfully Teacher";
  }
}
