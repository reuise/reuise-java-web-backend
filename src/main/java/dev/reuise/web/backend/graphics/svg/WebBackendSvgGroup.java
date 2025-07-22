package dev.reuise.web.backend.graphics.svg;
import dev.reuise.web.backend.WebBackendComponent;
import dev.reuise.web.core.graphics.svg.WebSvgGroup;
public interface WebBackendSvgGroup extends WebSvgGroup , WebBackendSvgGroupPart , WebBackendComponent , WebBackendSvg {
    WebBackendSvgGroup getComponent();
}