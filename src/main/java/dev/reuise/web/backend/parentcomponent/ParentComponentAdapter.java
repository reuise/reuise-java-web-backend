package dev.reuise.web.backend.parentcomponent;
import dev.reuise.web.backend.component.Component;
import dev.reuise.web.backend.component.ComponentAdapter;
import dev.reuise.web.core.parentcomponent.WebParentComponentAdapter;
/**
 * ParentComponent adapter implementation (Web backend).
 */
public class ParentComponentAdapter extends ComponentAdapter implements WebBackendParentComponent , WebParentComponentAdapter {
    /**
     * Creates a new parentcomponent adapter.
     */
    public ParentComponentAdapter(ParentComponentOptions options) {
        super(options.getComponentOptions());
    }

    public void add(Component child) {
    }
}