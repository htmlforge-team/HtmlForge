package team.htmlforge.elements;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ButtonTest {

    @Test
    void testConstructorWithTextOnly() {
        Button button = new Button("Click me");
        
        String expectedHtml = "<button>Click me</button>\n";
        assertEquals(expectedHtml, button.toHtml());
    }

    @Test
    void testConstructorWithTextAndOnClick() {
        Button button = new Button("Submit", "submitForm()");
        
        String expectedHtml = "<button onclick=\"submitForm()\">Submit</button>\n";
        assertEquals(expectedHtml, button.toHtml());
    }

    @Test
    void testConstructorWithNullOnClick() {
        Button button = new Button("Click", null);
        
        String expectedHtml = "<button>Click</button>\n";
        assertEquals(expectedHtml, button.toHtml());
    }

    @Test
    void testConstructorWithEmptyOnClick() {
        Button button = new Button("Click", "");
        
        String expectedHtml = "<button>Click</button>\n";
        assertEquals(expectedHtml, button.toHtml());
    }

    @Test
    void testWithEmptyText() {
        Button button = new Button("");
        
        String expectedHtml = "<button></button>\n";
        assertEquals(expectedHtml, button.toHtml());
    }

    @Test
    void testWithSpecialCharacters() {
        Button button = new Button("Save & Exit", "confirm('Are you sure?')");
        
        String expectedHtml = "<button onclick=\"confirm('Are you sure?')\">Save & Exit</button>\n";
        assertEquals(expectedHtml, button.toHtml());
    }

    @Test
    void testImplementsElement() {
        Button button = new Button("Test");
        assertTrue(button instanceof Element);
    }
}

