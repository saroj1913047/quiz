package com.org.personal.dao;

import com.org.personal.model.Questions;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import static com.org.personal.connection.ConnectionFactory.getConnection;

public class QuestionsDao {

    public Questions questions(int id){
        Questions questions = null;
        try{
            PreparedStatement statement = getConnection().prepareStatement("select * from questions where id = ?");
            statement.setInt(1, id);
            ResultSet rs = statement.executeQuery();
            if(rs.next()){

                String question = rs.getString("question");
                String option1 = rs.getString("option1");
                String option2 = rs.getString("option2");
                String option3 = rs.getString("option3");
                String option4 = rs.getString("option4");
                String correct = rs.getString("correct");
                questions = new Questions(question, option1, option2, option3, option4, correct);

            }
        } catch (Exception e) {
            e.getMessage();
        }
        return questions;
    }
}
