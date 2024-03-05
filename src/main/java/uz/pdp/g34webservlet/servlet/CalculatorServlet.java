package uz.pdp.g34webservlet.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class CalculatorServlet extends HttpServlet {
    // /books/upload
    // /books/download
    // /books/edit
    // /books/delete
    // /books/update

    // /books - GET getting the one book
    // /books - PUT for updating
    // /books - DELETE for updating
    // /books - POST for creating


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().write("""
                <!DOCTYPE html>
                <html lang="en">
                <head>
                    <meta charset="UTF-8">
                    <title>Calculator</title>
                </head>
                <body>
                                
                <form action="/calculator/action" method="post">
                    <label>
                        A : <input type="number" name="a">
                    </label>
                    <br>
                    <br>
                    <label>
                        <select name="action">
                            <option value="-">-</option>
                            <option value="+">+</option>
                            <option value="*">*</option>
                            <option value="/">/</option>
                        </select>
                    </label>
                    <br>
                    <br>
                    <label>
                        B : <input type="number" name="b">
                    </label>
                    <br>
                    <br>
                    <button type="submit">Calculate</button>
                </form>
                                
                </body>
                </html>
                """);
    }
}
