package team.htmlforge.elements;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DivTest {

    @Test
    void testConstructorWithContent() {
        Div div = new Div("Hello World");
        
        String expectedHtml = "<div>Hello World</div>\n";
        assertEquals(expectedHtml, div.toHtml());
    }

    @Test
    void testConstructorWithContentAndClassName() {
        Div div = new Div("Content", "container");
        
        String expectedHtml = "<div class=\"container\">Content</div>\n";
        assertEquals(expectedHtml, div.toHtml());
    }

    @Test
    void testConstructorWithContentClassAndId() {
        Div div = new Div("Content", "container", "main");
        
        String expectedHtml = "<div class=\"container\" id=\"main\">Content</div>\n";
        assertEquals(expectedHtml, div.toHtml());
    }

    @Test
    void testEmptyConstructor() {
        Div div = new Div();
        
        String expectedHtml = "<div></div>\n";
        assertEquals(expectedHtml, div.toHtml());
    }

    @Test
    void testClassOnlyConstructor() {
        Div div = new Div("wrapper", true);
        
        String expectedHtml = "<div class=\"wrapper\"></div>\n";
        assertEquals(expectedHtml, div.toHtml());
    }

    @Test
    void testAddElement() {
        Div div = new Div();
        div.add(new Paragraph("Test paragraph"));
        
        String expectedHtml = "<div><p>Test paragraph</p>\n</div>\n";
        assertEquals(expectedHtml, div.toHtml());
    }

    @Test
    void testAddText() {
        Div div = new Div();
        div.addText("First text");
        
        String expectedHtml = "<div>First text</div>\n";
        assertEquals(expectedHtml, div.toHtml());
    }

    @Test
    void testAddTextMultipleTimes() {
        Div div = new Div();
        div.addText("First").addText(" Second");
        
        String expectedHtml = "<div>First Second</div>\n";
        assertEquals(expectedHtml, div.toHtml());
    }

    @Test
    void testHeading() {
        Div div = new Div();
        div.heading(1, "Title");
        
        String expectedHtml = "<div><h1>Title</h1>\n</div>\n";
        assertEquals(expectedHtml, div.toHtml());
    }

    @Test
    void testParagraph() {
        Div div = new Div();
        div.paragraph("Text");
        
        String expectedHtml = "<div><p>Text</p>\n</div>\n";
        assertEquals(expectedHtml, div.toHtml());
    }

    @Test
    void testNestedDivWithContent() {
        Div div = new Div();
        div.div("Inner content");
        
        String expectedHtml = "<div><div>Inner content</div>\n</div>\n";
        assertEquals(expectedHtml, div.toHtml());
    }

    @Test
    void testNestedDivWithContentAndClass() {
        Div div = new Div();
        div.div("Inner", "inner-class");
        
        String expectedHtml = "<div><div class=\"inner-class\">Inner</div>\n</div>\n";
        assertEquals(expectedHtml, div.toHtml());
    }

    @Test
    void testNestedDivObject() {
        Div div = new Div();
        Div innerDiv = new Div("Nested");
        div.div(innerDiv);
        
        String expectedHtml = "<div><div>Nested</div>\n</div>\n";
        assertEquals(expectedHtml, div.toHtml());
    }

    @Test
    void testButton() {
        Div div = new Div();
        div.button("Click");
        
        String expectedHtml = "<div><button>Click</button>\n</div>\n";
        assertEquals(expectedHtml, div.toHtml());
    }

    @Test
    void testButtonWithOnClick() {
        Div div = new Div();
        div.button("Submit", "submitForm()");
        
        String expectedHtml = "<div><button onclick=\"submitForm()\">Submit</button>\n</div>\n";
        assertEquals(expectedHtml, div.toHtml());
    }

    @Test
    void testLink() {
        Div div = new Div();
        div.link("https://example.com", "Example");
        
        String expectedHtml = "<div><a href=\"https://example.com\">Example</a>\n</div>\n";
        assertEquals(expectedHtml, div.toHtml());
    }

    @Test
    void testImage() {
        Div div = new Div();
        div.image("image.jpg", "Description");
        
        String expectedHtml = "<div><img src=\"image.jpg\" alt=\"Description\">\n</div>\n";
        assertEquals(expectedHtml, div.toHtml());
    }

    @Test
    void testInput() {
        Div div = new Div();
        div.input("text", "username", "Enter username");
        
        String expectedHtml = "<div><input type=\"text\" name=\"username\" placeholder=\"Enter username\">\n</div>\n";
        assertEquals(expectedHtml, div.toHtml());
    }

    @Test
    void testTextarea() {
        Div div = new Div();
        div.textarea("comment", "Type here", 5, 30);
        
        String expectedHtml = "<div><textarea name=\"comment\" placeholder=\"Type here\" rows=\"5\" cols=\"30\"></textarea>\n</div>\n";
        assertEquals(expectedHtml, div.toHtml());
    }

    @Test
    void testListUnordered() {
        Div div = new Div();
        div.listUnordered("Item 1", "Item 2");
        
        String expectedHtml = "<div><ul>\n<li>Item 1</li>\n<li>Item 2</li>\n</ul>\n</div>\n";
        assertEquals(expectedHtml, div.toHtml());
    }

    @Test
    void testListOrdered() {
        Div div = new Div();
        div.listOrdered("First", "Second");
        
        String expectedHtml = "<div><ol>\n<li>First</li>\n<li>Second</li>\n</ol>\n</div>\n";
        assertEquals(expectedHtml, div.toHtml());
    }

    @Test
    void testBlockQuote() {
        Div div = new Div();
        div.blockQuote("Quote text");
        
        String expectedHtml = "<div><blockquote>Quote text</blockquote>\n</div>\n";
        assertEquals(expectedHtml, div.toHtml());
    }

    @Test
    void testCode() {
        Div div = new Div();
        div.code("System.out.println();");
        
        String expectedHtml = "<div><code>System.out.println();</code>\n</div>\n";
        assertEquals(expectedHtml, div.toHtml());
    }

    @Test
    void testStrong() {
        Div div = new Div();
        div.strong("Bold text");
        
        String expectedHtml = "<div><strong>Bold text</strong>\n</div>\n";
        assertEquals(expectedHtml, div.toHtml());
    }

    @Test
    void testEmphasis() {
        Div div = new Div();
        div.emphasis("Italic text");
        
        String expectedHtml = "<div><em>Italic text</em>\n</div>\n";
        assertEquals(expectedHtml, div.toHtml());
    }

    @Test
    void testHorizontalRule() {
        Div div = new Div();
        div.horizontalRule();
        
        String expectedHtml = "<div><hr>\n</div>\n";
        assertEquals(expectedHtml, div.toHtml());
    }

    @Test
    void testComplexNestedStructure() {
        Div div = new Div("container", true);
        div.heading(1, "Title")
           .paragraph("Description")
           .button("Click me");
        
        String expectedHtml = "<div class=\"container\"><h1>Title</h1>\n<p>Description</p>\n<button>Click me</button>\n</div>\n";
        assertEquals(expectedHtml, div.toHtml());
    }

    @Test
    void testWithNullClassName() {
        Div div = new Div("Content", null);
        
        String expectedHtml = "<div>Content</div>\n";
        assertEquals(expectedHtml, div.toHtml());
    }

    @Test
    void testWithEmptyClassName() {
        Div div = new Div("Content", "");
        
        String expectedHtml = "<div>Content</div>\n";
        assertEquals(expectedHtml, div.toHtml());
    }

    @Test
    void testWithNullId() {
        Div div = new Div("Content", "class", null);
        
        String expectedHtml = "<div class=\"class\">Content</div>\n";
        assertEquals(expectedHtml, div.toHtml());
    }

    @Test
    void testWithEmptyId() {
        Div div = new Div("Content", "class", "");
        
        String expectedHtml = "<div class=\"class\">Content</div>\n";
        assertEquals(expectedHtml, div.toHtml());
    }

    @Test
    void testImplementsElement() {
        Div div = new Div();
        assertTrue(div instanceof Element);
    }

    @Test
    void testFluentChaining() {
        Div div = new Div();
        Div result = div.paragraph("Test");
        
        assertSame(div, result, "Fluent methods should return the same instance");
    }
}

