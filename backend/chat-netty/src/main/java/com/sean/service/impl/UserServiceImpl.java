package com.sean.service.impl;

import com.sean.mapper.UsersMapper;
import com.sean.pojo.Users;
import com.sean.service.UserService;
import org.n3r.idworker.Sid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.io.IOException;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UsersMapper usersMapper;
    @Autowired
    private Sid sid;

    @Override
    public boolean queryUserNameIsExist(String userName) {
        Users user = new Users();
        user.setUsername(userName);
        Users result = usersMapper.selectOne(user);
        if(result != null) {
            return true;
        } else {
            return false;
        }
    }

    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public Users queryUserForLogin(String username, String pwd) {
        Example userExample = new Example(Users.class);
        Example.Criteria criteria = userExample.createCriteria();
        criteria.andEqualTo("username",username);
        criteria.andEqualTo("password",pwd);
        Users users = usersMapper.selectOneByExample(userExample);
        return users;
    }

    @Override
    public Users saveUser(Users user) {

        String userId = sid.nextShort();

        // 为每个用户生成一个唯一的二维码
//        String qrCodePath = "C://user" + userId + "qrcode.png";
//        // muxin_qrcode:[username]
//        qrCodeUtils.createQRCode(qrCodePath, "muxin_qrcode:" + user.getUsername());
//        MultipartFile qrCodeFile = FileUtils.fileToMultipart(qrCodePath);

        String qrCodeUrl = "";
        user.setQrcode(qrCodeUrl);
        user.setId(userId);
        usersMapper.insert(user);
        return user;

    }
}


