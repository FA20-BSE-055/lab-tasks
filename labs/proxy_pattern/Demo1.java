
package proxy_pattern;

import java.util.HashMap;
import java.util.Map;


public class Demo1 {
    public static void main(String[] args) {
        // Using the Proxy to conduct the exam
        Exam examProxy = new ExamProxy() {
            
        };

        // Student views results
        examProxy.loadExam();
        examProxy.displayResults("Student");

        // Students add their answers
        Map<String, String> studentAnswers1 = new HashMap<>();
        studentAnswers1.put("Q1", "A");
        studentAnswers1.put("Q2", "B");
        studentAnswers1.put("Q3", "C");

        Map<String, String> studentAnswers2 = new HashMap<>();
        studentAnswers2.put("Q1", "B");
        studentAnswers2.put("Q2", "C");
        studentAnswers2.put("Q3", "A");

        // Students add their answers to the exam
        examProxy.addAnswers("Student1", studentAnswers1);
        examProxy.addAnswers("Student2", studentAnswers2);

        System.out.println();

        // Teacher views results
        examProxy.loadExam();
        examProxy.displayResults("Teacher");
    }
}
