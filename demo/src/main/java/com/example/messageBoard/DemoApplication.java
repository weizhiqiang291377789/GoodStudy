package com.example.messageBoard;

import com.example.messageBoard.common.RequirementsPlanning;
import com.example.messageBoard.entity.User;
import com.example.messageBoard.entity.UserList;
import com.example.messageBoard.entity.UserMap;
import com.example.messageBoard.entity.UserName;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootApplication
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
public class DemoApplication {


	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		RequirementsPlanning requ = new RequirementsPlanning();
		requ.test1();
		requ.test2();
		requ.test3();
		requ.test4("9/1");
		User user = new User("杨杰");
		UserName userName = new UserName("老毕");
		System.out.println("赋值前" + userName.toString());
		requ.test5(user, userName);
		System.out.println("赋值后" + userName.toString());
		requ.test6(userName);
		System.out.println("枚举" + userName.getI());

		String md5Str = "8CA6-F4CC318443BD";
		String secret = "F29E0E39-98E4-40C2-8CA6-F4CC318443BD";
		String s = requ.test7(md5Str, secret);
		System.out.println("加密的值------>"+s);
		String b = requ.test8(s,secret);
		System.out.println("解密的值------>"+b);
		User use = new User();
		UserName sss = new UserName("sss");
		sss.setI(1);
		use.setData(sss);
		UserList userlist = new UserList();
		List list = new ArrayList<>();
		Map<Object,UserMap> map = new HashMap<>();
		UserMap userMap = new UserMap();
		map.put("UserMap",userMap);
		list.add(userlist);
		use.getData().setMap(map);
		System.out.println(	map);
		use.getData().setList(list);

		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append(666666666);
		use.setStr(stringBuffer);

		User user1 = requ.test9(use);
		System.out.println(	user1.getData());
		System.out.println(	user1.getData().getList());
		System.out.println(	user1.getData().getMap());
		System.out.println(	user1.getStr());
		String str = "asdpm完没";
		String s1 = requ.test10(str);
		System.out.println(s1);
		requ.test11();
	}
}
