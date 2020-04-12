package com.jerax.cloud.consumer.controller;

import com.jerax.cloud.core.entity.po.TestTable;
import com.jerax.cloud.core.entity.vo.ResultVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import static com.jerax.cloud.core.constants.ServiceUrlConstants.PAYMENT_URL;

/**
 * @author JerAxxxxx
 * @version Revision 1.0.0
 * @date 2020/4/11 21:55
 */
@RestController
@RequestMapping
@Slf4j
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;


    @GetMapping("/consumer/payment/create")
    public ResultVO create(TestTable testTable) {
        return restTemplate.postForObject(PAYMENT_URL + "/payment/create", testTable, ResultVO.class);
    }


    @GetMapping("/consumer/payment/get/{id}")
    public ResultVO getPayment(@PathVariable("id") Integer id) {
        return restTemplate.getForObject(PAYMENT_URL + "/payment/get/" + id, ResultVO.class);
    }

}
