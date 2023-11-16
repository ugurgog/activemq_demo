package com.uren.activemqdemo.model;

import java.io.Serializable;

public class Teacher implements Serializable{

  private static final long serialVersionUID = -6293796151075649525L;
  private int id;
  private String name;
  private String surname;
  private String className;
  private String unit;
  
  public int getId() {
    return id;
  }
  
  public void setId(int id) {
    this.id = id;
  }
  
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public String getSurname() {
    return surname;
  }
  
  public void setSurname(String surname) {
    this.surname = surname;
  }

  
  public String getClassName() {
    return className;
  }

  
  public void setClassName(String className) {
    this.className = className;
  }

  
  public String getUnit() {
    return unit;
  }

  
  public void setUnit(String unit) {
    this.unit = unit;
  }
}
