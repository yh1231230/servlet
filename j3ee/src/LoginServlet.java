import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//服务器通过servlet从login.html获得值

public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String password = req.getParameter("password");
     //   String html=null;
       if(name.equals("admin")&&password.equals("123"))
       //    html="<div style='color:green'>success</div>";
           req.getRequestDispatcher("success.html").forward(req,resp);
       else
      //     html="<div style='color:red'>fail</div>";
            resp.sendRedirect("fail.html");
     //  resp.getWriter().println(html);
    }
}
