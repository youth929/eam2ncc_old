package com.ssx.eam2ncc.service.impl;

import com.ssx.eam2ncc.dao.EamXtywUserDao;
import com.ssx.eam2ncc.entity.EamXtywUser;
import com.ssx.eam2ncc.service.EamXtywUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("eamXtywUserService")
public class EamXtywUserServiceImpl implements EamXtywUserService {
    @Resource
    EamXtywUserDao eamXtywUserDao;

    /**
     * 查询所有运维人员
     *
     * @return
     */
    @Override
    public List<EamXtywUser> queryAll() {
        return eamXtywUserDao.queryAll();
    }
}
