package com.messageboard.message;

import com.messageboard.topic.add.Topic;
import com.messageboard.topic.add.TopicService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/message.co")
public class MessageServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    MessageService messageService = new MessageService();
    TopicService topicService=new TopicService();

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/views/message.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("topics", topicService.retrieveTopic());
        String newMessage = request.getParameter("message");
        request.getSession().setAttribute("message",newMessage);
        response.sendRedirect("/message.co");
    }


}
