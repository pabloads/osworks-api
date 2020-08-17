package com.algaworks.osworks.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.algaworks.osworks.domain.model.Client;

@RestController
public class ClientController {
	
	@GetMapping("/clientes")
	public List<Client> list() {
		var client1 = new Client();
		client1.setId(1L);
		client1.setName("Joao");
		client1.setEmail("joao@algaworks.com");
		client1.setTelephone("77 777777777");
		var client2 = new Client();
		client1.setId(2L);
		client1.setName("Maria");
		client1.setEmail("maria@algaworks.com");
		client1.setTelephone("77 88888888888888");
		return Arrays.asList(client1, client2);
	}
}
