package com.java;

public class QuizMasterService {

	private QuizMaster quizMaster = new SpringQuizMaster();

	public void askQuestion() {
		System.out.println(quizMaster.popQuestion());
	}
}
