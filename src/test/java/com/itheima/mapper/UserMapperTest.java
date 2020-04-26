package com.itheima.mapper;

import com.itheima.pojo.User;
import com.itheima.service.IUserService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.InputStream;
import java.util.Date;

public class UserMapperTest {

    private UserMapper mapper;

    @Before
    public void setUp() throws Exception {
        //ApplicationContext ac = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
        //SqlSessionFactory sqlSessionFactory = ac.getBean("sqlSessionFactory", SqlSessionFactory.class);
        //InputStream is = Resources.getResourceAsStream("mybatis/mybatis-config.xml");
        //SqlSessionFactory build = new SqlSessionFactoryBuilder().build(is);
        //SqlSession sqlSession = build.openSession(true);
        //mapper = sqlSession.getMapper(UserMapper.class);
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
        mapper = ac.getBean("userMapper", UserMapper.class);
    }


    @Test
    public void queryUserById() {
        User user = mapper.queryUserById(1L);
        System.out.println("user = " + user);
    }

    @Test
    public void testAddUsers(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
        IUserService userService = (IUserService) ac.getBean("userServiceImpl");
        User user1 = new User();
        user1.setName("用户1");
        user1.setPassword("123456");
        user1.setUserName("admin1");
        user1.setAge(18);
        user1.setSex(1);
        user1.setBirthday(new Date());
        User user2 = new User();
        user2.setName("用户2");
        user2.setPassword("123456");
        user2.setUserName("admin2");
        user2.setAge(18);
        user2.setSex(1);
        user2.setBirthday(new Date());
        userService.addUsers(user1, user2);
    }
}
