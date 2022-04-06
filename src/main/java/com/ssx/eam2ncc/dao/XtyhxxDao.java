package com.ssx.eam2ncc.dao;

import com.ssx.eam2ncc.entity.Xtyhxx;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;

import java.util.List;

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
     * @param 主键
     * @return 实例对象
     */
    Xtyhxx queryById();

    /**
     * 查询指定行数据
     *
     * @param xtyhxx   查询条件
     * @param pageable 分页对象
     * @return 对象列表
     */
    List<Xtyhxx> queryAllByLimit(Xtyhxx xtyhxx, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param xtyhxx 查询条件
     * @return 总行数
     */
    long count(Xtyhxx xtyhxx);

    /**
     * 新增数据
     *
     * @param xtyhxx 实例对象
     * @return 影响行数
     */
    int insert(Xtyhxx xtyhxx);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Xtyhxx> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Xtyhxx> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Xtyhxx> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Xtyhxx> entities);

    /**
     * 修改数据
     *
     * @param xtyhxx 实例对象
     * @return 影响行数
     */
    int update(Xtyhxx xtyhxx);

    /**
     * 通过主键删除数据
     *
     * @param 主键
     * @return 影响行数
     */
    int deleteById();

}

