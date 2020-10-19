package com.hexad.lms.model;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserGroupRepository extends JpaRepository<UserGroup, Long> {
    UserGroup findByName(String name);
}
