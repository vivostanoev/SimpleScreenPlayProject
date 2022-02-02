package actions.navigation;

public enum PageNavigation {
    MAIN_PAGE("https://www.saucedemo.com/"),
    CART("https://www.saucedemo.com/cart.html");

    private final String url;

    PageNavigation(String url) {
        this.url = url;
    }

    public String url() {
        return url;
    }
}

