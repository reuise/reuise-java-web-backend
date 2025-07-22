package dev.reuise.web.backend.graphics.svg;
import dev.reuise.web.backend.WebBackendComponentOptions;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentPartOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPartOptions;
import dev.reuise.web.core.graphics.svg.WebSvgShapeOptions;
// Todo: Clean up uneeded interfaces
public interface WebBackendSvgShapeOptions extends WebBackendSvgPartOptions , WebBackendSvgOptions , WebBackendSvgShapePartOptions , WebSvgShapeOptions , WebBackendBaseComponentPartOptions , WebBackendComponentOptions , WebBackendParentComponentPartOptions {
    WebBackendSvgPartOptions getSvgPart();

    WebBackendParentComponentPartOptions getParentComponentPart();

    WebBackendBaseComponentPartOptions getBaseComponentPart();
}