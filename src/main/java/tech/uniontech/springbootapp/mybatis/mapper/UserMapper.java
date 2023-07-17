package tech.uniontech.springbootapp.mybatis.mapper;

import java.util.List;
import tech.uniontech.springbootapp.mybatis.User;

public interface UserMapper {
    public List<User> selectUserList();
}
