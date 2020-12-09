package com.examen.sysventas2020;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.examen.sysventas2020.dao.UsuarioDao;

@SpringBootTest
class Sysventas2020ApplicationTests {
@Autowired
private UsuarioDao udao;
	@Test
	void contextLoads() {
System.out.println(udao.validarUsuario("dreyna"));
	}

}
