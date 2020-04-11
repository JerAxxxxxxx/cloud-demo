package com.jerax.cloud.payment.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jerax.cloud.payment.mapper.TestTableMapper;
import com.jerax.cloud.core.entity.po.TestTable;
import com.jerax.cloud.payment.service.TestTableService;
/**
 * @author JerAxxxxx
 * @version Revision 1.0.0
 * @date 2020/4/11 20:20
 */
@Service
public class TestTableServiceImpl implements TestTableService{

    @Autowired
    private TestTableMapper testTableMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return testTableMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TestTable record) {
        return testTableMapper.insert(record);
    }

    @Override
    public int insertSelective(TestTable record) {
        return testTableMapper.insertSelective(record);
    }

    @Override
    public TestTable selectByPrimaryKey(Integer id) {
        return testTableMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(TestTable record) {
        return testTableMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TestTable record) {
        return testTableMapper.updateByPrimaryKey(record);
    }

}
