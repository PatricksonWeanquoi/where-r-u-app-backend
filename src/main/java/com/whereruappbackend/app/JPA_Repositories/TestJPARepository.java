package com.whereruappbackend.app.JPA_Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.whereruappbackend.app.SQLTables.Test;

@Repository
public interface TestJPARepository extends JpaRepository<Test, String> {

}
