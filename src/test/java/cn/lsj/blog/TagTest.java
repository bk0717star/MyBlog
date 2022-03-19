package cn.lsj.blog;


import cn.lsj.blog.domain.Tag;
import cn.lsj.blog.mapper.TagMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TagTest {

    @Autowired
    private TagMapper tagMapper;

    @Test
    void testSelect() {
        Tag tag = tagMapper.selectById(7);
        System.out.println(tag);
    }

}
