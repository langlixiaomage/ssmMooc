package com.mage.service;

import com.mage.domain.UserInfo;
import org.springframework.stereotype.Service;

@Service
public interface OperationService {
    public UserInfo getUserInfoByUsername(String username);
}
