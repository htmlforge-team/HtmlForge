package team.htmlforge.elements;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ImageTest {

    @Test
    void testConstructorAndToHtml() {
        Image image = new Image("photo.jpg", "A beautiful photo");

        String expectedHtml = "<img src=\"photo.jpg\" alt=\"A beautiful photo\">\n";
        assertEquals(expectedHtml, image.toHtml());
    }

    @Test
    void testWithEmptyAlt() {
        Image image = new Image("logo.png", "");

        String expectedHtml = "<img src=\"logo.png\" alt=\"\">\n";
        assertEquals(expectedHtml, image.toHtml());
    }

    @Test
    void testWithUrl() {
        Image image = new Image("https://example.com/image.jpg", "Remote image");

        String expectedHtml = "<img src=\"https://example.com/image.jpg\" alt=\"Remote image\">\n";
        assertEquals(expectedHtml, image.toHtml());
    }

    @Test
    void testWithRelativePath() {
        Image image = new Image("assets/logo.png", "Logo");

        String expectedHtml = "<img src=\"assets/logo.png\" alt=\"Logo\">\n";
        assertEquals(expectedHtml, image.toHtml());
    }

    @Test
    void testWithSpecialCharactersInAlt() {
        Image image = new Image("image.jpg", "Photo with \"quotes\" & <tags>");

        String expectedHtml = "<img src=\"image.jpg\" alt=\"Photo with \"quotes\" & <tags>\">\n";
        assertEquals(expectedHtml, image.toHtml());
    }

    @Test
    void testImplementsElement() {
        Image image = new Image("test.jpg", "Test");
        assertTrue(image instanceof Element);
    }
}

