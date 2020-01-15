package com.tan;

import com.tan.controller.DeptControllerTest;
import com.tan.mapper.DeptMapperTest;
import com.tan.service.IDeptServiceTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({DeptControllerTest.class,IDeptServiceTest.class, DeptMapperTest.class})
public class AllTest {}