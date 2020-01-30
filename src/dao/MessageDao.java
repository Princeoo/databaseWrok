package dao;

import domain.Message;
import domain.User;

import java.util.List;

public interface MessageDao {
    /**
     * 查询所有员工信息
     * @return
     */
    List<Message> findAllMessage();

    /**
     * 根据ID查询员工信息
     * @return
     * */
    List<Message> findMessageById(int id);

    /**
     * 添加员工信息
     * @param message
     */
    void addMessage(Message message);

    /**
     * 修改员工信息
     * @param message
     */
    void updateMessage(Message message);

    /**
     * 删除员工信息
     * @param id
     */
    void deleteMessage(int id);
}
