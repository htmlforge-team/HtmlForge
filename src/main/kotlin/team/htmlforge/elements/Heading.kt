package team.htmlforge.elements

class Heading(private val level: Int, private val text: String) : Element {
    override fun toHtml(): String = "<h$level>$text</h$level>\n"
}
