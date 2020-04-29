# SpringCloud-eureka


第二天SpringCloud

		eureka
		浏览器打开  http://localhost:7081/ 
		浏览器打开  http://localhost:8081/ConBook
		第一个打开看到eureka的界面 其中有消费者和提供者为eureka成功，第二个打开出现数据为项目成功


20200427-springcloud-rpc1
	包括：

	1.rpc
	2.eureka
	         20200427-springcloud-rpc1-consumer（基础消费者）（1）
			 rpc+定义bean  
			 rpc+web中注入springCloud提供的RestTemplate
			 eureka+引用jar包 启动类加入注解@EnableDiscoveryClient
			 eureka+application.properties加入eureka（集群或单机）配置


	          20200427-springcloud-rpc1-management（业务管理）（1）
		    20200427-springcloud-rpc1-management-mapper（mapper）

		    20200427-springcloud-rpc1-management-model（model）

		    20200427-springcloud-rpc1-management-service（service）


	          20200428-springcloud-eureka-management（eureka集群及单机配置）（2）
		    20200428-springcloud-eureka-management-danji
			eureka+引用jar包 启动类加入注解@EnableEurekaServer
			eureka+application.properties加入eureka单机配置

		    20200428-springcloud-eureka-management-7082
			eureka+引用jar包 启动类加入注解@EnableEurekaServer
			eureka+application.properties加入eureka集群配置

		    20200428-springcloud-eureka-management-7083
			eureka+引用jar包 启动类加入注解@EnableEurekaServer
			eureka+application.properties加入eureka集群配置

		    20200428-springcloud-eureka-management-7084
			eureka+引用jar包 启动类加入注解@EnableEurekaServer
			eureka+application.properties加入eureka集群配置


	          20200427-springcloud-rpc1-provider（基础提供者）（1）
		eureka+引用jar包 启动类加入注解@EnableDiscoveryClient
		eureka+application.properties加入eureka（集群或单机）配置


















