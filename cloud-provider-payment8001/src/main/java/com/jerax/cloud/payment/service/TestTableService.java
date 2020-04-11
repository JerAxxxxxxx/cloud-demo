package com.jerax.cloud.payment.service;

import com.jerax.cloud.core.entity.po.TestTable;
    /**
 * @author JerAxxxxx
 * @version Revision 1.0.0
 * @date 2020/4/11 20:20
 */
public interface TestTableService{


    int deleteByPrimaryKey(Integer id);

    int insert(TestTable record);

    int insertSelective(TestTable record);

    TestTable selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TestTable record);

    int updateByPrimaryKey(TestTable record);

}
