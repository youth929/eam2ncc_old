package com.ssx.eam2ncc.service;

import com.ssx.eam2ncc.entity.Xtyhxx;


/**
 * 系统用户信息表(Xtyhxx)表服务接口
 *
 * @author youth
 * @since 2022-03-25 09:02:51
 */
public interface XtyhxxService {

    /**
     * 通过ID查询单条数据
     *
     * @return 实例对象
     */
    Xtyhxx queryById();


}
