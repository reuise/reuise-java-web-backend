package dev.reuise.web.backend.label;
import dev.reuise.web.backend.component.ComponentAdapter;
import dev.reuise.web.core.label.WebLabelAdapter;
/**
 * Label adapter implementation (Web backend).
 */
public class LabelAdapter extends ComponentAdapter implements WebLabelAdapter , WebBackendLabel {
    /**
     * Creates a new label adapter.
     */
    public LabelAdapter(LabelOptions options) {
        super(options.getComponentOptions());
    }
}