package com.examen.sysventas2020.daoImmpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.examen.sysventas2020.dao.UsuarioDao;
import com.examen.sysventas2020.entity.Usuario;
@Repository
public class UsuarioDaoImpl implements UsuarioDao{
@Autowired
private JdbcTemplate jdbcTemplate;
	@Override
	public Usuario validarUsuario(String username) {
		String SQL = "select *from usuarios where username=?";
		return jdbcTemplate.queryForObject(SQL, new Object[] {username}, new BeanPropertyRowMapper<Usuario>(Usuario.class));
	}

}
