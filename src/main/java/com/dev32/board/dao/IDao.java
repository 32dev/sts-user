package com.dev32.board.dao;

import java.util.List;

import com.dev32.board.dto.UserDTO;

public interface IDao {
	public List<UserDTO> list();
}
