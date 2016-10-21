package webcam.wewatchyour.BufferUtils;

import java.util.ArrayList;
import java.util.Arrays;

public class QuestionBuffer {

	private int questionNumber;
	private int questionType;// 0-multiple choice 1-true/false 2-free response
	private String question;
	private ArrayList<String> answerChoices;

	public QuestionBuffer(int questionNumber, int questionType, String question, ArrayList<String> answerChoices) {
		this.questionNumber = questionNumber;
		this.question = question;
		switch (questionType) {
		case 0:
			this.answerChoices = answerChoices;
			break;
		case 1:
			answerChoices = new ArrayList<String>();
			answerChoices.add("True");
			answerChoices.add("False");
			break;
		case 2:
			answerChoices = null;
		}
		
	}
	
	public void dequeue(){
		
	}
}
