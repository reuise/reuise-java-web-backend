package dev.reuise.web.backend.graphics.svg;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.core.graphics.svg.WebSvgRectPart;
public interface WebBackendSvgRectPart extends WebBackendSvgShapePart , WebBackendComponentPart , WebBackendSvgRectFeatures , WebSvgRectPart {
    WebBackendSvgShapePart getSvgShapePart();
}