package dev.kxrim.elements;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ParagraphTest {

    @Test
    void testConstructorAndToHtml() {
        Paragraph paragraph = new Paragraph("This is a paragraph.");

        String expectedHtml = "<p>This is a paragraph.</p>\n";
        assertEquals(expectedHtml, paragraph.toHtml());
    }

    @Test
    void testWithEmptyContent() {
        Paragraph paragraph = new Paragraph("");

        String expectedHtml = "<p></p>\n";
        assertEquals(expectedHtml, paragraph.toHtml());
    }

    @Test
    void testWithLongContent() {
        String longText = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. " +
                         "Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.";
        Paragraph paragraph = new Paragraph(longText);

        String expectedHtml = "<p>" + longText + "</p>\n";
        assertEquals(expectedHtml, paragraph.toHtml());
    }

    @Test
    void testWithSpecialCharacters() {
        Paragraph paragraph = new Paragraph("Text with <special> & \"characters\"");

        String expectedHtml = "<p>Text with <special> & \"characters\"</p>\n";
        assertEquals(expectedHtml, paragraph.toHtml());
    }

    @Test
    void testWithLineBreaks() {
        Paragraph paragraph = new Paragraph("Line 1\nLine 2\nLine 3");

        String expectedHtml = "<p>Line 1\nLine 2\nLine 3</p>\n";
        assertEquals(expectedHtml, paragraph.toHtml());
    }

    @Test
    void testImplementsElement() {
        Paragraph paragraph = new Paragraph("Test");
        assertTrue(paragraph instanceof Element);
    }
}

