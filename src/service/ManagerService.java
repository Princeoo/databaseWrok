package service;

import domain.Manager;

import java.util.List;

public interface ManagerService {
    /**
     * 检查管理员信息
     * @param manager
     * @return
     */
    boolean checkManager(Manager manager);

    /**
     * 添加管理员信息
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
