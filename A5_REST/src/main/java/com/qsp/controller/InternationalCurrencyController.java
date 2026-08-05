package com.qsp.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qsp.dtos.ApiResponse;
import com.qsp.service.InternationalCurrencyService;

@RestController
@RequestMapping("/currency")
public class InternationalCurrencyController {
	@Autowired
	private InternationalCurrencyService intelService;

	@GetMapping
	public ResponseEntity<ApiResponse> getIntelCurrency() {
		Map<String, Integer> serviceResponse = intelService.interCurrencyService();
		ApiResponse apiResponse = new ApiResponse(true, "object", serviceResponse);
		return new ResponseEntity<ApiResponse>(apiResponse, HttpStatus.OK);
	}
}
