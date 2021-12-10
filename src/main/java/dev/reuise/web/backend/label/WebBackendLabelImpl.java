package dev.reuise.web.backend.label;
import dev.reuise.web.backend.component.WebBackendComponentImpl;
import dev.reuise.web.core.label.WebLabelImpl;
/**
 * Implementation of Label (Web backend).
 */
public class WebBackendLabelImpl<S extends WebBackendLabelImpl<S, A>, A extends LabelAdapter> extends WebBackendComponentImpl<S, A> implements WebBackendLabel {
    private final WebLabelImpl<A> webLabel;

    /**
     * Implementation of Label options.
     */
    public static class Options<S extends Options<S>> extends WebBackendComponentImpl.Options<S> implements WebBackendLabelOptions {
        private WebLabelImpl.Options webLabelOpts;

        public Options() {
            this.webLabelOpts = new WebLabelImpl.Options();
        }
    }

    public WebBackendLabelImpl(LabelAdapter adapter, WebBackendLabelOptions options) {
        super(adapter, options);
        this.webLabel = new WebLabelImpl<A>(adapter, options);
    }
}