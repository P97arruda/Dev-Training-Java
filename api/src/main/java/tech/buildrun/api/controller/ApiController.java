package tech.buildrun.api.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ApiController {

    private List<String> tasks = new ArrayList<>();


    private ObjectMapper ObjectMapper;

    public ApiController(ObjectMapper objectMapper) {
        this.ObjectMapper = objectMapper;
    }


        @GetMapping(path = "/tasks")
        public ResponseEntity<String> helloword() throws JsonProcessingException {
            tasks.add("Minha tarefa");
            return ResponseEntity.ok(ObjectMapper.writeValueAsString(tasks));
        }
    }

