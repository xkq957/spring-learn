package com.xkq.spring._05jdbc_properties;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author: xkq
 * @date: 2023/2/23 20:48
 * @description:
 */
public class testDataSource {

    @Test
    public void testDataSource() throws SQLException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-05-jdbc-properties.xml");
        DataSource dataSource = context.getBean(DataSource.class);
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
    }
}
