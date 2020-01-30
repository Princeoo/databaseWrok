package dao;

import domain.Manager;

import java.util.List;

public interface ManagerDao {

    /**
     * 管理员登陆检查
     * @return
     */
     boolean checkManager(Manager manager);

    /**
     * 添加用户信息
     * @param manager
     * @return
     */
    boolean addUser(Manager manager);

    /**
     * 根据账户查询管理员信息
     * @return
     * */
    List<Manager> findManagerByUsername(String username);
}
