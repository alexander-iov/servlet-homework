package task2;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Iterator;

public class MyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
        String blockedQueryParam = "Stanislav";
        Iterator<String> stringIterator = req.getParameterNames().asIterator();
        while (stringIterator.hasNext()) {
            String next = stringIterator.next();
            if (next.equals(blockedQueryParam)) {
                resp.setStatus(400);
            } else {
                resp.setStatus(200);
            }
        }
    }
}
