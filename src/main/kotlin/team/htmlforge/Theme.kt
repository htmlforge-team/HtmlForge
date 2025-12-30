package team.htmlforge

enum class Theme(private val themeName: String) {
    CODIX("Codix"),
    MINIMAL("Minimal"),
    MINIMAL_DARK("MinimalDark"),
    LUXURY("Luxury");

    fun getThemeName(): String = themeName

    fun getStylePath(): String = "themes/$themeName/style.css"

    fun getThemeDirectory(): String = "themes/$themeName"

    companion object {
        private const val THEME_JSON_URL = "https://htmlforge-team.github.io/HtmlForge/themes/themes.json"
        fun getThemeJsonUrl(): String = THEME_JSON_URL
    }
}
