package com.example.Santiago.HUactivity.Repositorys;

import com.example.Santiago.HUactivity.Entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, String> {
    // Puedes agregar consultas personalizadas si es necesario
}