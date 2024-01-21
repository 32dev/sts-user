package com.dev32.board;

import org.springframework.stereotype.Service;

import com.thedeanda.lorem.LoremIpsum;

@Service
public class LoremService {
	public String getRandomName() {
		LoremIpsum loremIpsum = new LoremIpsum();
		String result = loremIpsum.getName();
		return result;
	}
}
