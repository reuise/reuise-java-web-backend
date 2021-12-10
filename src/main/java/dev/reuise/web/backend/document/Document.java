package dev.reuise.web.backend.document;
/**
 * A Document bla bla. For use with web backend.
 */
public final class Document extends WebBackendDocumentImpl<Document, DocumentAdapter> {
    /**
     * Options for Document. For use with web backend.
     */
    public static class Options extends WebBackendDocumentImpl.Options<Options> {
        @Override
        protected Options self() {
            return this;
        }
    }

    /**
     * Creates a new document.
     */
    public Document(Options options) {
        super(new DocumentAdapter(options), options);
    }

    /**
     * Creates options to be passed to a new document.
     */
    public static Options newOptions() {
        return new Options();
    }

    @Override
    protected Document self() {
        return this;
    }
}