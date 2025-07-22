package dev.reuise.web.backend.graphics.svg;
import dev.reuise.web.backend.WebBackendComponent;
import dev.reuise.web.core.graphics.svg.WebSvgShape;
public interface WebBackendSvgShape extends WebSvgShape , WebBackendSvgShapePart , WebBackendComponent , WebBackendSvg {
    WebBackendSvgShape getComponent();
}