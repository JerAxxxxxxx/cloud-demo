package com.jerax.cloud.core.utils;

import com.jerax.cloud.core.entity.vo.ResultVO;

/**
 * @author JerAxxxxx
 * @version Revision 1.0.0
 * @date 2020/4/11 20:27
 */
public class ResultVoUtil {


    public static ResultVO success(Object object) {
        ResultVO resultVO = new ResultVO();
        resultVO.setData(object);
        resultVO.setCode("200");
        resultVO.setMsg("成功");
        return resultVO;
    }

    public static ResultVO error(Integer code, String msg) {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode("500");
        resultVO.setMsg(msg);
        return resultVO;
    }
}
