package dev.reuise.web.backend.component;
import dev.reuise.web.core.component.WebComponentAdapter;
import java.io.PrintWriter;
/**
 * Component adapter implementation (Web backend).
 */
public class ComponentAdapter implements WebBackendComponent , WebComponentAdapter {
    private String tagName;

    public void writeTo(PrintWriter writer) {
        writer.write(String.format("<%1$s>HELLO FROM REUISE</%1$s>", tagName));
    }

    /**
     * Creates a new component adapter.
     */
    public ComponentAdapter(ComponentOptions options) {
        this.tagName = options.getTagName();
    }
}