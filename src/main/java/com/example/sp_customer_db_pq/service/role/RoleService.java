package com.example.sp_customer_db_pq.service.role;

import com.example.sp_customer_db_pq.model.Role;
import com.example.sp_customer_db_pq.repository.IRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RoleService implements IRoleService {
    @Autowired
    private IRoleRepository roleRepository;

    @Override
    public Iterable<Role> getAll() {
        return roleRepository.findAll();
    }

    @Override
    public Optional<Role> getById(Long id) {
        return roleRepository.findById(id);
    }

    @Override
    public Role save(Role role) {
        return roleRepository.save(role);
    }

    @Override
    public void remove(Long id) {
        roleRepository.deleteById(id);
    }


    @Override
    public Role findByName(String name) {
        return roleRepository.findByName(name);
    }
}

