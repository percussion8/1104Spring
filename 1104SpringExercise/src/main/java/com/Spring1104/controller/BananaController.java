package com.Spring1104.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
@RequestMapping("/banana/*")
public class BananaController {
	@GetMapping("/all")
	public void allBanana(Model model) {
		
	}
	
	@GetMapping("/newba")
	public void newBanana() {
		
	}
	
}
