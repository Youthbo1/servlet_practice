import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Demo4Servlet")
public class Demo4Servlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // 转发带数据给某个jsp页面   request.传参
        // request.setAttribute("username", "王二麻子 ");
        // request.getRequestDispatcher("/demo.jsp").forward(request, response);

        // 通过重定向带数据过去,全局传参
        ServletContext sc = this.getServletContext();
        sc.setAttribute("goods", "娃娃");
        response.sendRedirect("/demo.jsp");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

}
