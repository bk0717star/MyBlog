package cn.lsj.blog;

import cn.lsj.blog.domain.Message;
import cn.lsj.blog.mapper.MessageMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MessageTest {

    @Autowired
    private MessageMapper messageMapper;

    @Test
    void testSelect() {
        Message message = messageMapper.selectById(1497901802824273920L);
        System.out.println(message);
    }

}
