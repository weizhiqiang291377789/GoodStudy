package com.example.messageBoard.common;

import com.example.messageBoard.entity.*;
import org.springframework.beans.BeanUtils;

import java.beans.PropertyDescriptor;
import java.io.Console;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

import static org.springframework.beans.BeanUtils.getPropertyDescriptor;


public class RequirementsPlanning {
    EnumTest color;

/*
   1 创建数据库建个用户表和留言表 存储 用户名密码 和留言
   2 写个页面 俩文本框一个按钮  请求发送给后台
   3 数据库和前台的值比较实现登陆
   4 登录完成跳转到留言板页面
   5 提供一个列表和一个大文本框和一个按钮
   6 列表是查数据库显示已有留言(查询/删除/添加/修改 )
   7 按钮式提交留言
   8 实现以上简单需求 后期继续迭代优化
      */

    public static void test1() {
        String s = new String("The=Java=platform=is=the=ideal=platform=for=network=computing");
        //分词器构造函数三个参数，
        //第一个是待分隔的字符串，
        //第二个为分隔字符串，以字符为分隔单位（比如the，可能匹配到e，就会分隔），
        //第三个参数说明是否要把分割字符串作为标记返回
        StringTokenizer st = new StringTokenizer(s, "the", true);
        System.out.println("Token Total:" + st.countTokens());
        while (st.hasMoreElements()) {
            System.out.println(st.nextToken());
        }
    }



    //不返回分割字符
    public static void test2() {
        String s = new String("1001,1002,1003");
        StringTokenizer st = new StringTokenizer(s, ",", false);
        System.out.println("Token Total:" + st);
        while (st.hasMoreElements()) {
            System.out.println(st.nextToken());
        }
    }

    //自定义分隔字符
    public static void test3() {
        String s = new String("1001,1002,1003");
        StringTokenizer st = new StringTokenizer(s, ",", false);
        System.out.println("Token Total:" + st.countTokens());
        while (st.hasMoreElements()) {
            System.out.println(st.nextToken("1"));
        }
    }

    public static void test4(String str) {
        if (str.equals("0")){
            System.out.print("不能为0");
        }
        StringTokenizer st = new StringTokenizer(str, "/", false);

        while (st.hasMoreElements()) {
            String s = st.nextToken();
            System.out.println("分子是"+s);
            String b = st.nextToken();
            System.out.println("分母是"+b);
        }
    }

    public static void test5(Object o1,Object o2) {

        BeanUtils.copyProperties(o1,o2);
    }

    public static UserName test6(UserName o1) {
        o1.setI(EnumTest.Friday.getValue());
        return o1;
    }

    public static Object getProperty(Object obj, String propertyName) {
        Class clazz = obj.getClass();//获取对象的类型
        PropertyDescriptor pd = getPropertyDescriptor(clazz, propertyName);//获取 clazz 类型中的 propertyName 的属性描述器
        Method getMethod = pd.getReadMethod();//从属性描述器中获取 get 方法
        Object value = null;
        try {
            value = getMethod.invoke(clazz, new Object[]{});//调用方法获取方法的返回值
        } catch (Exception e) {
            e.printStackTrace();
        }
        return value;
    }

    public static String test7(String md5Str,String secret) {

        return XXTEA.encryptToBase64String(md5Str,secret);
    }

    public static String test8(String md5Str,String secret) {

        return XXTEA.decryptBase64StringToString(md5Str,secret);
    }

    public static User test9(User user) {
        int i = user.getData().getI();
        user.getData().setI(5);
        List<UserList> list = user.getData().getList();
        for (UserList userTest : list) {
            userTest.setGender("123");
            userTest.setName("aaa");
        }
        Map<Object, UserMap> map = user.getData().getMap();
        UserMap userMap = map.get("UserMap");
        userMap.setNumber("111111111");
        userMap.setAccountNumber("222222222222");
        StringBuffer str = user.getStr();
        str.append(11233);
        user.setStr(str);
        return user;
    }
    public static String test10(String str) {
        String tt = "顺口溜";
        String replace = str.replace(str, tt);
        return replace;
    }

    public static void test11() {

        for(int i = 1; i < 10; i++)
        {
            for(int j = 1; j <= i; j++)
            {
               System.out.print(i + "x" + j + "=" + i*j + "\t");
            }
            System.out.println();
        }
    }
}
