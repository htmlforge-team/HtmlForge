package team.htmlforge.elements

class Code(private val content: String) : Element {
    override fun toHtml(): String = "<code>$content</code>\n"
}
