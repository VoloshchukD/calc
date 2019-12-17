package by.tms.learnservlet.servlet;

import by.tms.learnservlet.entity.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(urlPatterns = "/reg", name = "RegServlet")
public class RegServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/reg.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String age = req.getParameter("age");
        String login = req.getParameter("login");
        String password = req.getParameter("password");

        if(name != null && age != null){
            User user = new User(name, Integer.parseInt(age), login, password);
            if(getServletContext().getAttribute("users") == null){
                getServletContext().setAttribute("users", new ArrayList<User>());
            }
            List<User> users = (List<User>) getServletContext().getAttribute("users");
            if(users.add(user)){
                req.getServletContext().setAttribute("lastRegUserName",name);
            }
            }
        resp.sendRedirect("/ls1pr_war_exploded/reg.jsp");
        }

}
