package dev.reuise.web.backend.graphics.svg;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.core.graphics.svg.WebSvgShapePart;
public interface WebBackendSvgShapePart extends WebBackendSvgShapeFeatures , WebBackendComponentPart , WebBackendSvgPart , WebSvgShapePart {
    WebBackendSvgPart getSvgPart();
}