package com.tan.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import sun.applet.Main;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)//链式写法 dept.setDeptNo(11).setDname('sss').setDb_source()
public class Dept implements Serializable {//实现序列化的目的是为了保证流传输不出问题
    private Long deptno;//主键
    private String dname;
    private String db_source;//微服务中一个服务对应一个数据库，同一个信息可能存在不同数据库

    public Dept(String dname) {
        this.dname = dname;
    }
}
