package dev.reuise.web.backend.graphics.svg;
import dev.reuise.web.backend.WebBackendComponentOptions;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentPartOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPartOptions;
import dev.reuise.web.core.graphics.svg.WebSvgRectOptions;
// Todo: Clean up uneeded interfaces
public interface WebBackendSvgRectOptions extends WebBackendSvgPartOptions , WebBackendSvgShapePartOptions , WebSvgRectOptions , WebBackendSvgShapeOptions , WebBackendBaseComponentPartOptions , WebBackendSvgRectPartOptions , WebBackendComponentOptions , WebBackendParentComponentPartOptions {
    WebBackendSvgShapePartOptions getSvgShapePart();

    WebBackendSvgPartOptions getSvgPart();

    WebBackendParentComponentPartOptions getParentComponentPart();

    WebBackendBaseComponentPartOptions getBaseComponentPart();
}