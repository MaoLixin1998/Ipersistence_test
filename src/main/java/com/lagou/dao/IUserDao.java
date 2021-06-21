package com.lagou.dao;

import com.lagou.pojo.User;

import java.util.List;

/**
 * @ClassName IUserDao
 * @Description TODO
 * @Author mao
 * @Data 2021/6/21 9:46
 **/
public interface IUserDao {
    /**
     * 查询所有用户
     * @return
     */
    public List<User> findAll() throws Exception;


    /**
     * 根据所有用户查询
     */
    public User findByCondition(User user) throws Exception;

}
