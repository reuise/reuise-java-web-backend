package dev.reuise.web.backend.parentcomponent;
import dev.reuise.web.backend.component.Component;
import dev.reuise.web.backend.component.WebBackendComponentImpl;
import dev.reuise.web.core.parentcomponent.WebParentComponentImpl;
/**
 * Implementation of ParentComponent (Web backend).
 */
public class WebBackendParentComponentImpl<S extends WebBackendParentComponentImpl<S, A>, A extends WebBackendParentComponentAdapter> extends WebBackendComponentImpl<S, A> implements WebBackendParentComponent {
    private final WebParentComponentImpl<A> webParentComponent;

    /**
     * Implementation of ParentComponent options.
     */
    public static class Options<S extends Options<S>> extends WebBackendComponentImpl.Options<S> implements WebBackendParentComponentOptions {
        public Options() {
        }
    }

    public WebBackendParentComponentImpl(WebBackendParentComponentAdapter adapter, WebBackendParentComponentOptions options) {
        super(adapter, options);
        this.webParentComponent = new WebParentComponentImpl<A>(adapter, options);
    }

    /**
     * Add a child component.
     *
     * @param child
     * 		
     */
    public void add(Component child) {
        webParentComponent.add(child);
    }
}