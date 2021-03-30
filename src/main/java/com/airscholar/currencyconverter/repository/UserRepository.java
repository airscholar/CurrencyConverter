package com.airscholar.currencyconverter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.airscholar.currencyconverter.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
