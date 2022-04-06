package com.ssx.eam2ncc.service.impl;

import com.ssx.eam2ncc.entity.Xtyhxx;
import com.ssx.eam2ncc.dao.XtyhxxDao;
import com.ssx.eam2ncc.service.XtyhxxService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 系统用户信息表(Xtyhxx)表服务实现类
 *
 * @author youth
 * @since 2022-03-25 09:02:51
 */
@Service("xtyhxxService")
public class XtyhxxServiceImpl implements XtyhxxService {
    @Resource
    private XtyhxxDao xtyhxxDao;

    /**
     * 通过ID查询单条数据
     *

     * @return 实例对象
     */
    @Override
    public Xtyhxx queryById() {
        return this.xtyhxxDao.queryById();
    }

}
