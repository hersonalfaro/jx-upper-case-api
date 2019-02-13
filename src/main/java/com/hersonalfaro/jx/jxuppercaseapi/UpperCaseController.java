package com.hersonalfaro.jx.jxuppercaseapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UpperCaseController {

	@GetMapping("/uppercase")
	public String upperCase(@RequestParam(value="value", defaultValue="") String value) {
		
		return value.toUpperCase();
		
	}
}
