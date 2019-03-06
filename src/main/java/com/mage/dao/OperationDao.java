package com.mage.dao;

import com.mage.domain.UserInfo;
import org.springframework.stereotype.Repository;

@Repository
public interface OperationDao {
    public UserInfo selectOperationsByUsername(String username) throws Exception;
}
