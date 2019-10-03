package servlet;

import Dao.thingDao;
import entity.thing;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/updatething")
public class thingUpdataServlet extends HttpServlet {
    private thingDao thingdao=new thingDao();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取用户要更新的数据
        String id=req.getParameter("id");
        String me=req.getParameter("me");
        String others=req.getParameter("others");
        String gob=req.getParameter("gob");
        String dotime=req.getParameter("dotime");
        String place=req.getParameter("place");
        String content=req.getParameter("content");
        //创建事件对象
        thing thi=new thing(Integer.parseInt(id),me,others,gob,dotime,place,content);
        //提交更新
        thingdao.updateThing(thi);
        //查看更新后的数据
        resp.sendRedirect("detail?id="+thi.getId());
    }
}
