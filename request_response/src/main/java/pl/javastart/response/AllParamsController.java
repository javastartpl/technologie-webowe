package pl.javastart.response;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

@WebServlet("/allparams")
public class AllParamsController extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        setContentType(response);
        sendHtmlResponse(request, response);
    }

    private void setContentType(HttpServletResponse response) {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
    }

    private void sendHtmlResponse(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Map<String, String[]> parameterMap = request.getParameterMap();
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<head></head>");
        writer.println("<body>");
        writer.println("<ol>");
        for (String key : parameterMap.keySet()) {
            writer.printf("<li>%s</li>\n", key);
            writer.println("<ul>");
            for (String value : parameterMap.get(key)) {
                writer.printf("<li>%s</li>\n", value);
            }
            writer.println("</ul>");
        }
        writer.println("</ol>");
        writer.println("</body>");
        writer.println("</html>");
    }
}
