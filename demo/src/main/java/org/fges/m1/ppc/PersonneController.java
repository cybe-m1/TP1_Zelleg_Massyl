package org.fges.m1.ppc;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/tp1/personnes")
public class PersonneController {

    private final PersonneService personneService;

    public PersonneController(PersonneService personneService) {
        this.personneService = personneService;
    }

    @GetMapping
    public List<Personne> getAll() {
        return personneService.getPersonnes();
    }

    @GetMapping("/{id}")
    public Optional<Personne> getPersonneById(@PathVariable("id") int personneId) {
        return personneService.getPersonneById(personneId);
    }

    @DeleteMapping("/{id}")
    public void removePersonneById(@PathVariable("id") int personneId) {
        personneService.removePersonne(personneId);
    }

    @PutMapping("/{id}")
    public Personne modifyPersonneById(@PathVariable("id") int personneId, @RequestBody PersonneDto personne) {
        return personneService.modifyPersonne(new Personne(personneId, personne.getNom(), personne.getPrenom()));
    }

    @PostMapping
    public Personne addPersonne(@RequestBody Personne personne) {
        return personneService.addPersonne(personne);
    }
}

