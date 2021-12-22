package dev.reuise.web.backend.component;
import dev.reuise.web.core.component.WebComponentFoundation;
public class ComponentFoundation {
    private final WebComponentFoundation webComponentFoundation;

    public ComponentFoundation(ComponentAdapter adapter, ComponentOptions options) {
        this.webComponentFoundation = new WebComponentFoundation(adapter, options.getWebComponentOptions());
    }
}