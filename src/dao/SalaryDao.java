package dao;

import java.util.List;
import domain.Salary;

public interface SalaryDao {

    /**
     * 查询所有工资
     * @return
     */
    List<Salary> findAllSalary();

    /**
     * 根据ID查询员工信息
     * @return
     * */
    List<Salary> findSalaryById(int id);

    /**
     * 添加员工工资
     * @param salary
     */
    void addSalary(Salary salary);

    /**
     * 删除员工工资
     * @param id
     */
    void deleteSalary(int id);

    /**
     * 更新员工工资
     * @param salary
     */
    void updateSalary(Salary salary);
}
