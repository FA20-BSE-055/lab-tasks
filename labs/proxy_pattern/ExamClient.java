
package proxy_pattern;

import java.util.HashMap;
import java.util.Map;

// Subject interface
interface Exam {
    void loadExam(); // Virtual Proxy method
    void displayResults(String studentName); // Protected Proxy method
}

// RealSubject class
class RealExam implements Exam {
    private Map<String, String> answers;

    public RealExam() {
        answers = new HashMap<>();
        // Load actual exam questions and answers
        loadExam();
    }

    @Override
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

    @Override
    public void displayResults(String studentName) {
        // Simulate displaying results
        System.out.println("Displaying results for " + studentName + ": " + answers.get("Q1") + ", " +
                answers.get("Q2") + ", " + answers.get("Q3") + ", ...");
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

// Proxy class
class ExamProxy implements Exam {
    private RealExam realExam;
    private Map<String, String> cachedAnswers;

    public ExamProxy() {
        // Smart Proxy: Create the RealExam object only when required
        System.out.println("Smart Proxy created");
    }

    @Override
    public void loadExam() {
        // Virtual Proxy: Load the exam on demand
        if (realExam == null) {
            realExam = new RealExam();
            cachedAnswers = new HashMap<>(realExam.getStudentAnswers("Teacher"));
        }
        System.out.println("Virtual Proxy: Exam loaded");
    }

    @Override
    public void displayResults(String studentName) {
        // Protected Proxy: Display results based on the user
        if (studentName.equals("Teacher")) {
            // Teacher sees all results
            System.out.println("Protected Proxy: Displaying all results to the teacher");
            realExam.displayResults(studentName);
        } else {
            // Students see only their results
            System.out.println("Protected Proxy: Displaying results to the student");
            Map<String, String> studentAnswers = cachedAnswers;
            System.out.println("Results: " + studentAnswers.get("Q1") + ", " +
                    studentAnswers.get("Q2") + ", " + studentAnswers.get("Q3") + ", ...");
        }
    }
}

// Client class
public class ExamClient {
    public static void main(String[] args) {
        // Using the Proxy to conduct the exam
        Exam examProxy = new ExamProxy();

        // Student views results
        examProxy.loadExam();
        examProxy.displayResults("Student");

        System.out.println();

        // Teacher views results
        examProxy.loadExam();
        examProxy.displayResults("Teacher");
    }
}
