package dev.reuise.web.backend.parentcomponent;
import dev.reuise.web.backend.component.ComponentFoundation;
import dev.reuise.web.core.parentcomponent.WebParentComponentFoundation;
public class ParentComponentFoundation {
    private final ComponentFoundation componentFoundation;

    private final WebParentComponentFoundation webParentComponentFoundation;

    public ParentComponentFoundation(ParentComponentAdapter adapter, ParentComponentOptions options) {
        this.componentFoundation = new ComponentFoundation(adapter, options.getComponentOptions());
        this.webParentComponentFoundation = new WebParentComponentFoundation(adapter, options.getWebParentComponentOptions());
    }
}