package dev.kxrim;

import dev.kxrim.elements.*;

/**
 * Main demonstration class showcasing my HtmlBuilder library.
 * Demonstrates all available HTML elements and their usage patterns.
 *
 * @author KerYagciHTL
 * @version 1.0
 */
public class Main {
    private static final String PAGE_TITLE = "HtmlBuilder Full Feature Demonstration";
    private static final String GITHUB_URL = "https://github.com/KerYagciHTL/java-frontend";
    private static final String JAVA_URL = "https://www.java.com";

    public static void main(String[] args) {
        HtmlBuilder builder = new HtmlBuilder(PAGE_TITLE);

        buildHeader(builder);
        buildIntroduction(builder);
        buildDivExamples(builder);
        buildButtonExamples(builder);
        buildLinkExamples(builder);
        buildImageExamples(builder);
        buildFormExamples(builder);
        buildListExamples(builder);
        buildTextFormattingExamples(builder);
        buildFooter(builder);

        builder.build();
    }

    /**
     * Builds the page header with main title and subtitle
     */
    private static void buildHeader(HtmlBuilder builder) {
        builder.addElement(new Heading(1, "HtmlBuilder Feature Showcase"));
        builder.addElement(new Heading(2, "All Available Methods Demonstrated"));
    }

    /**
     * Builds the introduction section
     */
    private static void buildIntroduction(HtmlBuilder builder) {
        builder.addElement(new Paragraph(
            "This page demonstrates all the features of the HtmlBuilder class."
        ));
    }

    /**
     * Demonstrates Div element usage with and without CSS classes
     */
    private static void buildDivExamples(HtmlBuilder builder) {
        builder.addElement(new Div("This is a simple div"));
        builder.addElement(new Div("This is a div with a CSS class", "highlighted"));
    }

    /**
     * Demonstrates various button configurations
     */
    private static void buildButtonExamples(HtmlBuilder builder) {
        builder.addElement(new Heading(3, "Buttons"));
        builder.addElement(new Button("Simple Button"));
        builder.addElement(new Button("Click Me", "alert('Hello from HtmlBuilder!')"));
        builder.addElement(new Button("Console Log", "console.log('Button clicked!')"));
    }

    /**
     * Demonstrates link elements
     */
    private static void buildLinkExamples(HtmlBuilder builder) {
        builder.addElement(new Heading(3, "Links"));
        builder.addElement(new Link(GITHUB_URL, "Visit GitHub"));
        builder.addElement(new Link(JAVA_URL, "Learn Java"));
    }

    /**
     * Demonstrates image handling including remote and local images
     */
    private static void buildImageExamples(HtmlBuilder builder) {
        builder.addElement(new Heading(3, "Images"));
        builder.addElement(new Image(
            "https://media.tenor.com/mSIfEcNYz5QAAAAj/cute.gif",
            "Placeholder Image"
        ));
        builder.addLocalImage("images/peach.gif", "GIF");
        builder.copyAssets("images");
    }

    /**
     * Demonstrates form input elements
     */
    private static void buildFormExamples(HtmlBuilder builder) {
        builder.addElement(new Heading(3, "Form Elements"));
        builder.addElement(new Input("text", "username", "Enter your username"));
        builder.addElement(new Input("email", "email", "Enter your email"));
        builder.addElement(new Input("password", "password", "Enter your password"));
        builder.addElement(new Textarea("message", "Enter your message", 5, 40));
    }

    /**
     * Demonstrates both ordered and unordered lists
     */
    private static void buildListExamples(HtmlBuilder builder) {
        builder.addElement(new Heading(3, "Unordered List"));
        builder.addElement(new ListElement(false, "First item", "Second item", "Third item"));

        builder.addElement(new Heading(3, "Ordered List"));
        builder.addElement(new ListElement(true, "Step one", "Step two", "Step three"));
    }

    /**
     * Demonstrates various text formatting elements
     */
    private static void buildTextFormattingExamples(HtmlBuilder builder) {
        builder.addElement(new Heading(3, "Text Formatting"));
        builder.addElement(new Heading(4, "Subheading"));
        builder.addElement(new Heading(5, "Smaller subheading"));
        builder.addElement(new Heading(6, "Smallest heading"));
        builder.addElement(new BlockQuote("This is a quote using BlockQuote element"));
        builder.addElement(new Code("const x = 42;"));
        builder.addElement(new Strong("Bold text"));
        builder.addElement(new Emphasis("Italic text"));
    }

    /**
     * Builds the page footer
     */
    private static void buildFooter(HtmlBuilder builder) {
        builder.addElement(new HorizontalRule());
        builder.addElement(new Paragraph("Built with ❤️ using HtmlBuilder"));
    }
}
