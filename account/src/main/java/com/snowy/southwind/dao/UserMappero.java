package com.snowy.southwind.dao;

import com.snowy.southwind.bean.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface UserMappero {
    User userLogin(@Param("username") String username, @Param("password") String password);
}
