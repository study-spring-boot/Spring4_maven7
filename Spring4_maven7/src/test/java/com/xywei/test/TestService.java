package com.xywei.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.xywei.config.ConfigBean;
import com.xywei.service.ListDirService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ConfigBean.class)
public class TestService {
	@Autowired
	private ListDirService service;

	@Test
	public void test() {
		String dir = service.showDir();
		System.out.println(dir);
	}

}
