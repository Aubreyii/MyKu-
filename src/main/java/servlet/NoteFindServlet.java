package servlet;

        import Dao.thingDao;
        import entity.thing;

        import javax.servlet.ServletException;
        import javax.servlet.annotation.WebServlet;
        import javax.servlet.http.HttpServlet;
        import javax.servlet.http.HttpServletRequest;
        import javax.servlet.http.HttpServletResponse;
        import java.io.IOException;
        import java.util.List;
@WebServlet("/index")
public class NoteFindServlet extends HttpServlet {
    private thingDao thDao= new thingDao();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<thing> list=thDao.findAll();
        req.setAttribute("thingList",list);
        req.getRequestDispatcher("index.jsp").forward(req,resp);
    }
}
