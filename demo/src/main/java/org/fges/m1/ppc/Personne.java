package org.fges.m1.ppc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

public class Personne{

  private int id;
  private String name;
  private String first_name;

public Personne(int id,String name,String first_name){
  this.id = id;
  this.name = name;
  this.first_name = first_name;
}

public int getId(){
  return this.id;
}

public String getName(){
  return this.name;
}

public String get_firstName(){
  return this.first_name;
}

public void setId(int id){
  this.id = id;
}

public void setName(String name){
  this.name = name;
}

public void set_FirstName(String first_name){
  this.first_name = first_name;
}

public String toString(){
  return "Id is : " + this.id + " , Name is : " + this.getName() + " , " + this.get_firstName();
}

}
