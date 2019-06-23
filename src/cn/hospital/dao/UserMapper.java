package cn.hospital.dao;

import cn.hospital.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    //查
    List<User> selectUserList();
    //增
    int addUser(User user);
    //修改
    int updateUser(User user);
    //删除
    int deleteUser(@Param("id") int id);



}
