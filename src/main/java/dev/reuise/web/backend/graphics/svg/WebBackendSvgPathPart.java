package dev.reuise.web.backend.graphics.svg;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.core.graphics.svg.WebSvgPathPart;
public interface WebBackendSvgPathPart extends WebBackendSvgShapePart , WebSvgPathPart , WebBackendComponentPart , WebBackendSvgPathFeatures {
    WebBackendSvgShapePart getSvgShapePart();
}