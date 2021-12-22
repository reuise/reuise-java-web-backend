package dev.reuise.web.backend;
import dev.reuise.web.backend.button.Button;
import dev.reuise.web.backend.document.Document;
import dev.reuise.web.backend.label.Label;
import org.junit.Test;
public class ComponentTests {
    @Test
    public void createButton() {
        Button button = new Button(Button.newOptions().setId("example-button").setLabel("Example button"));
    }

    @Test
    public void createLabel() {
        Label label = new Label(Label.newOptions());
    }

    @Test
    public void createDocument() {
        Document document = new Document(Document.newOptions());
    }
}