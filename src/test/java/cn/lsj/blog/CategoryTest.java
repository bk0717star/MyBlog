package cn.lsj.blog;

import cn.lsj.blog.domain.Category;
import cn.lsj.blog.mapper.CategoryMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CategoryTest {

    @Autowired
    private CategoryMapper categoryMapper;

    @Test
    void testSelect() {
        Category category = categoryMapper.selectById(1);
        System.out.println(category);
    }



}
