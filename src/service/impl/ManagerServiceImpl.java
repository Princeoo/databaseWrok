package service.impl;

import dao.ManagerDao;
import dao.impl.ManagerDaoImpl;
import domain.Manager;
import service.ManagerService;

import java.util.List;
import java.util.ListResourceBundle;

public class ManagerServiceImpl implements ManagerService {

    private ManagerDao managerDao = new ManagerDaoImpl();

    @Override
    public boolean checkManager(Manager manager) {
        return managerDao.checkManager(manager);
    }

    @Override
    public boolean addUser(Manager manager){
        return managerDao.addUser(manager);
    }

    @Override
    public List<Manager> findManagerByUsername(String username){
        return managerDao.findManagerByUsername(username);
    }
}
