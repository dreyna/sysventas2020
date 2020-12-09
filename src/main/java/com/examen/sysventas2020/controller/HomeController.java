package com.examen.sysventas2020.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/")
	String mensaje() {
		return "Hola";
	}
}
