package com.org.prj.security.oauth2.service;

import org.springframework.stereotype.Service;

@Service
public class DefaultOAuth2SecuritySerice implements OAuth2SecuritySerice{

	@Override
	public String testSecurity() {
		// TODO Auto-generated method stub
		return "Security Test Successful";
	}

}
