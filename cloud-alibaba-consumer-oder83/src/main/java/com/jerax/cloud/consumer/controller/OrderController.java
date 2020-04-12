package com.jerax.cloud.consumer.controller;

import com.jerax.cloud.core.entity.po.TestTable;
import com.jerax.cloud.core.entity.vo.ResultVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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


    @Value("${server-url.nacos-user-service}")
    private String url;

    @GetMapping("/consumer/payment/nacos/{string}")
    public String create(@PathVariable String string) {
        return restTemplate.getForObject(url + "/echo/" + string, String.class);
    }


}
