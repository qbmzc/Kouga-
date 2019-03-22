package com.congco.kouga.controller;

import com.congco.kouga.common.param.UserDTO;
import com.congco.kouga.entity.UserDO;
import com.congco.kouga.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * created on 2019/3/22 14:30
 *
 * @author qbmzc
 */
@RestController
@RequestMapping("user")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }


    /**
     * 保存
     * @param userDTO
     */
    @PostMapping
    public void save(@Valid UserDTO userDTO){
        UserDO userDO = userDTO.convertToUser();
        Integer save = this.userService.save(userDO);
        if (1==save){

        }
    }

    /**
     * 查询
     *
     * @param id
     * @return
     */
    @GetMapping
    public UserDTO getById(@RequestParam Long id) {
        UserDO userDO = this.userService.queryById(id);
        UserDTO userDTO = new UserDTO().convertFor(userDO);
        return userDTO;
    }
}
