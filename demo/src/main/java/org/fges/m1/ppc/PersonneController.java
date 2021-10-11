package org.fges.m1.ppc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.*;

@Controller
public class PersonneController{
  public PersonneService service;

  public PersonneController(PersonneSercice service){
    this.service = service;
  }

  @GetMapping
  public List<Personne> AllPersons(){
    return service.findAll();
  }

  public String détails(Personne id){
    for(Personne p : service){
      if(p.getId() == id){
        p.toString();
      }
    }
  }


  public void ajouter(Personne p){
    service.addPersonne(p);
  }

  public void supprimer(int id){
    service.removePersonne(id);
  }


  //Remplace l'utilisateur ayant comme identifiant id, par la personne new
  public void remplacer(int id, Personne new){
    for(Personne p : service){
      if(p.getId() == id){
        service.remove(p);
        service.add(new);
      }
    }
  }
}
