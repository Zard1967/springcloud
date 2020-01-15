package com.tan.controller;

import com.tan.pojo.Dept;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class DeptConsumerController {
    //消费者 没有servicec层
    //RestTemplate ...方法供我们调用就可以了！ 注册sring中
    //(url, 实体: Map, Class<T> ResponseType)
    @Resource//注入RestTemplate对象
    private RestTemplate restTemplate;

    private static final String REST_URL_PREFIX = "http://localhost:8001";

    @RequestMapping("/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id) {
        return restTemplate.getForObject(REST_URL_PREFIX + "/findDeptById/"+id, Dept.class);
    }

    @RequestMapping("/consumer/dept/add/{dname}")
    public Dept add(@PathVariable("dname") String dname) {
        return restTemplate.getForObject(REST_URL_PREFIX +"/addDept/"+dname, Dept.class);
    }

    @RequestMapping("/consumer/dept/list")
    public List<Dept> list() {
        return restTemplate.getForObject(REST_URL_PREFIX + "/findAll", List.class);

    }

}
