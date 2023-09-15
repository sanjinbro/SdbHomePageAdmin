package edu.hhu.sdb.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import edu.hhu.sdb.pojo.User;
import edu.hhu.sdb.service.UserService;
import edu.hhu.sdb.mapper.UserMapper;
import edu.hhu.sdb.utils.JwtUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* @author sanjin
* @description 针对表【user】的数据库操作Service实现
* @createDate 2023-09-15 14:54:53
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService{

    @Autowired
    private UserMapper userMapper;

    public String login(String username, String password) {
        User user = userMapper.findByUsername(username);
        // 判断对象是否为空
        if (user == null) {
            return "该用户不存在！";
        }
        // 判断密码是否一致
        if (!user.getPassword().equals(password)) {
            return "用户名或密码错误！";
        }
        String jwtToken = JwtUtils.getJwtToken(user.getId(), user.getUsername());
        return jwtToken;
    }

    public void register(User user) {
        userMapper.insert(user);
    }

    public boolean checkUsernameExist(String username) {
        User user = userMapper.findByUsername(username);
        return user != null;
    }

}




