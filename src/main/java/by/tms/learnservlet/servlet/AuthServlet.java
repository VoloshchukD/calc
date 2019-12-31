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
        if( req.getSession().getAttribute("currentUser") == null ) {
            String login = req.getParameter("loginA");
            String password = req.getParameter("passwordA");
            User userA = new User();
            userA.setLogin(login);
            userA.setPassword(password);
            for (User user1 : ((List<User>) getServletContext().getAttribute("users"))) {
                if (user1.equals(userA)) {
                    req.getSession().setAttribute("currentUser", user1);
                }
            }
            if (userA.equals(new User("ADMIN", "321"))) {
                userA.setName("---");
                userA.setAge(999);
                req.getSession().setAttribute("ADMIN", userA);
                resp.sendRedirect("/ls1pr_war_exploded/admin");
            } else {
                if (req.getSession().getAttribute("currentUser") != null) {
                    resp.sendRedirect("/ls1pr_war_exploded/calc");
                } else {
                    resp.sendRedirect("/ls1pr_war_exploded/errorPage.jsp");
                }

            }
        } else{
            resp.sendRedirect("/ls1pr_war_exploded/errorPage.jsp");
        }
    }

}
