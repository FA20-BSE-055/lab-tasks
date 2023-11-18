/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package proxy_pattern;

import java.util.Map;

public interface Exam {
    void loadQuestions();
    void answerQuestion(int questionNumber, String answer);
    void submitAnswers();
    List<ExamResult> getExamResults();

    public void addAnswers(String student1, Map<String, String> studentAnswers1);

    public void loadExam();

    public void displayResults(String teacher);
}
