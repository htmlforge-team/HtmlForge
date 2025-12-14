package team.htmlforge.elements;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StrongTest {

    @Test
    void testConstructorAndToHtml() {
        Strong strong = new Strong("Bold text");

        String expectedHtml = "<strong>Bold text</strong>\n";
        assertEquals(expectedHtml, strong.toHtml());
    }

    @Test
    void testWithEmptyContent() {
        Strong strong = new Strong("");

        String expectedHtml = "<strong></strong>\n";
        assertEquals(expectedHtml, strong.toHtml());
    }

    @Test
    void testWithSpecialCharacters() {
        Strong strong = new Strong("Text with <special> & \"characters\"");

        String expectedHtml = "<strong>Text with <special> & \"characters\"</strong>\n";
        assertEquals(expectedHtml, strong.toHtml());
    }

    @Test
    void testWithLongText() {
        String longText = "This is a very long text that should be displayed in bold.";
        Strong strong = new Strong(longText);

        String expectedHtml = "<strong>" + longText + "</strong>\n";
        assertEquals(expectedHtml, strong.toHtml());
    }

    @Test
    void testImplementsElement() {
        Strong strong = new Strong("Test");
        assertTrue(strong instanceof Element);
    }
}

