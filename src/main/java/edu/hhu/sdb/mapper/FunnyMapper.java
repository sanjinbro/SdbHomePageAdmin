package edu.hhu.sdb.mapper;

import edu.hhu.sdb.pojo.Funny;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author sanjin
* @description 针对表【funny】的数据库操作Mapper
* @createDate 2023-09-15 14:39:58
* @Entity edu.hhu.sdb.pojo.Funny
*/
@Mapper
public interface FunnyMapper extends BaseMapper<Funny> {

}




