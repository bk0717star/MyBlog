package cn.lsj.blog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.lsj.blog.domain.ArticleBody;
import cn.lsj.blog.service.ArticleBodyService;
import cn.lsj.blog.mapper.ArticleBodyMapper;
import org.springframework.stereotype.Service;

/**
* @author lsj
* @description 针对表【t_article_body】的数据库操作Service实现
* @createDate 2022-03-10 22:02:59
*/
@Service
public class ArticleBodyServiceImpl extends ServiceImpl<ArticleBodyMapper, ArticleBody>
    implements ArticleBodyService{

}




