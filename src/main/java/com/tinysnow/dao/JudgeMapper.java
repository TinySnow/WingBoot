package com.tinysnow.dao;

import com.tinysnow.bean.Judge;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author TinySnow
 */
@Repository
public interface JudgeMapper {
    /**
     * 评委只需要登录查询密码就可以了，用户名都是分配好了的
     * @param projectId 插入的评委是哪一项目的，保险起见加的参数
     * @param judgeName 查询的用户名
     * @return 返回 JudgeBean 对象
     */
    Judge checkPwd(@Param("projectId") int projectId,
                   @Param("judgeName") String judgeName);

    /**
     * 更改评委名字，一般是投票项目创建者在信息管理页面调用此方法
     * @param projectId 插入的评委是哪一项目的，保险起见加的参数
     * @param judgeName 需要更改的评委目前的用户名
     */
    void changeUsername(@Param("projectId") int projectId,
                        @Param("judgeName") String judgeName);

    /**
     * 更改评委密码，一般是投票项目创建者在信息管理页面调用此方法
     * @param projectId 插入的评委是哪一项目的，保险起见加的参数
     * @param judgeName 需要更改的评委目前的用密码
     * @return 返回 JudgeBean 对象
     */
    Judge changePwd(@Param("projectId") int projectId,
                    @Param("judgeName") String judgeName);

    /**
     * 插入新评委，后期可能修改此方法，因为要加上权限管理
     * @param projectId 插入的评委是哪一项目的，保险起见加的参数
     * @param judgeName 插入评委的用户名
     * @param judgePwd 插入评委的密码
     */
    void insertJudge(@Param("projectId") int projectId,
            @Param("judgeName") String judgeName,
            @Param("judgePwd") String judgePwd);

    /**
     * 删除现有的评委，后期可能修改此方法，因为需要同时删除权限
     * 但是既然查询不到这个评委了，或许就没有投票权限了
     * 由此可以判定或许也可以不用删除权限，后期再说吧
     * @param projectId 插入的评委是哪一项目的，保险起见加的参数
     * @param judgeName 需要删除的评委的用户名
     */
    void deleteJudge(@Param("projectId") int projectId,
                     @Param("judgeName") String judgeName);
}
