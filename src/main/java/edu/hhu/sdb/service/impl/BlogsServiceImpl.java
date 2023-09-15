package edu.hhu.sdb.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import edu.hhu.sdb.pojo.Blogs;
import edu.hhu.sdb.service.BlogsService;
import edu.hhu.sdb.mapper.BlogsMapper;
import org.springframework.stereotype.Service;

/**
* @author sanjin
* @description 针对表【blogs】的数据库操作Service实现
* @createDate 2023-09-15 14:39:47
*/
@Service
public class BlogsServiceImpl extends ServiceImpl<BlogsMapper, Blogs>
    implements BlogsService{

}




