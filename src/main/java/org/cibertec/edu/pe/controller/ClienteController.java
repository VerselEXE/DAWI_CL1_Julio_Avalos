package org.cibertec.edu.pe.controller;

import java.util.List;

import org.cibertec.edu.pe.entity.Cliente;
import org.cibertec.edu.pe.interfaceServices.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ClienteController {
	@Autowired IClienteService servicio;
	
	@GetMapping("/listar")
	public String listar(Model m) {
		List<Cliente> lista = servicio.Listado();
		m.addAttribute("clientes",lista);
		return "listar";
	}
	
	@GetMapping("/crear")
	public String crear(Model m) {
		m.addAttribute("cliente", new Cliente());
		return "crear";
	}
	
	@PostMapping("/grabar")
	public String grabar(Cliente c, Model m) {
		servicio.Crear(c);
		return "redirect:/listar";
	}
}
