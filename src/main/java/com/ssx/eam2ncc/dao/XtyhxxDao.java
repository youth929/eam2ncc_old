package com.ssx.eam2ncc.dao;

import com.ssx.eam2ncc.entity.Xtyhxx;
/**
 * 系统用户信息表(Xtyhxx)表数据库访问层
 *
 * @author youth
 * @since 2022-03-25 09:02:48
 */
public interface XtyhxxDao {

    /**
     * 通过ID查询单条数据
     *
     * @return 实例对象
     */
    Xtyhxx queryById();


}

