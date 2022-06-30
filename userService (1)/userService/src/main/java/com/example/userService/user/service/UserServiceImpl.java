package com.example.userService.user.service;

import com.example.userService.user.model.UserDto;
import com.example.userService.user.repository.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserMapper userMapper;
    @Override
    public List<UserDto> findUser() {
        return userMapper.getUser();
    }

    @Override
    public UserDto findUserById(UserDto userDto) {
        return userMapper.getUserById(userDto);
    }

    @Override
    public Integer insertUser(UserDto userDto) {
      return userMapper.insertUser(userDto);

    }

    @Override
    public Integer deleteUser(UserDto userDto){
        return userMapper.deleteUser(userDto);
    }

    @Override
    public Integer updateUserById(UserDto userDto){return userMapper.updateUserById(userDto);}

    @Override
    public UserDto login(UserDto userDto) {
        return userMapper.getUserByUserIdAndPassword(userDto);
    }


}
