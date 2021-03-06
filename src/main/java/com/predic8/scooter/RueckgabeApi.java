package com.predic8.scooter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.predic8.scooter.model.Rueckgabe;
import com.predic8.scooter.model.RueckgabeDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.ResponseEntity.ok;

@RestController
public class RueckgabeApi {

    @Autowired
    ObjectMapper om;

    @PostMapping("/scooter/{id}/rueckgabe")
    public ResponseEntity rueckgabe(@PathVariable String id, @RequestBody Rueckgabe rueckgabe) throws JsonProcessingException {

        // Hier Nachricht an Kafka Queue senden

        return ok().build();
    }

}
