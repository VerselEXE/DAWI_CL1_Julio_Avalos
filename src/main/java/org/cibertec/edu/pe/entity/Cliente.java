package org.cibertec.edu.pe.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cliente")
public class Cliente {
	@Id
	int idcliente;
	String nombre;
	String apellido;
	String correo;
	Date fechanacimiento;
	String dni;
	int idcategoria;
	
	public Cliente() {
	}

	public Cliente(int idcliente, String nombre, String apellido, String correo, Date fechanacimiento, String dni,
			int idcategoria) {
		this.idcliente = idcliente;
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo;
		this.fechanacimiento = fechanacimiento;
		this.dni = dni;
		this.idcategoria = idcategoria;
	}

	public int getIdcliente() {
		return idcliente;
	}

	public void setIdcliente(int idcliente) {
		this.idcliente = idcliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public Date getFechanacimiento() {
		return fechanacimiento;
	}

	public void setFechanacimiento(Date fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getIdcategoria() {
		return idcategoria;
	}

	public void setIdcategoria(int idcategoria) {
		this.idcategoria = idcategoria;
	}		
}
