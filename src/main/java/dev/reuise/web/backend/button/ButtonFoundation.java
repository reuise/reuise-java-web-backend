package dev.reuise.web.backend.button;
import dev.reuise.web.backend.component.ComponentFoundation;
import dev.reuise.web.core.button.WebButtonFoundation;
public class ButtonFoundation {
    private final ComponentFoundation componentFoundation;

    private final WebButtonFoundation webButtonFoundation;

    public ButtonFoundation(ButtonAdapter adapter, ButtonOptions options) {
        this.componentFoundation = new ComponentFoundation(adapter, options.getComponentOptions());
        this.webButtonFoundation = new WebButtonFoundation(adapter, options.getWebButtonOptions());
    }
}