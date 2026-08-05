package com.qsp.controller;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qsp.dtos.ApiResponse;
import com.qsp.dtos.DemoDto;

@RestController
public class DemoController {
	@GetMapping("/string")
	public ApiResponse getApi() {
		return new ApiResponse(true, "string", "Hello Data");
		/*-
		 * {
		"status": true,
		"type": "string",
		"payload": "Hello Data"
		}
		 */
	}

	@GetMapping("/array")
	public ApiResponse getArray() {
		return new ApiResponse(true, "array", new int[] { 1, 2, 3, 4, 5, 6 });
	}

	@GetMapping("/collection")
	public ApiResponse getCollection() {
		return new ApiResponse(true, "array", List.of(2, 3, 5, 6, 7));
	}

	@GetMapping("/map")
	public ApiResponse getMap() {
		Map<String, Integer> map = Map.of("one", 1, "two", 2, "three", 3);
		return new ApiResponse(true, "object", map);
	}

	@GetMapping("/dto")
	public ApiResponse getdto() {
		DemoDto dto = new DemoDto(17, "Nothing ever goes planned in this acursed world");
		return new ApiResponse(true, "object", dto);
		/*-
		 * { "status": true, 
		 * "type": "object", 
		 * "payload": { 
		 * 		"idata": 17, 
		 * 		"sdata": "Nothing ever goes planned in this acursed world" } }
		 */
	}
}
