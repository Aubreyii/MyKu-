package servlet;

import Dao.thingDao;
import entity.thing;
import org.apache.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/detail")
public class thingFindServlet extends HttpServlet {
    /*
    创建对应的日志记录对象【DEBUG\WARN\INFO\LOG】
    */
    private Logger log=Logger.getLogger(thingFindServlet.class);
    private thingDao tDao=new thingDao();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id=req.getParameter("id");

        log.info("获取到查询参数id→→"+id);

        thing thi= tDao.findById(Integer.parseInt(id));

        log.info("查询数完成，查询到的数据："+thi.toString());

        req.setAttribute("thing",thi);

        req.getRequestDispatcher("detail.jsp").forward(req,resp);
    }
}
