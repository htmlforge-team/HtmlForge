package team.htmlforge.elements

class Button(private val text: String, private val onClick: String? = null) : Element {
    override fun toHtml(): String {
        return if (onClick != null) {
            "<button onclick=\"$onClick\">$text</button>\n"
        } else {
            "<button>$text</button>\n"
        }
    }
}
