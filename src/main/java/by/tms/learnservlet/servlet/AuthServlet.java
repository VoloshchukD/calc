package by.tms.learnservlet.servlet;

import by.tms.learnservlet.entity.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/auth", name = "AuthServlet")
public class AuthServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/auth.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("login");
        String password = req.getParameter("password");
        User userA = new User();
        userA.setLogin(login);
        userA.setPassword(password);
        for (User user1 : ((List<User>) getServletContext().getAttribute("users"))) {
            if (user1.equals(userA)) {
                req.getSession().setAttribute("currentUser", user1);
            }
        }
        resp.sendRedirect("/ls1pr_war_exploded/auth.jsp");
    }



}
