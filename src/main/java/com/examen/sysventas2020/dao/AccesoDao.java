package com.examen.sysventas2020.dao;

import java.util.List;
import java.util.Map;

public interface AccesoDao {
	List<Map<String, Object>> read(int id);
}
