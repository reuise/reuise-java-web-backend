package dev.reuise.web.backend.document;
import dev.reuise.web.backend.component.Component;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentImpl;
import dev.reuise.web.core.document.WebDocumentImpl;
/**
 * Implementation of Document (Web backend).
 */
public class WebBackendDocumentImpl<S extends WebBackendDocumentImpl<S, A>, A extends DocumentAdapter> extends WebBackendParentComponentImpl<S, A> implements WebBackendDocument {
    private final WebDocumentImpl<A> webDocument;

    /**
     * Implementation of Document options.
     */
    public static class Options<S extends Options<S>> extends WebBackendParentComponentImpl.Options<S> implements WebBackendDocumentOptions {
        private WebDocumentImpl.Options webDocumentOpts;

        public Options() {
            this.webDocumentOpts = new WebDocumentImpl.Options();
        }
    }

    public WebBackendDocumentImpl(DocumentAdapter adapter, WebBackendDocumentOptions options) {
        super(adapter, options);
        this.webDocument = new WebDocumentImpl<A>(adapter, options);
    }

    /**
     * Add a child component.
     *
     * @param child
     * 		
     */
    public void add(Component child) {
        super.add(child);
        webDocument.add(child);
    }
}