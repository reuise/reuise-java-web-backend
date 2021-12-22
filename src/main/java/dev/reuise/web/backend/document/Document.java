package dev.reuise.web.backend.document;
/**
 * A Document bla bla. For use with web backend.
 */
public class Document {
    private final DocumentFoundation foundation;

    /**
     * Creates a new document.
     */
    public Document(DocumentOptions options) {
        this.foundation = new DocumentFoundation(new DocumentAdapter(options), options);
    }

    /**
     * Creates options to be passed to a new document.
     */
    public static DocumentOptions newOptions() {
        return new DocumentOptions();
    }
}