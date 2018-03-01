package com.gaussic.repository;
/*
 * Author  : Nabryant
   Time    : 2018/3/1 
   Function: 
 */

import com.gaussic.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository <UserEntity, Integer>{


}
