package com.jerax.cloud.payment.mapper;

import com.jerax.cloud.core.entity.po.TestTable;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author JerAxxxxx
 * @version Revision 1.0.0
 * @date 2020/4/11 20:20
 */
@Mapper
public interface TestTableMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TestTable record);

    int insertSelective(TestTable record);

    TestTable selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TestTable record);

    int updateByPrimaryKey(TestTable record);
}