package com.congco.kouga.dao;

import com.congco.kouga.entity.UserDO;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * created on 2019/3/22 14:13
 *
 * @author qbmzc
 */
public interface UserRepository extends JpaRepository<UserDO, Long> {
}
