package team.htmlforge.elements

class Paragraph(private val content: String) : Element {
    override fun toHtml(): String = "<p>$content</p>\n"
}
