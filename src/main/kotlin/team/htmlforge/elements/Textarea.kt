package team.htmlforge.elements

class Textarea(private val name: String, private val placeholder: String, private val rows: Int, private val cols: Int) : Element {
    override fun toHtml(): String = "<textarea name=\"$name\" placeholder=\"$placeholder\" rows=\"$rows\" cols=\"$cols\"></textarea>\n"
}
