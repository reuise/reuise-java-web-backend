package dev.reuise.web.backend.graphics.svg;
import dev.reuise.web.backend.WebBackendComponentOptions;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentPartOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPartOptions;
import dev.reuise.web.core.graphics.svg.WebSvgPathOptions;
// Todo: Clean up uneeded interfaces
public interface WebBackendSvgPathOptions extends WebBackendSvgPartOptions , WebBackendSvgShapePartOptions , WebSvgPathOptions , WebBackendSvgShapeOptions , WebBackendBaseComponentPartOptions , WebBackendComponentOptions , WebBackendParentComponentPartOptions , WebBackendSvgPathPartOptions {
    WebBackendSvgShapePartOptions getSvgShapePart();

    WebBackendSvgPartOptions getSvgPart();

    WebBackendParentComponentPartOptions getParentComponentPart();

    WebBackendBaseComponentPartOptions getBaseComponentPart();
}