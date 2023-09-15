package edu.hhu.sdb.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import edu.hhu.sdb.pojo.Funny;
import edu.hhu.sdb.service.FunnyService;
import edu.hhu.sdb.mapper.FunnyMapper;
import org.springframework.stereotype.Service;

/**
* @author sanjin
* @description 针对表【funny】的数据库操作Service实现
* @createDate 2023-09-15 14:39:58
*/
@Service
public class FunnyServiceImpl extends ServiceImpl<FunnyMapper, Funny>
    implements FunnyService{

}




