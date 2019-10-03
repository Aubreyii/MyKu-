package Dao;

import utils.SqlSessionFactoryUtils;
import entity.thing;
import org.apache.ibatis.session.SqlSession;
import java.util.List;

public class thingDao {
    private SqlSession sqlSession;
    private List<thing> list;
    private thing thi;

    private SqlSession getSession(){
        sqlSession= SqlSessionFactoryUtils.getSqlSessionFactory().openSession();
        return sqlSession;
    }
    public List<thing> findAll(){
        try {
            list=getSession().selectList("findThing");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
        return list;
    }
    public thing findById(Integer id){
        try {
            thi=getSession().selectOne("findThing",new thing(id));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
        return thi;
    }
//    增加一个新用户数据到数据库的方法
    public thing addThing(thing thi){
        try {
            //返回值：是insert执行过程中影响的行数
            getSession().insert("addThing",thi);
            sqlSession.commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
        return thi;
    }
//    用于修改事件的方法
    public thing updateThing(thing thi){
        try {

            getSession().update("updatething",thi);
            sqlSession.commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
        return thi;
    }
    public void deletething(Integer id){
        try {
            getSession().delete("delthing",id);
            sqlSession.commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }
}
