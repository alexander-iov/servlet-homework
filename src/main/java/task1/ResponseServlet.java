package task1;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;

public class ResponseServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Enumeration<String> parameterNames = req.getParameterNames();
        Iterator<String> stringIterator = parameterNames.asIterator();
        resp.getWriter().println("<p><ol>");
        while (stringIterator.hasNext()) {
            String next = stringIterator.next();
            resp.getWriter().println("<li>" + next + ": " + req.getParameter(next) + "</li>");
        }
        resp.getWriter().println("</p></ol>");
    }
}
