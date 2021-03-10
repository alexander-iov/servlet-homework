package task2;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Iterator;

public class MyServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        super.init();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
        Iterator<String> stringIterator = req.getParameterNames().asIterator();
        while (stringIterator.hasNext()) {
            String next = stringIterator.next();
            if (next.equals(getServletConfig().getInitParameter("blockedQueryParam"))) {
                resp.setStatus(400);
                return;
            }
        }
    }
}
