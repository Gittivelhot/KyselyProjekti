package hh.ohjelmistoprojekti.kysely.domain;


public class Poll {
	
    private String question;
    private String answer;

    public Poll(String question, String answer) {
        super();
        this.question = question;
        this.answer = answer;
    }

    public Poll() {
        super();
        this.question = null;
        this.answer = null;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "Poll [question=" + question + ", answer=" + answer + "]";
    }



}