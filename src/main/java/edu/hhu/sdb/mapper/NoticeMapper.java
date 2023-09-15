package edu.hhu.sdb.mapper;

import edu.hhu.sdb.pojo.Notice;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author sanjin
* @description 针对表【notice】的数据库操作Mapper
* @createDate 2023-09-15 14:40:06
* @Entity edu.hhu.sdb.pojo.Notice
*/
@Mapper
public interface NoticeMapper extends BaseMapper<Notice> {

}




