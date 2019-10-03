package servlet;

import Dao.thingDao;
import entity.thing;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

@WebServlet("/addThing")
public class thingAddServlet extends HttpServlet {
    private thingDao thingdao=new thingDao();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取要添加的用户数据
        String me=req.getParameter("me");
        String others=req.getParameter("others");
        String gob=req.getParameter("gob");
        String dotime=req.getParameter("dotime");
        String place=req.getParameter("place");
        String content=req.getParameter("content");
        //根据用户数据创建一个用户对象
        thing thi=new thing(me,others,gob,new Date(),dotime,place,content);

        //将对象用户添加到数据库中
        thi=thingdao.addThing(thi);
        //查看刚新增的用户数据
        resp.sendRedirect("detail?id=" + thi.getId());
    }
}
