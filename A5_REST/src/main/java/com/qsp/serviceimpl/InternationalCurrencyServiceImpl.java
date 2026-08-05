package com.qsp.serviceimpl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.qsp.service.InternationalCurrencyService;

@Service
public class InternationalCurrencyServiceImpl implements InternationalCurrencyService {
	@Value("${external.service.intelCurrency.url}")
	String intelUrl;

	@Autowired
	RestTemplate restTemplate;

	@Override
	public Map<String, Integer> interCurrencyService() {
		ResponseEntity<Map<String, Integer>> externalResponse = restTemplate.exchange(intelUrl, HttpMethod.GET, null,
				new ParameterizedTypeReference<Map<String, Integer>>() {
				});
		Map<String, Integer> response = externalResponse.getBody();

		return response;
	}

}
