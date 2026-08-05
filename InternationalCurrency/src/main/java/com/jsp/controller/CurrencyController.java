package com.jsp.controller;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/currency")
public class CurrencyController {
	@GetMapping("/today")
	public ResponseEntity<Map<String, Integer>> getConversion() {
		Map<String, Integer> currency = Map.of("India", 94, "UK", 1, "Singapore", 3);
		return new ResponseEntity<Map<String, Integer>>(currency, HttpStatus.OK);
	}
}
