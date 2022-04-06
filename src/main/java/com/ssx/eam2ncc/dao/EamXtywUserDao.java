package com.ssx.eam2ncc.dao;

import com.ssx.eam2ncc.entity.EamXtywUser;
import java.util.List;

/**
 * (EamXtywUser)表数据库访问层
 *
 * @author youth
 * @since 2022-02-15 10:15:28
 */
public interface EamXtywUserDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    EamXtywUser queryById(Integer id);


    /**
     *
     * @return
     */
    List<EamXtywUser> queryAll();


}

