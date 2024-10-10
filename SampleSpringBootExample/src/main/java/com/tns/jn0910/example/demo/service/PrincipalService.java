package com.tns.jn0910.example.demo.service;

import java.util.List;

import com.tns.jn0910.example.demo.entity.Principal;

public interface PrincipalService {
	void addPrincipal(Principal p);
	List<Principal> getAllPrincipals();
	Principal getPrincipal(String emailId);
	void updatePrincipal(String emailId, Principal p);
	void deletePrincipal(String emailId);
}
