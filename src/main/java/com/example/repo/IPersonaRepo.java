package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Persona;

public interface IPersonaRepo extends JpaRepository<Persona,Integer>{

}
