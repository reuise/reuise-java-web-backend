package dev.reuise.web.backend.button;
import dev.reuise.web.backend.component.WebBackendComponentImpl;
import dev.reuise.web.core.button.WebButtonImpl;
/**
 * Implementation of Button (Web backend).
 */
public class WebBackendButtonImpl<S extends WebBackendButtonImpl<S, A>, A extends ButtonAdapter> extends WebBackendComponentImpl<S, A> implements WebBackendButton {
    private final WebButtonImpl<A> webButton;

    /**
     * Implementation of Button options.
     */
    public static class Options<S extends Options<S>> extends WebBackendComponentImpl.Options<S> implements WebBackendButtonOptions {
        private WebButtonImpl.Options webButtonOpts;

        /**
         * Gets the label on the button
         *
         * @return Label
         */
        public String getLabel() {
            return webButtonOpts.getLabel();
        }

        /**
         * Sets the label on the button
         *
         * @param label:
         * 		Label
         * @return Options instance
         */
        public S setLabel(String label) {
            webButtonOpts.setLabel(label);
            return self();
        }

        public Options() {
            this.webButtonOpts = new WebButtonImpl.Options();
        }
    }

    public WebBackendButtonImpl(ButtonAdapter adapter, WebBackendButtonOptions options) {
        super(adapter, options);
        this.webButton = new WebButtonImpl<A>(adapter, options);
    }
}