package com.msb.dongbao.ums.service.impl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.msb.dongbao.ums.UmsMemberService;
import com.msb.dongbao.ums.entity.UmsMember;
import com.msb.dongbao.ums.mapper.UmsMemberMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 后台用户表 服务实现类
 * </p>
 *
 * @author oldfish007
 * @since 2022-01-09
 */
@Service
public class UmsMemberServiceImpl  implements UmsMemberService {

    @Autowired
    UmsMemberMapper umsMemberMapper;
    public String register(){
        UmsMember u = new UmsMember();
        u.setNickName("c");
        umsMemberMapper.insert(u);
        return "success";
    }
}
