package service;

import domain.Salary;

import java.util.List;

public interface SalaryService {
    /**
     * 查询所有工资
     * @return
     */
    List<Salary> findAllSalary();

    /**
     * 根据ID查询工资信息
     * @return
     * */
    List<Salary> findSalaryById(int id);

    /**
     * 添加员工工资
     * @param salary
     */
    void addSalary(Salary salary);

    /**
     * 更改员工工资
     * @param salary
     */
    void updateSalary(Salary salary);

    /**
     * 删除员工工资
     * @param id
     */
    void deleteSalary(int id);


}
