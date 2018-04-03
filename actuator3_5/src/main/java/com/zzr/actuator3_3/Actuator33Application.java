package com.zzr.actuator3_3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Actuator33Application {

	/**
	 *
	 * @param args
	 * 有以下接口
	 * autoconfig  显示自动配置的信息
	 * beans 显示应用程序上下文所有的springBean
	 * configprops 显示所有 @ConfigurationProperties 的配置属性列表
	 * dump  显示线程活动的快照
	 * env 显示应用的环境变量
	 * health 显示用用程序的健康指标， 这些值由HealthIndicatior 的实现类提供
	 * info 显示应用的信息 可使用info.* 属性自定义Info 端点公开的数据
	 * mappings 显示所有的url路径
	 * metrics 显示所有的度量标准信息
	 * shutdown  关闭应用  默认情况下是不启用该接口  需要启用 设置 endpoints,shutdown.enabled=true
	 * trace 显示跟踪信息  （默认最近的100个http请求）
	 */
	public static void main(String[] args) {
		SpringApplication.run(Actuator33Application.class, args);
	}
}
