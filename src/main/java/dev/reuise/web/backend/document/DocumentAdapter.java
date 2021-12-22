package dev.reuise.web.backend.document;
import dev.reuise.web.backend.component.Component;
import dev.reuise.web.backend.parentcomponent.ParentComponentAdapter;
import dev.reuise.web.core.document.WebDocumentAdapter;
import java.io.PrintWriter;
/**
 * Document adapter implementation (Web backend).
 */
public class DocumentAdapter extends ParentComponentAdapter implements WebBackendDocument , WebDocumentAdapter {
    private String title;

    @Override
    public void writeTo(PrintWriter writer) {
        writer.write("<html>");
        writer.write("<head>");
        writer.write(String.format("<title>%s</title>", title));
        writer.write("</head>");
        writer.write("<body>");
        writer.write("</body>");
        writer.write("</html>");
    }

    /**
     * Creates a new document adapter.
     */
    public DocumentAdapter(DocumentOptions options) {
        super(options.getParentComponentOptions());
    }

    public void add(Component child) {
    }
}