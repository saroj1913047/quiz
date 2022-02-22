package com.org.personal.controller;

import com.org.personal.dao.QuestionsDao;
import com.org.personal.model.Questions;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "QuizController", value = "/quizController")
public class QuizController extends HttpServlet {
    private QuestionsDao questionsDao;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    private void listQuestions(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
        String id = request.getParameter("id");
        if(id == null){
            id = "1";
        }else{
            switch (id){
                case "1": id = "2";
                break;
                case "2": id = "3";
                break;
                case "3": id = "4";
                break;
                case "4": id = "5";
                break;
                case "5": id = "6";
                break;
                case "6": id = "7";
                break;
                case "7": id = "8";
                break;
                case "8": id = "9";
                break;
                case "9": id = "10";
                break;
                case"10":
                    break;

            }
        }
        Questions question = questionsDao.questions();
        request.setAttribute("question", question);
        RequestDispatcher dispatcher = request.getRequestDispatcher("quiz.jsp");
        dispatcher.forward(request, response);
    }
}
