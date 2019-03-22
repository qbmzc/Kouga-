package com.congco.kouga.entity.base;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 * created on 2019/3/22 11:43
 *
 * @author qbmzc
 */
@Setter
@Getter
public abstract class BaseDO implements Serializable {

    private static final long serialVersionUID = 4196980234335942041L;
    /**
     * id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    /**
     * gmt代表格林尼治时间
     *
     * 创建时间
     */
    private Date createTime;
    /**
     * 修改时间
     */
    private Date updateTime;
}
