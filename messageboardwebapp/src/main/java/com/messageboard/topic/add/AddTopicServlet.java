package com.messageboard.topic.add;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns="/listtopic.co")
public class AddTopicServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    TopicService topicService=new TopicService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("topics", topicService.retrieveTopic());
        request.getRequestDispatcher("/WEB-INF/views/listTopic.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            String newTopic = request.getParameter("topic");
            topicService.addtopic(new Topic(newTopic));
            response.sendRedirect("/listtopic.co");
    }
}
