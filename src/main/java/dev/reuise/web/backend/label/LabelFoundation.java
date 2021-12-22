package dev.reuise.web.backend.label;
import dev.reuise.web.backend.component.ComponentFoundation;
import dev.reuise.web.core.label.WebLabelFoundation;
public class LabelFoundation {
    private final ComponentFoundation componentFoundation;

    private final WebLabelFoundation webLabelFoundation;

    public LabelFoundation(LabelAdapter adapter, LabelOptions options) {
        this.componentFoundation = new ComponentFoundation(adapter, options.getComponentOptions());
        this.webLabelFoundation = new WebLabelFoundation(adapter, options.getWebLabelOptions());
    }
}