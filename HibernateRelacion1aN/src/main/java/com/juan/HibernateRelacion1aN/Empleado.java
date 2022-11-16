package com.juan.HibernateRelacion1aN;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Clase que mapea un objeto Personaje con la tabla de MySQL correspondiente, utilizando anotaciones

 */
@Entity
@Table(name="empleado")
public class Empleado implements Serializable {

	@Id					// Marca el campo como la clave de la tabla
	@GeneratedValue(strategy = IDENTITY)
	@Column(name="id_empleado")  // Opcional si coinciden atributo y columna. 
						// Indica la columna de la tabla que corresponde con este atributo
	private int id_empleado;
	
	@Column(name="nombre_empleado")
	private String nombre;
	

	
	@ManyToOne
	@JoinColumn(name="id_dpto",referencedColumnName="id_dpto")
	private Departamento departamento;
	
	// Constructor vacío. Hibernate puede mostrar algún error si no está implementado
	public Empleado() {}
	
	public Empleado(int id_dpto, String nombre, Departamento departamento) {
		this.nombre_empleado = nombre_empleado;
		this.nombre = nombre;
	
	}
	
	
	public int getId() {
		return id_empleado;
	}
	
	public void setId(int id_empleado) {
		this.id_empleado = id_empleado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	public Departamento getDepartamento() {
		return departamento;
	}
	

	public void setDepartamento(Departamento epartamento) {
		this.departamento = departamento;
	}

	@Override
	public String toString() {
		return "Empleado [id=" + id_empleado + ", nombre=" + nombre "]";
	}
	
	
}
