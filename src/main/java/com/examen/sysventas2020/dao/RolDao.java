package com.examen.sysventas2020.dao;

import java.util.List;

import org.springframework.security.core.GrantedAuthority;

public interface RolDao {
List<GrantedAuthority> rolUser(int iduser);
}
