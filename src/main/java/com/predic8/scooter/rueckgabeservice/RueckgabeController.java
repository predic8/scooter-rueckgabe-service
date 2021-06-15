package com.predic8.scooter.rueckgabeservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RueckgabeController {

    @Autowired
    KafkaTemplate<String, String> template;

    @PostMapping("/scooter/{id}/rueckgabe")
    public ResponseEntity rueckgabe(@PathVariable String id) {
        System.out.println("id = " + id);
        template.send("scooter.rueckgabe",id);
        return ResponseEntity.ok().build();
    }

}
