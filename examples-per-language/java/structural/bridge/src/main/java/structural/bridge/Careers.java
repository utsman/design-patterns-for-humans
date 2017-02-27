package structural.bridge;

public class Careers extends WebPage {
    private final Theme theme;

    public Careers(Theme theme) {
        this.theme = theme;
    }

    @Override
    public String getContent() {
        return "Careers page in " + this.theme.getColor();
    }
}
