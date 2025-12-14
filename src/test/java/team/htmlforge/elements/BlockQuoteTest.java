package team.htmlforge.elements;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BlockQuoteTest {

    @Test
    void testConstructorAndToHtml() {
        String content = "This is a quote";
        BlockQuote blockQuote = new BlockQuote(content);
        
        String expectedHtml = "<blockquote>This is a quote</blockquote>\n";
        assertEquals(expectedHtml, blockQuote.toHtml());
    }

    @Test
    void testWithEmptyContent() {
        BlockQuote blockQuote = new BlockQuote("");
        
        String expectedHtml = "<blockquote></blockquote>\n";
        assertEquals(expectedHtml, blockQuote.toHtml());
    }

    @Test
    void testWithSpecialCharacters() {
        BlockQuote blockQuote = new BlockQuote("Quote with <special> & \"characters\"");
        
        String expectedHtml = "<blockquote>Quote with <special> & \"characters\"</blockquote>\n";
        assertEquals(expectedHtml, blockQuote.toHtml());
    }

    @Test
    void testImplementsElement() {
        BlockQuote blockQuote = new BlockQuote("Test");
        assertTrue(blockQuote instanceof Element);
    }
}

