package com.sena.app.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.app.Entity.Action;
import com.sena.app.IRepository.IActionRepository;

@Service
public class ActionService {

    @Autowired
    private IActionRepository actionRepository;

    public Action save(Action action) {
        return actionRepository.save(action);
    }

    public List<Action> All() {
        return actionRepository.findAll();
    }
}