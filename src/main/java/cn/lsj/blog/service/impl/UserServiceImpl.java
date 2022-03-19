package cn.lsj.blog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.lsj.blog.domain.User;
import cn.lsj.blog.service.UserService;
import cn.lsj.blog.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author lsj
* @description 针对表【t_user】的数据库操作Service实现
* @createDate 2022-03-10 22:03:10
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




