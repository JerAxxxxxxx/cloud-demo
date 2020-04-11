package com.jerax.cloud.core.entity.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author JerAxxxxx
 * @version Revision 1.0.0
 * @date 2020/4/11 20:24
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResultVO {

    private String code;

    private String msg;

    private Object data;

    public ResultVO(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
