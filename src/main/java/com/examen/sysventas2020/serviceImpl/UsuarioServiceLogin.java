package com.examen.sysventas2020.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.examen.sysventas2020.dao.RolDao;
import com.examen.sysventas2020.dao.UsuarioDao;
import com.examen.sysventas2020.entity.Usuario;

@Service("userService")
public class UsuarioServiceLogin implements UserDetailsService{
@Autowired
private UsuarioDao usuarioDao;
@Autowired
private RolDao rolDao;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Usuario usuario = usuarioDao.validarUsuario(username);
		return new User(usuario.getUsername(), usuario.getPassword(), rolDao.rolUser(usuario.getIdusuario()));
	}

}
