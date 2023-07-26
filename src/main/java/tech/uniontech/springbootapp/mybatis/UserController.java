// https://zhuanlan.zhihu.com/p/160901686

package tech.uniontech.springbootapp.mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import tech.uniontech.springbootapp.mybatis.mapper.UserMapper;

@RestController
public class UserController {

  @Autowired
  private UserMapper userMapper;
  /**	
   *	查询所有用户信息
   */
  @GetMapping("/hello")
  public List<User>	hello()	{
      List<User>	users = userMapper.selectUserList();
      return	users;
  }
}

