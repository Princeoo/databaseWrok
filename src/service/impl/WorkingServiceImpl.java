package service.impl;

import dao.SalaryDao;
import dao.WorkingDao;
import dao.impl.SalaryDaoImpl;
import dao.impl.WorkingDaoImpl;
import domain.Salary;
import domain.Working;
import service.WorkingService;

import java.util.List;

public class WorkingServiceImpl implements WorkingService {

    private WorkingDao workingDao = new WorkingDaoImpl();
    private SalaryDao salaryDao = new SalaryDaoImpl();

    @Override
    public List<Working> findAllWorking() {
        return workingDao.findAllWorking();
    }

    @Override
    public List<Working> findWorkingById(int id){
        return workingDao.findWorkingById(id);
    }

    @Override
    public void addWorking(Working working) {

        workingDao.addWorking(working);

        Salary salary=new Salary();

        salary.setId(working.getId());
        salary.setMonth(working.getMonth());
        salary.setYear(working.getYear());
        salary.setDepart_id(working.getDepart_id());
        //应扣金额=早退天使*100+迟到天数*100+请假天数*300-加班小时*20
        salary.setDeduct_pay(working.getLate_day()*100+working.getEarly_day()*100+working.getLeave_day()*300-working.getAdd_hour()*20);
        //应发金额=基本工资+住房补贴
        salary.setShould_pay(salary.getBase_pay()+salary.getHouse_add());
        //实发金额=应发金额-应扣金额
        salary.setActual_pay(salary.getShould_pay()-salary.getDeduct_pay());


        salaryDao.addSalary(salary);




    }

    @Override
    public void updateWorking(Working working) {
        workingDao.updateWorking(working);
    }

    @Override
    public void deleteWorking(int id) {
        workingDao.deleteWorking(id);
    }


}
