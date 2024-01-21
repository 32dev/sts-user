package com.dev32.user.dao;

import java.util.List;

import com.dev32.user.dto.UserDTO;

public interface IDao {
	public List<UserDTO> list();
}
