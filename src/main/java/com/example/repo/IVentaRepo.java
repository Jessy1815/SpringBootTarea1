package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Venta;

public interface IVentaRepo extends JpaRepository<Venta,Integer>{

}
