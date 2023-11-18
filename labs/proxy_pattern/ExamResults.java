/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proxy_pattern;

import java.util.HashMap;
import java.util.Map;

class ExamResults implements Clonable {
    private Map<String, String> answers;

    public ExamResults() {
        answers = new HashMap<>();
    }

    public void addAnswer(String question, String answer) {
        answers.put(question, answer);
    }

    public Map<String, String> getAnswers() {
        return new HashMap<>(answers);
    }

    @Override
    public Clonable clone() {
        ExamResults clone = new ExamResults();
        clone.answers.putAll(this.answers);
        return clone;
    }
}
