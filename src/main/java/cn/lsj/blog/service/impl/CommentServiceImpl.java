package cn.lsj.blog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.lsj.blog.domain.Comment;
import cn.lsj.blog.service.CommentService;
import cn.lsj.blog.mapper.CommentMapper;
import org.springframework.stereotype.Service;

/**
* @author lsj
* @description 针对表【t_comment】的数据库操作Service实现
* @createDate 2022-03-10 21:25:20
*/
@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment>
    implements CommentService{

}




