package dev.reuise.web.backend.button;
import dev.reuise.web.backend.component.ComponentOptions;
import dev.reuise.web.core.button.WebButtonOptions;
public class ButtonOptions {
    private final ComponentOptions componentOptions;

    private final WebButtonOptions webButtonOptions;

    public ButtonOptions() {
        this.componentOptions = new ComponentOptions();
        this.webButtonOptions = new WebButtonOptions();
        componentOptions.setTagName("button");
    }

    public ComponentOptions getComponentOptions() {
        return this.componentOptions;
    }

    public WebButtonOptions getWebButtonOptions() {
        return this.webButtonOptions;
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
    public ButtonOptions setId(String id) {
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
    public ButtonOptions setTagName(String tagName) {
        componentOptions.setTagName(tagName);
        return this;
    }

    /**
     * Gets the label on the button
     *
     * @return Label
     */
    public String getLabel() {
        return webButtonOptions.getLabel();
    }

    /**
     * Sets the label on the button
     *
     * @param label:
     * 		Label
     * @return Options instance
     */
    public ButtonOptions setLabel(String label) {
        webButtonOptions.setLabel(label);
        return this;
    }
}