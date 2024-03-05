package uz.pdp.g34webservlet.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class CalculatorActionServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer a = Integer.parseInt(req.getParameter("a"));
        Integer b = Integer.parseInt(req.getParameter("b"));
        String action = req.getParameter("action");

        System.out.println(a);
        System.out.println(b);
        System.out.println(action);

        Integer result = null;

        switch (action) {
            case "+" -> result = a + b;
            case "-" -> result = a - b;
            case "*" -> result = a * b;
            case "/" -> result = a / b;
        }
        String answer = a + " " + action + " " + b +" = " + result;
        resp.getWriter().write("""
                <h3>%s</h3>
                <br>
                <br>
                <a href="/calculator">Calculator</a>
                """.formatted(answer));

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer a = Integer.parseInt(req.getParameter("a"));
        Integer b = Integer.parseInt(req.getParameter("b"));
        String action = req.getParameter("action");

        System.out.println(a);
        System.out.println(b);
        System.out.println(action);

        Integer result = null;

        switch (action) {
            case "+" -> result = a + b;
            case "-" -> result = a - b;
            case "*" -> result = a * b;
            case "/" -> result = a / b;
        }
        String answer = a + " " + action + " " + b +" = " + result;
        resp.getWriter().write("""
                <h3>%s</h3>
                <br>
                <br>
                <a href="/calculator">Calculator</a>
                """.formatted(answer));
    }
}
