package com.congco.kouga.service;

import com.congco.kouga.entity.UserDO;

import java.util.List;

/**
 * created on 2019/3/22 14:14
 *
 * @author qbmzc
 */
public interface UserService {

    /**
     * 根据id查询单个记录
     * @param id 主键id
     * @return 实体类
     */
    UserDO queryById(Long id);

    /**
     * 保存
     * @param userDO 实体类对象
     * @return 操作影响
     */
    Integer save(UserDO userDO);

    /**
     * 删除
     * @param id
     * @return 操作影响
     */
    Integer deleteById(Long id);

    /**
     * 分页查询所有
     * @param pageNum 页码
     * @param pageSize 每页多少
     * @return user集合
     */
    List<UserDO> queryAll(Integer pageNum,Integer pageSize);
}
