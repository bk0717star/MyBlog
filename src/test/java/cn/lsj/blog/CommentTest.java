package cn.lsj.blog;

import cn.lsj.blog.domain.Comment;
import cn.lsj.blog.mapper.CommentMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CommentTest {

    @Autowired
    private CommentMapper commentMapper;


    @Test
    void testSelect() {
        Comment comment = commentMapper.selectById(1497898147018575872L);
        System.out.println(comment);
    }

}
