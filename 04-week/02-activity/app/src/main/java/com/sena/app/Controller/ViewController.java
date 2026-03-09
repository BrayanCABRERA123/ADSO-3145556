package com.sena.app.Controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.sena.app.Entity.View;
import com.sena.app.Service.ViewService;

@RestController
@RequestMapping("/api/view")
public class ViewController {

    private final ViewService service;

    public ViewController(ViewService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<View> create(@RequestBody View view) {
        View savedView = service.save(view);
        return new ResponseEntity<>(savedView, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<View>> All() {
        List<View> views = service.All();
        return new ResponseEntity<>(views, HttpStatus.OK);
    }
}