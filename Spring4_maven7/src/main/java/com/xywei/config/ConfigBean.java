package com.xywei.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

import com.xywei.service.LinuxCondition;
import com.xywei.service.LinuxDir;
import com.xywei.service.ListDirService;
import com.xywei.service.WindowsCondition;
import com.xywei.service.WindowsDir;

@Configuration
public class ConfigBean {
	@Bean
	@Conditional(WindowsCondition.class)
	public ListDirService windowsDir() {
		return new WindowsDir();
	}

	@Bean
	@Conditional(LinuxCondition.class)
	public ListDirService linuxDir() {
		return new LinuxDir();
	}

}
