
package proxy_pattern;

import java.util.HashMap;
import java.util.Map;



// RealSubject class
abstract class RealExam implements Exam {
    private Map<String, String> answers;

    public RealExam() {
        answers = new HashMap<>();
        // Load actual exam questions and answers
        loadExam();
    }

    public void loadExam() {
        // Simulate loading questions and answers
        System.out.println("Loading exam questions and answers...");
        // In a real-world scenario, this would involve fetching data from a database or file.
        // For simplicity, we're using a predefined set of questions and answers here.
        answers.put("Q1", "A");
        answers.put("Q2", "B");
        answers.put("Q3", "C");
        // ...
    }

    public void displayResults(String studentName) {
        // Simulate displaying results
        System.out.println("Displaying results for " + studentName + ": " + answers.get("Q1") + ", " +
                answers.get("Q2") + ", " + answers.get("Q3") + ", ...");
    }

    public void addAnswers(String studentName, Map<String, String> studentAnswers) {
        // Simulate adding answers for a student
        ExamResults examResults = new ExamResults();
        for (Map.Entry<String, String> entry : studentAnswers.entrySet()) {
            examResults.addAnswer(entry.getKey(), entry.getValue());
        }
        this.answers.put(studentName, examResults.toString());
    }

    // Method to get answers for a student
    public Map<String, String> getStudentAnswers(String studentName) {
        // Simulate fetching answers for a specific student
        // In a real-world scenario, this would involve checking the student's record.
        Map<String, String> studentAnswers = new HashMap<>();
        studentAnswers.put("Q1", "A");
        studentAnswers.put("Q2", "B");
        studentAnswers.put("Q3", "C");
        // ...
        return studentAnswers;
    }
}

    
    
