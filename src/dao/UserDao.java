package dao;

import domain.User;

import java.util.List;

public interface UserDao {
    /**
     * 员工登陆检查
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
