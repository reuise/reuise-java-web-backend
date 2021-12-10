package dev.reuise.web.backend.document;
import dev.reuise.web.backend.component.Component;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponent;
import dev.reuise.web.core.document.WebDocument;
/**
 * Interface for Document and DocumentAdapter (Web backend).
 */
public interface WebBackendDocument extends WebBackendParentComponent , WebDocument {
    /**
     * Add a child component.
     *
     * @param child
     * 		
     */
    void add(Component child);
}