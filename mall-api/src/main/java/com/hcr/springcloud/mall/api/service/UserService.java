package com.hcr.springcloud.mall.api.service;

import com.hcr.springcloud.common.dto.UserDTO;
import com.hcr.springcloud.common.util.Result;

import java.util.List;

public interface UserService {
    /**
     * @param userName
     * @param password
     * @return
     */
    Result<String> login(String userName, String password);

    Result<UserDTO> getUserInfoById(int userId);

    Result<List<UserDTO>> getUsers(int deptId, String userName, String email);
}
