package utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;

public class SqlSessionFactoryUtils {
    private static String RESOURCE="mybatis-config.xml";

    private static SqlSessionFactory sqlSessionFactory;

    private static ThreadLocal<SqlSession> threadLocal=new ThreadLocal<SqlSession>();

    /*
     * 创建一个初始化SqlSessionFactory方法
     * */
    public static void initSqlSessionFactory(){
        try {
            InputStream inputStream= Resources.getResourceAsStream(RESOURCE);
            sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /*
     * 获取工厂对象的方法
     *
     * */
    public static SqlSessionFactory getSqlSessionFactory(){
        return sqlSessionFactory;
    }
    //    关闭SqlSession的方法
    public static void close(){
        SqlSession session=threadLocal.get();
        if(session!=null){
            session.close();
            threadLocal.set(null);
        }
    }
}