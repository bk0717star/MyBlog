package cn.lsj.blog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.lsj.blog.domain.Category;
import cn.lsj.blog.service.CategoryService;
import cn.lsj.blog.mapper.CategoryMapper;
import org.springframework.stereotype.Service;

/**
* @author lsj
* @description 针对表【t_category】的数据库操作Service实现
* @createDate 2022-03-10 20:42:35
*/
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category>
    implements CategoryService{

}




