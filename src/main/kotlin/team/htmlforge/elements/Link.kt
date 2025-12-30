package team.htmlforge.elements

class Link(private val url: String, private val text: String) : Element {
    override fun toHtml(): String = "<a href=\"$url\">$text</a>\n"
}
