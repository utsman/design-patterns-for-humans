package creational.singleton;

public final class President {
    private static President instance;

    private President() {}

    public static synchronized President getInstance() {
        if (instance == null) {
            instance = new President();
        }
        return instance;
    }

}
