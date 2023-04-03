package com.nttdata.demo.repository;

import com.nttdata.demo.entity.UsrDro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository("UserRepository")
public interface UserRepository extends JpaRepository<UsrDro, Serializable> {


}
