package team.htmlforge.elements

class Strong(private val content: String) : Element {
    override fun toHtml(): String = "<strong>$content</strong>"
}
