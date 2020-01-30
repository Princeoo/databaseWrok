package service.impl;

import dao.MessageDao;
import dao.impl.MessageDaoImpl;
import domain.Message;
import domain.User;
import service.MessageService;

import java.util.List;

public class MessageServiceImpl implements MessageService {
    private MessageDao messageDao = new MessageDaoImpl();

    @Override
    public List<Message> findAllMessage() {
        return messageDao.findAllMessage();
    }

    @Override
    public List<Message> findMessageById(int id) {
        return messageDao.findMessageById(id);
    }

    @Override
    public void addMessage(Message message) {
        messageDao.addMessage(message);
    }

    @Override
    public void updateMessage(Message message) {
        messageDao.updateMessage(message);
    }

    @Override
    public void deleteMessage(int id) {
        messageDao.deleteMessage(id);
    }

}
