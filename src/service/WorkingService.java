package service;

import domain.Working;

import java.util.List;

public interface WorkingService {
    /**
     * 查询所有工资
     * @return
     */
    List<Working> findAllWorking();

    /**
     * 根据ID查询考勤信息
     * @return
     * */
    List<Working> findWorkingById(int id);

    /**
     * 添加考勤信息
     * @param working
     */
    void addWorking(Working working);

    /**
     * 更改考勤信息
     * @param working
     */
    void updateWorking(Working working);


    /**
     * 删除考勤信息
     * @param id
     */
    void deleteWorking(int id);



}
