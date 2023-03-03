package com.library.model.service;

import com.library.model.entity.Message;
import com.library.model.repository.CrudRepository;

import java.util.List;
import java.util.Map;

public class MassageService implements ServiceImpl<Message,Long> {
    @Override
    public Message save(Message message) throws Exception {
        CrudRepository<Message,Long> messageDa = new CrudRepository<>();
        return messageDa.save(message);
    }

    @Override
    public Message edit(Message message) throws Exception {
        CrudRepository<Message,Long> messageDa = new CrudRepository<>();
        return messageDa.edit(message);
    }

    @Override
    public Message deactivate(Long id) throws Exception {
        CrudRepository<Message,Long> messageDa = new CrudRepository<>();
        return messageDa.deactivate(Message.class,id);
    }


    public List<Message> findAll(User receiver) throws Exception {

        CrudRepository<Message,User> messageDa = new CrudRepository<>();
       List<Message> messageList = messageDa.findAll(Message.class,receiver);
    }

    @Override
    public Message findById(Long id) throws Exception {
        return null;
    }

    @Override
    public List<Message> executeQuery(String namedQuery, Map<String, Object> params) throws Exception {
        return null;
    }
}
