package edu.hhu.sdb.mapper;

import edu.hhu.sdb.pojo.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
* @author sanjin
* @description 针对表【user】的数据库操作Mapper
* @createDate 2023-09-15 14:54:53
* @Entity edu.hhu.sdb.pojo.User
*/
@Mapper
public interface UserMapper extends BaseMapper<User> {
    @Select("SELECT * FROM user WHERE username = #{username}")
    User findByUsername(String username);
}




