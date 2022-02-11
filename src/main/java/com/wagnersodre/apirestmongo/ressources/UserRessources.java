package com.wagnersodre.apirestmongo.ressources;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wagnersodre.apirestmongo.domain.User;
import com.wagnersodre.apirestmongo.dto.UserDTO;
import com.wagnersodre.apirestmongo.service.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserRessources {

	@Autowired
	private UserService service;

	@RequestMapping(method = RequestMethod.GET)
	/* @GetMapping */
	public ResponseEntity<List<UserDTO>> findAll() {
		List<User> list = service.findAll();
		List<UserDTO> listDTO = list.stream().map(x -> new UserDTO(x)).collect(Collectors.toList());
		return ResponseEntity.ok().body(listDTO);

	}

}
