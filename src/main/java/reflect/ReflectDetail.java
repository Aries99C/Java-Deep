package reflect;

import reflect.entry.CustomClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URLClassLoader;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.ServiceLoader;

public class ReflectDetail {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        // DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "username", "password");

        System.out.println(DriverManager.class.getClassLoader() == ClassLoader.getPlatformClassLoader());
        System.out.println(DriverManager.class.getClassLoader());

        System.out.println(ClassLoader.getSystemClassLoader().getName());
        System.out.println(ClassLoader.getPlatformClassLoader().getName());
    }
}

