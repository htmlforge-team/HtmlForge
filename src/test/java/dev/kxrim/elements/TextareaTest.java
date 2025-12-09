package dev.kxrim.elements;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TextareaTest {

    @Test
    void testConstructorAndToHtml() {
        Textarea textarea = new Textarea("comment", "Enter your comment", 5, 30);

        String expectedHtml = "<textarea name=\"comment\" placeholder=\"Enter your comment\" rows=\"5\" cols=\"30\"></textarea>\n";
        assertEquals(expectedHtml, textarea.toHtml());
    }

    @Test
    void testWithDifferentDimensions() {
        Textarea textarea = new Textarea("notes", "Type here", 10, 50);

        String expectedHtml = "<textarea name=\"notes\" placeholder=\"Type here\" rows=\"10\" cols=\"50\"></textarea>\n";
        assertEquals(expectedHtml, textarea.toHtml());
    }

    @Test
    void testWithSmallDimensions() {
        Textarea textarea = new Textarea("small", "Small", 2, 10);

        String expectedHtml = "<textarea name=\"small\" placeholder=\"Small\" rows=\"2\" cols=\"10\"></textarea>\n";
        assertEquals(expectedHtml, textarea.toHtml());
    }

    @Test
    void testWithEmptyPlaceholder() {
        Textarea textarea = new Textarea("field", "", 3, 20);

        String expectedHtml = "<textarea name=\"field\" placeholder=\"\" rows=\"3\" cols=\"20\"></textarea>\n";
        assertEquals(expectedHtml, textarea.toHtml());
    }

    @Test
    void testWithSpecialCharacters() {
        Textarea textarea = new Textarea("msg", "Enter \"message\" & save", 4, 25);

        String expectedHtml = "<textarea name=\"msg\" placeholder=\"Enter \"message\" & save\" rows=\"4\" cols=\"25\"></textarea>\n";
        assertEquals(expectedHtml, textarea.toHtml());
    }

    @Test
    void testWithZeroRows() {
        Textarea textarea = new Textarea("test", "Test", 0, 20);

        String expectedHtml = "<textarea name=\"test\" placeholder=\"Test\" rows=\"0\" cols=\"20\"></textarea>\n";
        assertEquals(expectedHtml, textarea.toHtml());
    }

    @Test
    void testWithZeroCols() {
        Textarea textarea = new Textarea("test", "Test", 5, 0);

        String expectedHtml = "<textarea name=\"test\" placeholder=\"Test\" rows=\"5\" cols=\"0\"></textarea>\n";
        assertEquals(expectedHtml, textarea.toHtml());
    }

    @Test
    void testImplementsElement() {
        Textarea textarea = new Textarea("test", "Test", 5, 30);
        assertTrue(textarea instanceof Element);
    }
}

