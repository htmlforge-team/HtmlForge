package team.htmlforge.elements

class Input(private val type: String, private val name: String, private val placeholder: String) : Element {
    override fun toHtml(): String = "<input type=\"$type\" name=\"$name\" placeholder=\"$placeholder\"/>\n"
}
