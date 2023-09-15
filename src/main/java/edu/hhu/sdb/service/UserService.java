package edu.hhu.sdb.service;

import edu.hhu.sdb.pojo.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author sanjin
* @description 针对表【user】的数据库操作Service
* @createDate 2023-09-15 14:54:53
*/
public interface UserService extends IService<User> {
    String login(String username, String password);

    void register(User user);

    boolean checkUsernameExist(String username);
}
