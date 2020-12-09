package com.examen.sysventas2020.daoImmpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.examen.sysventas2020.dao.PersonaDao;
import com.examen.sysventas2020.entity.Persona;
@Repository
public class PersonaDaoImpl implements PersonaDao{
@Autowired
private JdbcTemplate jdbcTemplate;
	@Override
	public Persona read(int idpersona) {
		String SQL ="select *from personas where idpersona=?";
		return jdbcTemplate.queryForObject(SQL, new Object[] {idpersona}, new BeanPropertyRowMapper<Persona>(Persona.class));
	}

}
