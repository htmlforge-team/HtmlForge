package dev.kxrim;

public enum Theme {
    CODIX("Codix"),

    MINIMAL("Minimal");

    private final String themeName;
    private static final String THEME_JSON_URL = "https://raw.githubusercontent.com/KerYagciHTL/HtmlForge/main/themes/themes.json";

    Theme(String themeName) {
        this.themeName = themeName;
    }

    public String getThemeName() {
        return themeName;
    }

    public String getStylePath() {
        return "themes/" + themeName + "/style.css";
    }

    public String getThemeDirectory() {
        return "themes/" + themeName;
    }

    public static String getThemeJsonUrl() {
        return THEME_JSON_URL;
    }
}

