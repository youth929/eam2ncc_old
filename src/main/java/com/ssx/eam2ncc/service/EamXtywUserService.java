package com.ssx.eam2ncc.service;

import com.ssx.eam2ncc.entity.EamXtywUser;

import java.util.List;

public interface EamXtywUserService {

    /**
     * 查询所有运维人员
     * @return
     */
    List<EamXtywUser> queryAll();
}
