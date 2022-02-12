package com.example.test.db.repository;

import com.example.test.db.entity.LoginInfoEntity;
import com.example.test.dto.LoginInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginInfoRepository extends JpaRepository<LoginInfoEntity,Long> {
}
