import com.alibaba.druid.pool.DruidDataSource;
import com.bupt.spring.ioc.dao.User;
import com.bupt.spring.ioc.dao.UserDao;
import com.bupt.spring.ioc.dao.UserDaoImpl;
import com.bupt.spring.ioc.entity.*;
import com.bupt.spring.ioc.service.BankServiceImpl;
import com.bupt.spring.ioc.service.UserService;
import com.bupt.spring.ioc.tx.Bank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * @Author: 金培源
 * @Date: 2022/4/4 19:32
 * @Version: 1.0
 * @Description:
 */
public class Application {
    public static void main(String[] args) throws SQLException {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:config/applicationContext.xml");

//        UserService userService = applicationContext.getBean("userService", UserService.class);
//        userService.add();

//        Emp emp = applicationContext.getBean("emp", Emp.class);
//        System.out.println(emp);
//
//        // 对象未指明始终是单例的
//        Dept dept = applicationContext.getBean("dept", Dept.class);
//        System.out.println(dept);

//        Student student = applicationContext.getBean("student", Student.class);
//        System.out.println(student);
//
//        Course myBean = applicationContext.getBean("myBean", Course.class);
//        System.out.println(myBean);

//        Book book = applicationContext.getBean("book", Book.class);
//        Book book1 = applicationContext.getBean("book", Book.class);
//        System.out.println(book == book1);
//        User user = applicationContext.getBean("user", User.class);
//        User user1 = applicationContext.getBean("user", User.class);
//        user.test();
//        System.out.println("========");
//        user1.test();

//        Order order = applicationContext.getBean("order", Order.class);
//        System.out.println("第六步：使用对象");
//        System.out.println(order);
//        //手动销毁对象
//        ClassPathXmlApplicationContext context = (ClassPathXmlApplicationContext) applicationContext;
//        context.close();
//        DruidDataSource dataSource = applicationContext.getBean("dataSource", DruidDataSource.class);
////        System.out.println(dataSource);
//        UserDao userDao = applicationContext.getBean("userDao", UserDao.class);
//        userDao.add();
        JdbcTemplate jdbcTemplate = applicationContext.getBean("jdbcTemplate", JdbcTemplate.class);
        // 更新操作
//        String sql = "update user set password = ? where id = ?;";
//        User user = new User();
//        user.setId(1);
//        user.setPassword("789");
//        Object[] params = new Object[]{
//                user.getPassword(),
//                user.getId()
//        };
//        // 需要传入的是object类型的参数
//        int update = jdbcTemplate.update(sql, params);
//        System.out.println(update);

//        String sql1 = "insert into user(id,username,password) values(null,'wangwu','234')";
//        String sql2 = "insert into user(id,username,password) values(null,'zhaoliu','345')";
//        String[] sqls = new String[]{sql1,sql2};
//        int[] ints = jdbcTemplate.batchUpdate(sqls);
//        Arrays.stream(ints).forEach(x -> System.out.println(x));

//        String sql = "select id from user where username = ?";
//        int result = jdbcTemplate.queryForInt(sql, new Object[]{"zhangsan"});
//        System.out.println(result);
        // 只能返回单列数据
        String sql = "select * from user";
//        String username = (String)jdbcTemplate.queryForObject(sql, new Object[]{1}, String.class);
//        System.out.println(username);
//        Map<String,Object> map = jdbcTemplate.queryForMap(sql, new Object[]{1});
//        System.out.println(map);

//        List<Map<String, Object>> maps = jdbcTemplate.queryForList(sql);
//        maps.stream().forEach(user -> System.out.println(user));

        // 返回查询的对象
//        List<User> users = jdbcTemplate.query(sql, new RowMapper<User>() {
//            @Override
//            public User mapRow(ResultSet rs, int rowNum) throws SQLException {
//                User user = new User();
//                user.setId(rs.getInt("id"));
//                user.setUsername(rs.getString("username"));
//                user.setPassword(rs.getString("password"));
//                return user;
//            }
//        });
//        users.stream().forEach(user -> System.out.println(user));
        Bank bankServiceImpl = applicationContext.getBean("bankServiceImpl", Bank.class);
        bankServiceImpl.bank();
    }
}
