package com.tan.controller;

import com.tan.pojo.Dept;
import com.tan.service.IDeptService;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class DeptController {
    @Resource
    private IDeptService deptService;
    @Resource//获取一些配置的信息，得到具体的微服务
    private DiscoveryClient discoveryClient;


    @GetMapping("/addDept/{dname}")
    public Dept addDept(@PathVariable("dname") String dname) {
        Dept dept = new Dept(dname);
        deptService.addDept(dept);
        return dept;
    }

    @GetMapping("/findDeptById/{deptno}")
    public Dept findDeptById(@PathVariable("deptno") Long deptno) {
        Dept dept = deptService.findDeptById(deptno);
        return dept;
    }

    @GetMapping("/findAll")
    public List<Dept> findAll() {
        List<Dept> list = deptService.findAll();
        return list;
    }
    @GetMapping("/discovery")
    public Object discovery(){
        //获取微服务列表清单
        List<String> services = discoveryClient.getServices();
        for (String service : services) {
            System.out.println("service====>>"+service);
        }
        System.out.println(services.size());
        System.out.println("----------------------------------------");
        List<ServiceInstance> instances = discoveryClient.getInstances("SPRINGCLOUD-PROVIDER-DEPT");
        for (ServiceInstance instance : instances) {
            System.out.println(instance.getHost());
            System.out.println(instance.getPort());
            System.out.println(instance.getUri());
            System.out.println(instance.getServiceId());
        }
        System.out.println(instances.size());
        return this.discoveryClient;
    }
}
