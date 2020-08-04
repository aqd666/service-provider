package cn.jiyun.service.service;

import cn.jiyun.service.mapper.UserMapper;
import cn.jiyun.service.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
     UserMapper userMapper;


    public User queryUserById(Long id){

        return userMapper.selectByPrimaryKey(id);

    }



}
