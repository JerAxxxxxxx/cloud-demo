package com.jerax.cloud.payment.controller;

import com.jerax.cloud.core.entity.vo.ResultVO;
import com.jerax.cloud.core.entity.po.TestTable;
import com.jerax.cloud.core.utils.ResultVoUtil;
import com.jerax.cloud.payment.service.TestTableService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author JerAxxxxx
 * @version Revision 1.0.0
 * @date 2020/4/11 20:20
 */
@Slf4j
@RestController
@RequestMapping
public class TestTableController {

    @Autowired
    TestTableService tableService;


    @PostMapping("/insert")
    public ResultVO insert(@RequestBody TestTable testTable) {
        int i = tableService.insertSelective(testTable);
        log.info("插入结果:" + i);
        return ResultVoUtil.success(i);
    }

    @GetMapping("/get/{id}")
    public ResultVO get(@PathVariable("id") Integer id) {
        TestTable testTable = tableService.selectByPrimaryKey(id);
        return ResultVoUtil.success(testTable);
    }
}
