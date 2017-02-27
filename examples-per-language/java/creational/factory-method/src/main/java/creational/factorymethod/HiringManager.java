package creational.factorymethod;

public abstract class HiringManager {
    public abstract Interviewer makeInterviewer();

    public String takeInterview() {
        return makeInterviewer().askQuestions();
    }
}
