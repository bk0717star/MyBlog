package cn.lsj.blog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.lsj.blog.domain.Message;
import cn.lsj.blog.service.MessageService;
import cn.lsj.blog.mapper.MessageMapper;
import org.springframework.stereotype.Service;

/**
* @author lsj
* @description 针对表【t_message】的数据库操作Service实现
* @createDate 2022-03-10 21:25:46
*/
@Service
public class MessageServiceImpl extends ServiceImpl<MessageMapper, Message>
    implements MessageService{

}




