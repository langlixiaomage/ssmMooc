package com.mage.serviceImp;

import com.mage.dao.OperationDao;
import com.mage.domain.UserInfo;
import com.mage.service.OperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OperationServiceImp implements OperationService {
    @Autowired
    private OperationDao operationDao;

    @Override
    public UserInfo getUserInfoByUsername(String username) {
        UserInfo userInfo = null;
        try {
            userInfo = operationDao.selectOperationsByUsername(username);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return userInfo;
    }
}
