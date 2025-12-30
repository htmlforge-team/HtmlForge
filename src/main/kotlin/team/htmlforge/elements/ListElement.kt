package team.htmlforge.elements

class ListElement(private val ordered: Boolean, private vararg val items: String) : Element {
    override fun toHtml(): String {
        val tag = if (ordered) "ol" else "ul"
        val sb = StringBuilder("<$tag>\n")
        for (item in items) {
            sb.append("  <li>$item</li>\n")
        }
        sb.append("</$tag>\n")
        return sb.toString()
    }
}
