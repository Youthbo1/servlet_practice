import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Administrator on 2018/1/14.
 */
@WebServlet(name = "LifeServlet", urlPatterns = "/life")
public class LifeServlet extends HttpServlet {


    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        System.out.println("service()");
    }

    @Override
    public void destroy() {
        System.out.println("destroy()");
    }

    @Override
    public void init(ServletConfig config) throws ServletException {

        System.out.println("init");
    }


}
