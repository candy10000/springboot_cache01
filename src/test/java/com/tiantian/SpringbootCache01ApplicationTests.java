package com.tiantian;

import com.tiantian.dao.PersonDao;
import com.tiantian.entity.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootCache01ApplicationTests {

    @Autowired
    DataSource dataSource;

    @Autowired
    PersonDao personDao;

    @Test
    public void contextLoads() throws SQLException {

//        Connection connection = dataSource.getConnection();
//        String sql = "select * from book ";
//        PreparedStatement preparedStatement = connection.prepareStatement(sql);
//        ResultSet resultSet = preparedStatement.executeQuery();
//        while (resultSet.next()){
//            System.out.println(resultSet.getString(1));
//        }
        Person person = personDao.queryById(1);
        System.out.println(person);
        Person person1 = new Person();
        person1.setAddress("hh");
        person1.setAge(11);
        person1.setName("ggg");
        int flag = personDao.insert(person1);
        System.out.println(false);

    }

}
