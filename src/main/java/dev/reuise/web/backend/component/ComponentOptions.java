package dev.reuise.web.backend.component;
import dev.reuise.web.core.component.WebComponentOptions;
public class ComponentOptions {
    private final WebComponentOptions webComponentOptions;

    public ComponentOptions() {
        this.webComponentOptions = new WebComponentOptions();
    }

    public WebComponentOptions getWebComponentOptions() {
        return this.webComponentOptions;
    }

    /**
     * Gets the id of the component's element
     *
     * @return Id
     */
    public String getId() {
        return webComponentOptions.getId();
    }

    /**
     * Sets the id of the component's element
     *
     * @param id:
     * 		Id
     * @return Options instance
     */
    public ComponentOptions setId(String id) {
        webComponentOptions.setId(id);
        return this;
    }

    /**
     * Gets the component's element tag name
     *
     * @return TagName
     */
    public String getTagName() {
        return webComponentOptions.getTagName();
    }

    /**
     * Sets the component's element tag name
     *
     * @param tagName:
     * 		TagName
     * @return Options instance
     */
    public ComponentOptions setTagName(String tagName) {
        webComponentOptions.setTagName(tagName);
        return this;
    }
}