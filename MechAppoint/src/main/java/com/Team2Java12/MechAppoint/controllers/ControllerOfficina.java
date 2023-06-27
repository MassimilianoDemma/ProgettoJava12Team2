package com.Team2Java12.MechAppoint.controllers;

import com.Team2Java12.MechAppoint.entities.Officina;
import com.Team2Java12.MechAppoint.repositories.OfficinaRepository;
import com.Team2Java12.MechAppoint.servicies.OfficinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController

public class ControllerOfficina {

    @Autowired
    private OfficinaService officinaService;


    @PostMapping
    public ResponseEntity<Officina>createOfficina(@RequestBody Officina officina){

        officinaService.saveOfficina(officina);
        return ResponseEntity.ok().build();

    }
    @GetMapping({"officinaid"})
    public ResponseEntity<Officina> retrieveOfficina(@PathVariable ("officinaid") int officinaid){

      return ResponseEntity.ok(officinaService.getOfficina(officinaid));

    }

    @PutMapping("officinaid")

        public ResponseEntity<Officina>updateOfficina(@RequestBody Officina officina, @PathVariable("officcinaid") int officicnaid){

        officinaService.updateOfficina(officina,officicnaid);
        return ResponseEntity.ok().build();

    }
    @DeleteMapping({"officinaid"})

        public ResponseEntity<Officina> deleteOfficina (@PathVariable ("officinaid") int officinaid){
        officinaService.deleteOfficna(officinaid);
        return ResponseEntity.ok().build();
    }
}
