package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Producto;

public interface IProductoRepo extends JpaRepository<Producto,Integer>{

}
