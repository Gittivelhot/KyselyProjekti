package hh.ohjelmistoprojekti.kysely.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Poll {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
    private String question;
    private String answer;
    
    public Poll() {
		super();
		this.question = null;
		this.answer = null;
	}
    
	public Poll(Long id, String question, String answer) {
		super();
		this.question = question;
		this.answer = answer;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
		return "Poll [id=" + id + ", question=" + question + ", answer=" + answer + "]";
	}
	





}