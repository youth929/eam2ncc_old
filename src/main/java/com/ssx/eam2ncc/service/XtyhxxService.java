package com.ssx.eam2ncc.service;

import com.ssx.eam2ncc.entity.Xtyhxx;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

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
     * @param 主键
     * @return 实例对象
     */
    Xtyhxx queryById();

    /**
     * 分页查询
     *
     * @param xtyhxx      筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    Page<Xtyhxx> queryByPage(Xtyhxx xtyhxx, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param xtyhxx 实例对象
     * @return 实例对象
     */
    Xtyhxx insert(Xtyhxx xtyhxx);

    /**
     * 修改数据
     *
     * @param xtyhxx 实例对象
     * @return 实例对象
     */
    Xtyhxx update(Xtyhxx xtyhxx);

    /**
     * 通过主键删除数据
     *
     * @param 主键
     * @return 是否成功
     */
    boolean deleteById();

}
