package nesada.c4q.nyc.KeyboardKeyTest.backend;

/**
 * Created by nesadakoca on 1/11/17.
 */

public class KeyboardKey {
    private final String name;
    private final String textColor;
    private final String url;

    public KeyboardKey(String name, String textColor, String url) {
        this.name = name;
        this.textColor = textColor;
        this.url = url;
    }

    public String getUrlPath() {
        return url;
    }

    public String getTextColor() {
        return textColor;
    }

    public String getName() {
        return name;
    }
}