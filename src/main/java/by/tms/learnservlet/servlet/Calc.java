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

@WebServlet(urlPatterns = "/calc")
public class Calc extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {



        req.getRequestDispatcher("/calc.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        if (req.getSession().getAttribute("currentUser") != null) {

            String num1s = req.getParameter("num1");
            String op = req.getParameter("op");
            String num2s = req.getParameter("num2");
            int num1 = Integer.parseInt(num1s);
            int num2 = Integer.parseInt(num2s);
            int rest = 0;
            String rltStr = null;

            if (op.equals("+")) {
                rest = (num1 + num2);
            } else if (op.equals("-")) {
                rest = (num1 - num2);
            } else if (op.equals("*")) {
                rest = (num1 * num2);
            } else if (op.equals("/")) {
                rest = (num1 / num2);
            }
            rltStr = (num1s + op + num2s + "=" + rest);
            req.getSession().setAttribute("result", rest);
            resp.sendRedirect("/ls1pr_war_exploded/calc.jsp");

            if (req.getSession().getAttribute("history") == null) {
                req.getSession().setAttribute("history", new ArrayList<String>());
            }

            List<String> history = (List<String>) req.getSession().getAttribute("history");
            history.add(rltStr);
        }


    }

}
