package cn.lsj.blog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.lsj.blog.domain.ArticleTag;
import cn.lsj.blog.service.ArticleTagService;
import cn.lsj.blog.mapper.ArticleTagMapper;
import org.springframework.stereotype.Service;

/**
* @author lsj
* @description 针对表【t_article_tag】的数据库操作Service实现
* @createDate 2022-03-10 22:03:03
*/
@Service
public class ArticleTagServiceImpl extends ServiceImpl<ArticleTagMapper, ArticleTag>
    implements ArticleTagService{

}




