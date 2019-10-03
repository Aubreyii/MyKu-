package servlet;

import Dao.thingDao;
import entity.thing;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/delthing")
public class thingDeleteServlet extends HttpServlet {
    private thingDao thd=new thingDao();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取参数
        String id=req.getParameter("id");
        String type=req.getParameter("type");
        System.out.println(type);
        System.out.println("已经获取参数");
        //执行删除或者锁定
        if("lock".equals(type)){
            //执行状态更新操作：update
            thing thi=new thing();
            thi.setId(Integer.parseInt(id));
            thi.setAch(1);
            thd.updateThing(thi);
        }else if("del".equals(type)){
            //执行的删除操作：delete
            thd.deletething(Integer.parseInt(id));
            System.out.println("删除的是编号为"+Integer.parseInt(id)+"的事件");
        }else if("guoqi".equals(type)){
            //执行事件过期操作
            thing thi=new thing();
            thi.setId(Integer.parseInt(id));
            thi.setAch(2);
            thd.updateThing(thi);
        }
        //跳转到首页
        resp.sendRedirect("index");
    }
}
