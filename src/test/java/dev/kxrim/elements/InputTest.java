package dev.kxrim.elements;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InputTest {

    @Test
    void testTextInput() {
        Input input = new Input("text", "username", "Enter username");

        String expectedHtml = "<input type=\"text\" name=\"username\" placeholder=\"Enter username\">\n";
        assertEquals(expectedHtml, input.toHtml());
    }

    @Test
    void testPasswordInput() {
        Input input = new Input("password", "pwd", "Enter password");

        String expectedHtml = "<input type=\"password\" name=\"pwd\" placeholder=\"Enter password\">\n";
        assertEquals(expectedHtml, input.toHtml());
    }

    @Test
    void testEmailInput() {
        Input input = new Input("email", "email", "user@example.com");

        String expectedHtml = "<input type=\"email\" name=\"email\" placeholder=\"user@example.com\">\n";
        assertEquals(expectedHtml, input.toHtml());
    }

    @Test
    void testNumberInput() {
        Input input = new Input("number", "age", "Age");

        String expectedHtml = "<input type=\"number\" name=\"age\" placeholder=\"Age\">\n";
        assertEquals(expectedHtml, input.toHtml());
    }

    @Test
    void testCheckboxInput() {
        Input input = new Input("checkbox", "agree", "I agree");

        String expectedHtml = "<input type=\"checkbox\" name=\"agree\" placeholder=\"I agree\">\n";
        assertEquals(expectedHtml, input.toHtml());
    }

    @Test
    void testWithEmptyPlaceholder() {
        Input input = new Input("text", "field", "");

        String expectedHtml = "<input type=\"text\" name=\"field\" placeholder=\"\">\n";
        assertEquals(expectedHtml, input.toHtml());
    }

    @Test
    void testWithSpecialCharacters() {
        Input input = new Input("text", "field", "Enter \"value\" & save");

        String expectedHtml = "<input type=\"text\" name=\"field\" placeholder=\"Enter \"value\" & save\">\n";
        assertEquals(expectedHtml, input.toHtml());
    }

    @Test
    void testImplementsElement() {
        Input input = new Input("text", "test", "Test");
        assertTrue(input instanceof Element);
    }
}

