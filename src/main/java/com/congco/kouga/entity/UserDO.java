package com.congco.kouga.entity;

import com.congco.kouga.entity.base.BaseDO;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * created on 2019/3/22 11:39
 *
 * @author qbmzc
 */
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "user")
@Data
public class UserDO extends BaseDO {

    private static final long serialVersionUID = 7997470429158085L;

    @Column(name = "name",length = 20)
    private String name;

    @Column(name = "age")
    private Integer age;

}
