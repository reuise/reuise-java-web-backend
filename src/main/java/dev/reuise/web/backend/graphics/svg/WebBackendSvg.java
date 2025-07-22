package dev.reuise.web.backend.graphics.svg;
import dev.reuise.web.backend.WebBackendComponent;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponent;
import dev.reuise.web.core.graphics.svg.WebSvg;
public interface WebBackendSvg extends WebSvg , WebBackendParentComponent , WebBackendComponent , WebBackendSvgPart {
    WebBackendSvg getComponent();
}