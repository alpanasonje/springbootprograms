package com.tns.jn0910.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tns.jn0910.example.demo.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Integer> {

}
