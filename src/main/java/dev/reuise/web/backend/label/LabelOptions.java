package dev.reuise.web.backend.label;
import dev.reuise.web.backend.component.ComponentOptions;
import dev.reuise.web.core.label.WebLabelOptions;
public class LabelOptions {
    private final ComponentOptions componentOptions;

    private final WebLabelOptions webLabelOptions;

    public LabelOptions() {
        this.componentOptions = new ComponentOptions();
        this.webLabelOptions = new WebLabelOptions();
        componentOptions.setTagName("label");
    }

    public ComponentOptions getComponentOptions() {
        return this.componentOptions;
    }

    public WebLabelOptions getWebLabelOptions() {
        return this.webLabelOptions;
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
    public LabelOptions setId(String id) {
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
    public LabelOptions setTagName(String tagName) {
        componentOptions.setTagName(tagName);
        return this;
    }
}