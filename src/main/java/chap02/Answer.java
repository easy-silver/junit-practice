package chap02;

public class Answer {

    private Question question;
    private Boolean bool;
    private String questionText;

    public Answer(Question question, Boolean bool) {
        this.question = question;
        this.bool = bool;
    }

    public String getQuestionText() {
        return questionText;
    }

    public boolean match(Answer answer) {
        return false;
    }

}
