package com.klef.jenkins.dao;

import com.klef.jenkins.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataDao extends JpaRepository<User, Long> {
}