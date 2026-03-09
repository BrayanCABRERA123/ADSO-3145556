package com.sena.app.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.app.Entity.Role;
import com.sena.app.IRepository.IRoleRepository;

@Service
public class RoleService {

    @Autowired
    private IRoleRepository roleRepository;

    public Role save(Role role) {
        return roleRepository.save(role);
    }

    public List<Role> All() {
        return roleRepository.findAll();
    }
}