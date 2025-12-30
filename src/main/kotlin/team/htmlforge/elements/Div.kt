package team.htmlforge.elements

class Div(private var textContent: String? = null, private val className: String? = null, private val id: String? = null) : Element {
    private val children: MutableList<Element> = mutableListOf()

    constructor(content: String) : this(content, null, null)
    constructor(content: String, className: String) : this(content, className, null)
    constructor() : this(null, null, null)
    constructor(className: String, isClassConstructor: Boolean) : this(null, className, null)

    fun add(element: Element): Div {
        children.add(element)
        return this
    }

    fun addText(text: String): Div {
        textContent = if (textContent == null) text else textContent + text
        return this
    }

    fun heading(level: Int, text: String): Div = add(Heading(level, text))

    fun paragraph(content: String): Div = add(Paragraph(content))

    fun div(content: String): Div = add(Div(content))

    fun div(content: String, className: String): Div = add(Div(content, className))

    fun div(nestedDiv: Div): Div = add(nestedDiv)

    fun button(text: String): Div = add(Button(text))

    fun button(text: String, onClick: String): Div = add(Button(text, onClick))

    fun link(url: String, text: String): Div = add(Link(url, text))

    fun image(src: String, alt: String): Div = add(Image(src, alt))

    fun input(type: String, name: String, placeholder: String): Div = add(Input(type, name, placeholder))

    fun textarea(name: String, placeholder: String, rows: Int, cols: Int): Div = add(Textarea(name, placeholder, rows, cols))

    fun listUnordered(vararg items: String): Div = add(ListElement(false, *items))

    fun listOrdered(vararg items: String): Div = add(ListElement(true, *items))

    fun blockQuote(content: String): Div = add(BlockQuote(content))

    fun code(content: String): Div = add(Code(content))

    fun strong(content: String): Div = add(Strong(content))

    fun emphasis(content: String): Div = add(Emphasis(content))

    fun horizontalRule(): Div = add(HorizontalRule())

    override fun toHtml(): String {
        val sb = StringBuilder("<div")

        if (!className.isNullOrEmpty()) {
            sb.append(" class=\"").append(className).append("\"")
        }

        if (!id.isNullOrEmpty()) {
            sb.append(" id=\"").append(id).append("\"")
        }

        sb.append(">")

        if (!textContent.isNullOrEmpty()) {
            sb.append(textContent)
        }

        for (child in children) {
            sb.append(child.toHtml())
        }

        sb.append("</div>\n")
        return sb.toString()
    }
}
