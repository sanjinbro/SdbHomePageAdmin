package edu.hhu.sdb.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import edu.hhu.sdb.pojo.Notice;
import edu.hhu.sdb.service.NoticeService;
import edu.hhu.sdb.mapper.NoticeMapper;
import org.springframework.stereotype.Service;

/**
* @author sanjin
* @description 针对表【notice】的数据库操作Service实现
* @createDate 2023-09-15 14:40:06
*/
@Service
public class NoticeServiceImpl extends ServiceImpl<NoticeMapper, Notice>
    implements NoticeService{

}




