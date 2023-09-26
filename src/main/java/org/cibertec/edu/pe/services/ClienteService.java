package org.cibertec.edu.pe.services;

import java.util.List;

import org.cibertec.edu.pe.entity.Cliente;
import org.cibertec.edu.pe.interfaceServices.IClienteService;
import org.cibertec.edu.pe.interfaces.ICliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService implements IClienteService{
	
	@Autowired
	private ICliente cli;
	
	@Override
	public List<Cliente> Listado() {
		// TODO Auto-generated method stub
		return (List<Cliente>)cli.findAll();
	}

	@Override
	public int Crear(Cliente ObjC) {
		// TODO Auto-generated method stub
		int fl = 0;
		Cliente c = cli.save(ObjC);
		if(!c.equals(null))
			fl = 1;
		return fl;
	}

}
