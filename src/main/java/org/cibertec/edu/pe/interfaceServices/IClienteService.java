package org.cibertec.edu.pe.interfaceServices;

import java.util.List;

import org.cibertec.edu.pe.entity.Cliente;

public interface IClienteService {
	public List<Cliente> Listado();
	public int Crear(Cliente ObjC);
}
