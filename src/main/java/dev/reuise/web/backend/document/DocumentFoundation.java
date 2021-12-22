package dev.reuise.web.backend.document;
import dev.reuise.web.backend.parentcomponent.ParentComponentFoundation;
import dev.reuise.web.core.document.WebDocumentFoundation;
public class DocumentFoundation {
    private final ParentComponentFoundation parentComponentFoundation;

    private final WebDocumentFoundation webDocumentFoundation;

    public DocumentFoundation(DocumentAdapter adapter, DocumentOptions options) {
        this.parentComponentFoundation = new ParentComponentFoundation(adapter, options.getParentComponentOptions());
        this.webDocumentFoundation = new WebDocumentFoundation(adapter, options.getWebDocumentOptions());
    }
}