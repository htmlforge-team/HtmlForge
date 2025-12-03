package dev.kxrim;

public class Main {
    public static void main(String[] args) {
        HtmlBuilder htmlBuilder = new HtmlBuilder("HtmlBuilder Full Feature Demonstration");

        htmlBuilder.addElement("h1", "HtmlBuilder Feature Showcase");
        htmlBuilder.addElement("h2", "All Available Methods Demonstrated");

        htmlBuilder.addElement("p", "This page demonstrates all the features of the HtmlBuilder class.");

        htmlBuilder.addDiv("This is a simple div");
        htmlBuilder.addDiv("This is a div with a CSS class", "highlighted");

        htmlBuilder.addElement("h3", "Buttons");
        htmlBuilder.addButton("Simple Button");
        htmlBuilder.addButton("Click Me", "alert('Hello from HtmlBuilder!')");
        htmlBuilder.addButton("Console Log", "console.log('Button clicked!')");

        htmlBuilder.addElement("h3", "Links");
        htmlBuilder.addLink("https://github.com/KerYagciHTL", "Visit GitHub");
        htmlBuilder.addLink("https://www.java.com", "Learn Java");

        htmlBuilder.addElement("h3", "Images");
        htmlBuilder.addImage("https://media.tenor.com/mSIfEcNYz5QAAAAj/cute.gif", "Placeholder Image");

        htmlBuilder.addLocalImage("images/peach.gif", "Company Logo");
        htmlBuilder.copyAssets("images");

        htmlBuilder.addElement("h3", "Form Elements");
        htmlBuilder.addInput("text", "username", "Enter your username");
        htmlBuilder.addInput("email", "email", "Enter your email");
        htmlBuilder.addInput("password", "password", "Enter your password");
        htmlBuilder.addTextarea("message", "Enter your message", 5, 40);

        htmlBuilder.addElement("h3", "Unordered List");
        htmlBuilder.addList(false, "First item", "Second item", "Third item");

        htmlBuilder.addElement("h3", "Ordered List");
        htmlBuilder.addList(true, "Step one", "Step two", "Step three");

        htmlBuilder.addElement("h3", "Custom Elements");
        htmlBuilder.addElement("h4", "Subheading");
        htmlBuilder.addElement("h5", "Smaller subheading");
        htmlBuilder.addElement("h6", "Smallest heading");
        htmlBuilder.addElement("blockquote", "This is a quote using addElement");
        htmlBuilder.addElement("code", "const x = 42;");
        htmlBuilder.addElement("strong", "Bold text");
        htmlBuilder.addElement("em", "Italic text");

        htmlBuilder.addElement("hr", "");
        htmlBuilder.addElement("p", "Built with ❤️ using HtmlBuilder");

        htmlBuilder.build();
    }
}
