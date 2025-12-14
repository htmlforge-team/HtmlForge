package team.htmlforge.elements;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LinkTest {

    @Test
    void testConstructorAndToHtml() {
        Link link = new Link("https://example.com", "Example Website");

        String expectedHtml = "<a href=\"https://example.com\">Example Website</a>\n";
        assertEquals(expectedHtml, link.toHtml());
    }

    @Test
    void testWithRelativeUrl() {
        Link link = new Link("/about", "About Us");

        String expectedHtml = "<a href=\"/about\">About Us</a>\n";
        assertEquals(expectedHtml, link.toHtml());
    }

    @Test
    void testWithAnchor() {
        Link link = new Link("#section1", "Go to Section 1");

        String expectedHtml = "<a href=\"#section1\">Go to Section 1</a>\n";
        assertEquals(expectedHtml, link.toHtml());
    }

    @Test
    void testWithEmptyText() {
        Link link = new Link("https://example.com", "");

        String expectedHtml = "<a href=\"https://example.com\"></a>\n";
        assertEquals(expectedHtml, link.toHtml());
    }

    @Test
    void testWithSpecialCharacters() {
        Link link = new Link("https://example.com?q=test&lang=en", "Search \"test\"");

        String expectedHtml = "<a href=\"https://example.com?q=test&lang=en\">Search \"test\"</a>\n";
        assertEquals(expectedHtml, link.toHtml());
    }

    @Test
    void testWithMailto() {
        Link link = new Link("mailto:test@example.com", "Email Us");

        String expectedHtml = "<a href=\"mailto:test@example.com\">Email Us</a>\n";
        assertEquals(expectedHtml, link.toHtml());
    }

    @Test
    void testImplementsElement() {
        Link link = new Link("https://test.com", "Test");
        assertTrue(link instanceof Element);
    }
}

