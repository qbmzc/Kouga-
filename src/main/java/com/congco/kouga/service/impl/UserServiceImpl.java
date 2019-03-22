package com.congco.kouga.service.impl;

import com.congco.kouga.common.param.UserDTO;
import com.congco.kouga.dao.UserRepository;
import com.congco.kouga.entity.UserDO;
import com.congco.kouga.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

/**
 * created on 2019/3/22 14:14
 *
 * @author qbmzc
 */
@Service
@Transactional(rollbackOn = Exception.class)
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;
    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDO queryById(Long id) {
        Optional<UserDO> optionalUserDO = this.userRepository.findById(id);
        UserDO userDO = optionalUserDO.get();
        return userDO;
    }

    @Override
    public Integer save(UserDTO userDTO) {
        return null;
    }

    @Override
    public Integer deleteById(Long id) {
        return null;
    }

    @Override
    public List<UserDTO> queryAll(Integer pageNum, Integer pageSize) {
        return null;
    }
}
