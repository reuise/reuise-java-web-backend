package dev.reuise.web.backend.parentcomponent;
import dev.reuise.web.backend.component.ComponentOptions;
import dev.reuise.web.core.parentcomponent.WebParentComponentOptions;
public class ParentComponentOptions {
    private final ComponentOptions componentOptions;

    private final WebParentComponentOptions webParentComponentOptions;

    public ParentComponentOptions() {
        this.componentOptions = new ComponentOptions();
        this.webParentComponentOptions = new WebParentComponentOptions();
    }

    public ComponentOptions getComponentOptions() {
        return this.componentOptions;
    }

    public WebParentComponentOptions getWebParentComponentOptions() {
        return this.webParentComponentOptions;
    }

    /**
     * Gets the id of the component's element
     *
     * @return Id
     */
    public String getId() {
        return componentOptions.getId();
    }

    /**
     * Sets the id of the component's element
     *
     * @param id:
     * 		Id
     * @return Options instance
     */
    public ParentComponentOptions setId(String id) {
        componentOptions.setId(id);
        return this;
    }

    /**
     * Gets the component's element tag name
     *
     * @return TagName
     */
    public String getTagName() {
        return componentOptions.getTagName();
    }

    /**
     * Sets the component's element tag name
     *
     * @param tagName:
     * 		TagName
     * @return Options instance
     */
    public ParentComponentOptions setTagName(String tagName) {
        componentOptions.setTagName(tagName);
        return this;
    }
}