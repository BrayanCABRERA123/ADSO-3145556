package com.sena.app.Controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.sena.app.Entity.Action;
import com.sena.app.Service.ActionService;

@RestController
@RequestMapping("/api/action")
public class ActionController {

    private final ActionService service;

    public ActionController(ActionService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Action> create(@RequestBody Action action) {
        Action savedAction = service.save(action);
        return new ResponseEntity<>(savedAction, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Action>> All() {
        List<Action> actions = service.All();
        return new ResponseEntity<>(actions, HttpStatus.OK);
    }
}