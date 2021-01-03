package com.snowy.southwind.dao;

import com.snowy.southwind.bean.Menu;
import com.snowy.southwind.bean.User;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserMapper {
    List < User > findAll(Integer index, Integer limit);
    Integer count();
    void save(User user);
    void deleteById(long id);
}
