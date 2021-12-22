package dev.reuise.web.backend.button;
import dev.reuise.web.backend.component.ComponentAdapter;
import dev.reuise.web.core.button.WebButtonAdapter;
/**
 * Button adapter implementation (Web backend).
 */
public class ButtonAdapter extends ComponentAdapter implements WebButtonAdapter , WebBackendButton {
    /**
     * Creates a new button adapter.
     */
    public ButtonAdapter(ButtonOptions options) {
        super(options.getComponentOptions());
    }
}