package com.messageboard.topic.add;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/deletetopic.co")
public class DeleteTopicServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    TopicService topicService=new TopicService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        topicService.deleteTopic(new Topic(request.getParameter("topic")));
        response.sendRedirect("/listtopic.co");
    }
}
