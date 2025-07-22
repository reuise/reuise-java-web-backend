package dev.reuise.web.backend.graphics.svg;
import dev.reuise.web.backend.WebBackendComponent;
import dev.reuise.web.core.graphics.svg.WebSvgPath;
public interface WebBackendSvgPath extends WebBackendSvgShape , WebBackendSvgPathPart , WebBackendComponent , WebSvgPath {
    WebBackendSvgPath getComponent();
}