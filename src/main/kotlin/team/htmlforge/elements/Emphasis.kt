package team.htmlforge.elements

class Emphasis(private val content: String) : Element {
    override fun toHtml(): String = "<em>$content</em>"
}
