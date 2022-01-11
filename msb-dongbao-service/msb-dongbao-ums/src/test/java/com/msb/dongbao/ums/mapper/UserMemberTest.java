package com.msb.dongbao.ums.mapper;

import com.msb.dongbao.ums.entity.UmsMember;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = com.msb.dongbao.ums.MsbDongbaoUmsApplication.class)
public class UserMemberTest {

    @Autowired
    UmsMemberMapper umsMemberMapper;
    @Test
    void testInsert(){
        UmsMember t = new UmsMember();
        t.setEmail("466403678@qq.com");
        t.setUsername("cpf2");
        t.setStatus(0);
        t.setPassword("1");
        t.setNote("note");
        t.setNickName("nick");
        umsMemberMapper.insert(t);
    }

    @Test
    void testUpdate(){
        UmsMember t = new UmsMember();
        t.setId(63L);
        umsMemberMapper.updateById(t);
    }
}
