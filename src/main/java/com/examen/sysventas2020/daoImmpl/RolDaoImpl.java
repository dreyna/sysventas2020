package com.examen.sysventas2020.daoImmpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Repository;
import com.examen.sysventas2020.dao.RolDao;
import com.examen.sysventas2020.entity.Rol;

@Repository
public class RolDaoImpl implements RolDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public List<GrantedAuthority> rolUser(int iduser) {
		List<GrantedAuthority> authoritys = new ArrayList<GrantedAuthority>();
		String SQL = "SELECT r.idrol, r.nombre FROM usuarios u " + 
				"INNER JOIN usuarios_roles ur ON u.idusuario=ur.idusuario " + 
				"INNER JOIN roles r ON r.idrol=ur.idrol " + 
				"WHERE u.idusuario = ?";
		List<Rol> roles = jdbcTemplate.query(SQL,  new Object[] {iduser}, new BeanPropertyRowMapper<Rol>(Rol.class));
		for(int i=0;i<roles.size();i++) {
			authoritys.add(new SimpleGrantedAuthority(roles.get(i).getNombre()));
		}		
		return authoritys;
	}

}
