package dao;

import domain.Working;

import java.util.List;


public interface WorkingDao {

    /**
     *
     * @return
     */
    List<Working> findAllWorking();

    /**
     * 根据ID查询员工信息
     * @return
     * */
    List<Working> findWorkingById(int id);

    /**
     *
     * @param working
     */
    void addWorking(Working working);

    /**
     *
     * @param working
     */
    void updateWorking(Working working);

    /**
     *
     * @param id
     */
    void deleteWorking(int id);


}
