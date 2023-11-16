package com.uren.activemqdemo.config;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.core.JmsTemplate;

import jakarta.jms.Queue;

@Configuration
public class ActiveMqConfig {

  @Value("${activemq.broker-url}")
  private String brokerUrl;
  
  @Bean
  public Queue studentQueue() {
    return new ActiveMQQueue("student.queue");
  }
  
  @Bean
  public Queue teacherQueue() {
      return new ActiveMQQueue("teacher.queue");
  }
  
  @Bean
  public ActiveMQConnectionFactory activeMQConnectionFactory() {
    ActiveMQConnectionFactory factory = new ActiveMQConnectionFactory();
    factory.setBrokerURL(brokerUrl);
    return factory;
  }
  
  @Bean
  public JmsTemplate jmsTemplate() {
    return new JmsTemplate(activeMQConnectionFactory());
  }
}
