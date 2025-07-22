package dev.reuise.web.backend.graphics.svg;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPart;
import dev.reuise.web.core.graphics.svg.WebSvgPart;
public interface WebBackendSvgPart extends WebBackendSvgFeatures , WebBackendComponentPart , WebBackendParentComponentPart , WebSvgPart {
    void loadFromResource(String path);

    void loadFromResource(String path, Class<? extends Object> clazz);

    WebBackendParentComponentPart getParentComponentPart();
}