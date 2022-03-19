package cn.lsj.blog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.lsj.blog.domain.Article;
import cn.lsj.blog.service.ArticleService;
import cn.lsj.blog.mapper.ArticleMapper;
import org.springframework.stereotype.Service;

/**
* @author lsj
* @description 针对表【t_article】的数据库操作Service实现
* @createDate 2022-03-10 22:02:54
*/
@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article>
    implements ArticleService{

}




