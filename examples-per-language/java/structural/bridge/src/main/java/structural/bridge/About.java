package structural.bridge;

public class About extends WebPage {
    private final Theme theme;

    public About(Theme theme) {
        this.theme = theme;
    }

    @Override
    public String getContent() {
        return "About page in " + this.theme.getColor();
    }
}
