package com.bridgelabz.mygreetingapp.repository;


import com.bridgelabz.mygreetingapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IGreetingRepository extends JpaRepository<User,Integer> {

}

