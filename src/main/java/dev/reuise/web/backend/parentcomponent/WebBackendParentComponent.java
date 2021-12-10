package dev.reuise.web.backend.parentcomponent;
import dev.reuise.web.backend.component.Component;
import dev.reuise.web.backend.component.WebBackendComponent;
import dev.reuise.web.core.parentcomponent.WebParentComponent;
/**
 * Interface for ParentComponent and ParentComponentAdapter (Web backend).
 */
public interface WebBackendParentComponent extends WebParentComponent , WebBackendComponent {
    /**
     * Add a child component.
     *
     * @param child
     * 		
     */
    void add(Component child);
}