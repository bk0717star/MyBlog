package cn.lsj.blog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.lsj.blog.domain.Tag;
import cn.lsj.blog.service.TagService;
import cn.lsj.blog.mapper.TagMapper;
import org.springframework.stereotype.Service;

/**
* @author lsj
* @description 针对表【t_tag】的数据库操作Service实现
* @createDate 2022-03-10 21:06:42
*/
@Service
public class TagServiceImpl extends ServiceImpl<TagMapper, Tag>
    implements TagService{

}




