package com.jerax.cloud.core.entity.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author JerAxxxxx
 * @version Revision 1.0.0
 * @date 2020/4/11 20:20
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TestTable {
    private Integer id;

    private String name;

    private String code;

    private String remark;
}