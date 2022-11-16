package com.juan.HibernateRelacion1aN;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Clase que representa las armas de los Personajes
 * 
 */
@Entity
@Table(name="deprtamentos")
public class Departamento {

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name="id_dpto")
	private int id_dpto;
	
	@Column(name="nombre")
	private String nombre;
	
	//La anotación mappedBy apunta a la entidad propietaria de la relación.
	//en este caso hay que fijarse el nombre que tiene en la clase personaje el objeto arma
	//que veras esto: private Arma arma;
	
	
	//CascadeType.ALL
	//Propaga todas las operaciones de una entidad, a la entidad con la que se relaciona. 
	//Es decir, que si insertamos, actualizamos o eliminamos una entidad, 
	//también se aplican estas operaciones a la entidad que se relaciona.
	//es un simil a UPDATE CASCADE, DELETE CASCADE
	
	//se podrian poner de forma individual. Aqui teneis las opciones 
	//https://www.baeldung.com/jpa-cascade-types
	
	@OneToMany(mappedBy = "empleado", cascade = CascadeType.ALL)
	private List<Empleado> empleados;
	
	public Departamento() {}
	
	public Departamento(int id_dpto, String nombre) {
		super();
		this.id_arma = id_arma;
		this.nombre = nombre;
		
	}

	public int getId() {
		return id_dpto;
	}

	public void setId(int id_dpto) {
		this.id_dpto = id_dpto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	public List<Personaje> getPersonajes() {
		return personajes;
	}
	
	public void setPersonaje(List<Personaje> personajes) {
		this.personajes = personajes;
	}
	
	
}
