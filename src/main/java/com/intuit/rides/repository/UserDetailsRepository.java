package com.intuit.rides.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserDetailsRepository extends JpaRepository<UserTable,Integer> {
    public List<UserTable> findByUserName(String userName);
}
