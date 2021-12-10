package dev.reuise.web.backend.document;
import dev.reuise.web.backend.component.Component;
import dev.reuise.web.backend.document.Document.Options;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentAdapter;
import dev.reuise.web.core.document.WebDocumentAdapter;
/**
 * Document adapter implementation (Web backend).
 */
public class DocumentAdapter implements WebBackendDocument , WebDocumentAdapter , WebBackendParentComponentAdapter {
    /**
     * Creates a new document adapter.
     */
    public DocumentAdapter(Options options) {
    }

    public void add(Component child) {
    }
}