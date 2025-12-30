package team.htmlforge.elements

class BlockQuote(private val content: String) : Element {
    override fun toHtml(): String = "<blockquote>$content</blockquote>\n"
}
