package com.katherinewyers.icdd.controller;

import com.katherinewyers.icdd.model.Schema;
import com.katherinewyers.icdd.repository.SchemaRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/v1/schemas")
public class SchemaController {

    private final SchemaRepository schemaRepository;

    public SchemaController(SchemaRepository schemaRepository) {
        this.schemaRepository = schemaRepository;
    }

    @GetMapping
    public List<Schema> getAllSchemas() {
        return schemaRepository.findAll();
    }
}

