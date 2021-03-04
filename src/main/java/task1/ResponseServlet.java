package task1;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;

public class ResponseServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Enumeration<String> parameterNames = req.getParameterNames();
        Iterator<String> stringIterator = parameterNames.asIterator();
        while (stringIterator.hasNext()){
            String next = stringIterator.next();
            resp.getWriter().println("<p><ol><li>" + next + ": " +
                    req.getParameter(next) + "</li></ol></p>");
        }
    }
}
