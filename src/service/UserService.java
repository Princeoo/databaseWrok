package service;

import domain.User;

import java.util.List;

public interface UserService {

    /**
     * 检查管理员信息
     * @param user
     * @return
     */
    boolean checkUser(User user);

    /**
     * 添加用户信息
     * @param user
     * @return
     */
    boolean addUser(User user);

    /**
     * 查询所有用户信息
     * @return
     */
    List<User> findAllUser();

    /**
     * 根据账户查询用户信息
     * @return
     * */
    List<User> findUserByUsername(String username);

    /**
     * 查询id
     * @param username
     * @return
     */
    int findId(String username);


}
