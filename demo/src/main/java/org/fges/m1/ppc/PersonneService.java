package org.fges.m1.ppc;
import org.springframework.stereotype.Service;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.*;

@Service
public class PersonneSercice{

private ArrayList<Personne> personne_liste = new ArrayList<>(Arrays.asList(
    //Si l'id de la personne dans la liste est égal à 0, cela veut dire qu'il reste de la place,
    //Si les trois id sont differents de 0, alors la liste contient déjà 3 personnes
    new Personne(0, "default", "default"),
    new Personne(0, "default", "default"),
    new Personne(0, "default", "default"),
));

public void addPersonne(Personne p){
  //Si les trois places sont occupées par de vraies personnes, on supprime la premiére pour la remplacer par l'argument
  if(this.personne_liste.get(0).getId() != 0 && this.personne_liste.get(1).getId() != 0 && this.personne_liste.get(2).getId() != 0){
    this.personne_liste.remove(0);
    this.personne_liste.add(p);
  }
  else{
  for(Personne p : this.personne_liste){
    //Si l'id est égal à 0, alors on ajoute la personne à l'endroit libre dans la liste
    if(p.getId() == 0){
      this.personne_liste.remove(p);
      this.personne_liste.add(p);
      }
    }
  }
}

public void changeName(String name, String first_name, int id){
  for(Personne p : this.personne_liste){
    if(p.getId() == id){
      p.setName(name);
      p.set_FirstName(first_name);
    }
  }
}

public void removePersonne(int id){
  for(Personne p : this.personne_liste){
    if(p.getId() == id){
      //On supprime la personne ayant le même id, et on ajoute une personne par défaut pour garder les 3 emplacements
      this.personne_liste.remove(p);
      this.personne_liste.add(new Personne(0, "default", "default"));
    }
  }
}


}
