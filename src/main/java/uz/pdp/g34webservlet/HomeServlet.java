package uz.pdp.g34webservlet;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class HomeServlet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws IOException {
        PrintWriter writer = servletResponse.getWriter();
        String username = servletRequest.getParameter("username");
        String gender = servletRequest.getParameter("gender");
        writer.write("""
                <!DOCTYPE html>
                <html lang="en">
                <head>
                    <meta charset="UTF-8">
                    <title>Home</title>
                </head>
                <body>
                <h3>Welcome PDP!</h3>
                <h2>%s</h2>
                <h2>%s</h2>
                </body>
                </html>
                """.formatted(username, gender));
    }
}
