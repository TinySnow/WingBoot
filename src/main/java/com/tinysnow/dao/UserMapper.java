package com.tinysnow.dao;

import com.tinysnow.bean.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author ilitt
 */
@Repository
public interface UserMapper {
    /**
     * 插入用户
     * @param email 用户邮箱
     * @param username 用户账户名
     * @param password 用户密码
     */
    void insertUser(@Param("username") String username,
                    @Param("password") String password,
                    @Param("email") String email);

    /**
     * 依据用户名查询信息
     * @param username 查询的用户名
     * @return 返回一个 JavaBean 对象进行后续操作
     */
    User selectOneUserByUserName(String username);

    /**
     * 更新密码
     * @param id 用户 id
     * @param newPassword 新密码
     */
    void updatePassword(@Param("id") int id,
                        @Param("newPassword") String newPassword);

    /**
     * 根据 id 查询，应该多用在测试里面
     * @param id 用户 id
     * @return 返回一个 JavaBean 对象进行后续操作
     */
    User selectOneUserById(int id);
}
