package com.tinysnow.mappers;

import com.tinysnow.bean.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

/**
 * @author TinySnow
 */
@Component
public interface UserMapper {

    /**
     * 查询密码
     * @param username 用户名
     * @return 返回密码，在 service 层进行比较
     */
    User checkPwd(String username);

    /**
     * 插入用户
     * @param username 用户账户名
     * @param password 用户密码
     * @param email 用户邮箱
     * @return 返回用户
     */
    User insertUser(@Param("username") String username,
                    @Param("password") String password,
                    @Param("email") String email);

    /**
     * 依据用户名查询信息
     * @param username 查询的用户名
     * @return 返回一个 JavaBean 对象进行后续操作
     */
    User selectOneUserByUsername(String username);

    /**
     * 更新密码
     * @param id 用户 id
     * @param newPassword 新密码
     * @return 返回用户
     */
    User updatePwd(@Param("id") int id,
                   @Param("newPassword") String newPassword);

    /**
     * 根据 id 查询，应该多用在测试里面
     * @param id 用户 id
     * @return 返回一个 JavaBean 对象进行后续操作
     */
    User selectOneUserById(int id);
}
