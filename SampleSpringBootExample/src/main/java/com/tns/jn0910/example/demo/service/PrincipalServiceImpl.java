package com.tns.jn0910.example.demo.service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tns.jn0910.example.demo.entity.Principal;
import com.tns.jn0910.example.demo.repository.PrincipalRepository;

@Service
public class PrincipalServiceImpl implements PrincipalService {
	@Autowired
	PrincipalRepository repo;

	@Override
	public void addPrincipal(Principal p) {
		repo.save(p);
	}

	@Override
	public List<Principal> getAllPrincipals() {
		List<Principal> list = repo.findAll();
		return list;
	}

	@Override
	public Principal getPrincipal(String emailId) {
		// try {
		return repo.findById(emailId).get();
		// } catch (NoSuchElementException e) {
		// System.out.println("No Element Found");
		// return null;
		// }

	}

	@Override
	public void updatePrincipal(String emailId, Principal p) {
		if (repo.findById(emailId).isPresent())
			repo.save(p);

	}

	@Override
	public void deletePrincipal(String emailId) {
		repo.deleteById(emailId);

	}

}
