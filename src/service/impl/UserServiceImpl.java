package service.impl;

import dao.UserDao;
import dao.impl.UserDaoImpl;
import domain.User;
import service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {

    private UserDao userDao=new UserDaoImpl();

    @Override
    public boolean checkUser(User user) {
        return userDao.checkUser(user);
    }

    @Override
    public boolean addUser(User user){
        return userDao.addUser(user);
    }

    @Override
    public List<User> findAllUser(){
        return userDao.findAllUser();
    }

    @Override
    public List<User> findUserByUsername(String username){
        return userDao.findUserByUsername(username);
    }

    @Override
    public int findId(String username){ return userDao.findId(username);}


}
