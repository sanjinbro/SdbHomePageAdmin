package edu.hhu.sdb.mapper;

import edu.hhu.sdb.pojo.Blogs;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author sanjin
* @description 针对表【blogs】的数据库操作Mapper
* @createDate 2023-09-15 14:39:47
* @Entity edu.hhu.sdb.pojo.Blogs
*/
@Mapper
public interface BlogsMapper extends BaseMapper<Blogs> {

}




