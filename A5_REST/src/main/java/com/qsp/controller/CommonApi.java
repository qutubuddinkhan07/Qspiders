package com.qsp.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/common") // common base url
public class CommonApi {
	@GetMapping
	public String getApi() {
		return "get";
	}

	@PostMapping
	public String postApi() {
		return "post";
	}

	@PutMapping
	public String putApi() {
		return "put";
	}

	@DeleteMapping
	public String deleteApi() {
		return "delete";
	}
}
