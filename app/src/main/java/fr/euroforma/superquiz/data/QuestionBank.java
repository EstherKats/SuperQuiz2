package fr.euroforma.superquiz.data;

import java.util.Arrays;
import java.util.List;

public class QuestionBank {

        public List<Question> getQuestions() {
            return Arrays.asList(
                    new Question(
                            "How old am I?",
                            Arrays.asList(
                                    "19",
                                    "21",
                                    "18",
                                    "25"
                            ),
                            0
                    ),
                    new Question(
                            "What's my date of birth?",
                            Arrays.asList(
                                    "08/12/2008",
                                    "29/08/2001",
                                    "15/01/2005",
                                    "04/03/2004"
                            ),
                            3
                    ),
                    new Question(
                            "Where was I born?",
                            Arrays.asList(
                                    "Tel Aviv",
                                    "Manchester",
                                    "Paris",
                                    "Newcastle"
                            ),
                            3
                    ),
                    new Question(
                            "How many siblings do I have?",
                            Arrays.asList(
                                    "5",
                                    "9",
                                    "10",
                                    "7"
                            ),
                            1
                    ),
                    new Question(
                            "Which seminary did I go to?",
                            Arrays.asList(
                                    "Beth Elisheva",
                                    "Manchester",
                                    "Gateshead",
                                    "Bnos Sarah"
                            ),
                            3
                    )
            );
        }
        private static QuestionBank instance;
        public static QuestionBank getInstance() {
            if (instance == null) {
                instance = new QuestionBank();
            }
            return instance;
        }
    }

