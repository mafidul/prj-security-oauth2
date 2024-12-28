package com.org.prj.security.oauth2.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.prj.security.oauth2.service.OAuth2SecuritySerice;

@RestController
public class OAuth2SecurityApi {

	
	
	@Autowired
	OAuth2SecuritySerice aAuth2SecuritySerice;
	
	
	@GetMapping("/security/")
	public String security() {
		return aAuth2SecuritySerice.testSecurity();
	}
}
