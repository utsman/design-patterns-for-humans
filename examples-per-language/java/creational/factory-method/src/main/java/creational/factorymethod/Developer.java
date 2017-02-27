package creational.factorymethod;

public class Developer implements Interviewer {
    @Override
    public String askQuestions() {
        return "Asking about design patterns!";
    }
}
