package com.predic8.scooter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.ResponseEntity.ok;

@RestController
public class RueckgabeApi {

    @Autowired
    KafkaTemplate<String, String> template;

    @PostMapping("/scooter/{id}/rueckgabe")
    public ResponseEntity rueckgabe(@PathVariable String id) {

        template.send("scooter.rueckgabe",id);
        return ok().build();
    }

}
