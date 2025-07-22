package dev.reuise.web.backend.component;
import dev.reuise.web.core.component.WebComponentImpl;
/**
 * Implementation of Component (Web backend).
 */
public class WebBackendComponentImpl<S extends WebBackendComponentImpl<S, A>, A extends WebBackendComponentAdapter> extends WebComponentImpl<S, A> implements Component {
    /**
     * Implementation of Component options.
     */
    public static class Options<S extends Options<S>> extends WebComponentImpl.Options<S> implements WebBackendComponentOptions {
        public Options() {
        }
    }

    public WebBackendComponentImpl(WebBackendComponentAdapter adapter, WebBackendComponentOptions options) {
        super(adapter, options);
    }

    protected S self() {
        return null;
    }
}