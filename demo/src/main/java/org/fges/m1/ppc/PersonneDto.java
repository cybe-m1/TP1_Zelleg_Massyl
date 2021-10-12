package org.fges.m1.ppc;

public class PersonneDto {
    private String nom;
    private String prenom;

public PersonneDto(String nom, String prenom){
	this.nom = nom;
	this.prenom = prenom;
}


public String getNom(){
	return this.nom;
}

public String getPrenom(){
	return this.prenom;
}

public void SetName(String name){
	this.nom = name;
}

public void setPrenom(String prenom){
	this.prenom = prenom;
}

}
