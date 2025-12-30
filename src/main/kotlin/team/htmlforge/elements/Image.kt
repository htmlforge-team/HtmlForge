package team.htmlforge.elements

class Image(private val src: String, private val alt: String) : Element {
    override fun toHtml(): String = "<img src=\"$src\" alt=\"$alt\"/>\n"
}
