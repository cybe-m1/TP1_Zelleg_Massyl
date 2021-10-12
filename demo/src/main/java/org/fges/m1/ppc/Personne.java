package org.fges.m1.ppc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

public class Personne{

  private int id;
  private String nom;
  private String prenom;

public Personne(int id,String nom,String prenom){
  this.id = id;
  this.nom = nom;
  this.prenom = prenom;
}

public int getId(){
  return this.id;
}

public String getNom(){
  return this.nom;
}

public String getPrenom(){
  return this.prenom;
}

public void setId(int id){
  this.id = id;
}

public void setNom(String nom){
  this.nom = nom;
}

public void setPrenom(String prenom){
  this.prenom = prenom;
}

public String toString(){
  return "Id is : " + this.id + " , nom is : " + this.getNom() + " , " + this.getPrenom();
}

}
