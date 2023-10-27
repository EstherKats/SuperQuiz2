package fr.euroforma.superquiz.data;

import java.util.List;

public class Question {

    private final String question;
    private final List<String> choiceList;
    private final int answerIndex;

    public Question(String question, List<String> choiceList, int answerIndex) {
        this.question = question;
        this.choiceList = choiceList;
        this.answerIndex = answerIndex;
    }
}
