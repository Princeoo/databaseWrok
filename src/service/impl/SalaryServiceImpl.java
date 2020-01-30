package service.impl;

import dao.SalaryDao;
import dao.impl.SalaryDaoImpl;
import domain.Salary;
import service.SalaryService;

import java.util.List;

public class SalaryServiceImpl implements SalaryService {
    private SalaryDao salaryDao = new SalaryDaoImpl();

    @Override
    public List<Salary> findAllSalary() {
        return salaryDao.findAllSalary();
    }

    @Override
    public List<Salary> findSalaryById(int id){
        return  salaryDao.findSalaryById(id);
    }

    @Override
    public void addSalary(Salary salary) {
        salaryDao.addSalary(salary);
    }

    @Override
    public void updateSalary(Salary salary) {
        salaryDao.updateSalary(salary);
    }

    @Override
    public void deleteSalary(int id) {
        salaryDao.deleteSalary(id);
    }


}

