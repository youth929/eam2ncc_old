package com.ssx.eam2ncc.service.impl;

import com.ssx.eam2ncc.entity.Xtyhxx;
import com.ssx.eam2ncc.dao.XtyhxxDao;
import com.ssx.eam2ncc.service.XtyhxxService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

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
     * @param 主键
     * @return 实例对象
     */
    @Override
    public Xtyhxx queryById() {
        return this.xtyhxxDao.queryById();
    }

    /**
     * 分页查询
     *
     * @param xtyhxx      筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    @Override
    public Page<Xtyhxx> queryByPage(Xtyhxx xtyhxx, PageRequest pageRequest) {
        long total = this.xtyhxxDao.count(xtyhxx);
        return new PageImpl<>(this.xtyhxxDao.queryAllByLimit(xtyhxx, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param xtyhxx 实例对象
     * @return 实例对象
     */
    @Override
    public Xtyhxx insert(Xtyhxx xtyhxx) {
        this.xtyhxxDao.insert(xtyhxx);
        return xtyhxx;
    }

    /**
     * 修改数据
     *
     * @param xtyhxx 实例对象
     * @return 实例对象
     */
    @Override
    public Xtyhxx update(Xtyhxx xtyhxx) {
        this.xtyhxxDao.update(xtyhxx);
        return this.queryById(xtyhxx.get());
    }

    /**
     * 通过主键删除数据
     *
     * @param 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById() {
        return this.xtyhxxDao.deleteById() > 0;
    }
}
