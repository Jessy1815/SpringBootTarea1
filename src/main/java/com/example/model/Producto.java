package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Información del producto")
@Entity
@Table(name="producto")
public class Producto {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer idProducto;
	
	@Schema(description = "Nombre debe tener minimo 2 caracteres")
	@Size(min = 2, message = "Nombre debe tener minimo 2 caracteres")
	@Column(name="nombre",nullable=false,length=100)
	public String nombre;
	
	@Schema(description = "Marca debe tener minimo 2 caracteres")
	@Size(min = 2, message = "Marca debe tener minimo 2 caracteres")
	@Column(name="marca",nullable=false,length=100)
	public String marca;
	
	public Integer getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Integer idProducto) {
		this.idProducto = idProducto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

}
