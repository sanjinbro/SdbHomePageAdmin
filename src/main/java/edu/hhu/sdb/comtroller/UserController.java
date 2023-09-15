package edu.hhu.sdb.comtroller;

import edu.hhu.sdb.pojo.User;
import edu.hhu.sdb.service.UserService;
import edu.hhu.sdb.utils.JwtUtils;
import edu.hhu.sdb.utils.MD5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * @author sanjin 2023-09-15 14:51
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestParam String username,
                                        @RequestParam String password) {
        // 对密码进行加密
        String encryptedPassword = MD5.encrypt(password);
        String token = userService.login(username, encryptedPassword);
        return ResponseEntity.ok(token);
    }

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestParam String username,
                                           @RequestParam String password,
                                           @RequestParam String email,
                                           @RequestParam String phone) {
        // 对密码进行加密
        String encryptedPassword = MD5.encrypt(password);
        // 检查用户名是否已存在
        if (userService.checkUsernameExist(username)) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("用户名已存在");
        }
        User user = new User();
        user.setUsername(username);
        user.setPassword(encryptedPassword);
        user.setEmail(email);
        user.setPhone(phone);
        userService.register(user);
        return ResponseEntity.status(HttpStatus.CREATED).body("注册成功");
    }

    //根据token获取用户信息，用于前端使用
    @GetMapping("/getUserInfo")
    public ResponseEntity<User> getUserInfo(HttpServletRequest request) {
        //调用jwt工具类的方法获取用户id
        String userId = JwtUtils.getUserIdByJwtToken(request);
        //查询数据库，根据用户id获取用户信息
        User user = userService.getById(userId);
        return ResponseEntity.ok(user);
    }
}
