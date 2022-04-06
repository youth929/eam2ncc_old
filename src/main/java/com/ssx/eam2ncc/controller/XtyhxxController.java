package com.ssx.eam2ncc.controller;

import com.ssx.eam2ncc.entity.Xtyhxx;
import com.ssx.eam2ncc.service.XtyhxxService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 系统用户信息表(Xtyhxx)表控制层
 *
 * @author youth
 * @since 2022-03-25 09:02:44
 */
@RestController
@RequestMapping("xtyhxx")
public class XtyhxxController {
    /**
     * 服务对象
     */
    @Resource
    private XtyhxxService xtyhxxService;

    /**
     * 分页查询
     *
     * @param xtyhxx      筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<Xtyhxx>> queryByPage(Xtyhxx xtyhxx, PageRequest pageRequest) {
        return ResponseEntity.ok(this.xtyhxxService.queryByPage(xtyhxx, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Xtyhxx> queryById(@PathVariable("id")id) {
        return ResponseEntity.ok(this.xtyhxxService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param xtyhxx 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Xtyhxx> add(Xtyhxx xtyhxx) {
        return ResponseEntity.ok(this.xtyhxxService.insert(xtyhxx));
    }

    /**
     * 编辑数据
     *
     * @param xtyhxx 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Xtyhxx> edit(Xtyhxx xtyhxx) {
        return ResponseEntity.ok(this.xtyhxxService.update(xtyhxx));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(id) {
        return ResponseEntity.ok(this.xtyhxxService.deleteById(id));
    }

}

