package com.congco.kouga.common.param;

import com.google.common.base.Converter;
import com.congco.kouga.entity.UserDO;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.BeanUtils;

import javax.validation.constraints.NotNull;

/**
 * created on 2019/3/22 14:31
 *
 * @author qbmzc
 */
@ToString(callSuper = true)
@Setter
@Getter
public class UserDTO {

    @NotNull
    private String name;
    @NotNull
    private Integer age;


    public UserDO convertToUser() {
        UserDTOConvert userDTOConvert = new UserDTOConvert();
        return userDTOConvert.convert(this);
    }

    public UserDTO convertFor(UserDO user) {
        UserDTOConvert userDTOConvert = new UserDTOConvert();
        return userDTOConvert.reverse().convert(user);
    }

    /**
     *
     */
    private static class UserDTOConvert extends Converter<UserDTO, UserDO> {
        @Override
        protected UserDO doForward(UserDTO userDTO) {
            UserDO user = new UserDO();
            BeanUtils.copyProperties(userDTO, user);
            return user;
        }

        @Override
        protected UserDTO doBackward(UserDO user) {
            UserDTO userDTO = new UserDTO();
            BeanUtils.copyProperties(user, userDTO);
            return userDTO;
        }
    }
}
