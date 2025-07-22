package dev.reuise.web.backend.graphics.svg;
import dev.reuise.web.backend.WebBackendComponentOptions;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentPartOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPartOptions;
import dev.reuise.web.core.graphics.svg.WebSvgTextOptions;
// Todo: Clean up uneeded interfaces
public interface WebBackendSvgTextOptions extends WebBackendSvgPartOptions , WebBackendSvgOptions , WebBackendBaseComponentPartOptions , WebSvgTextOptions , WebBackendComponentOptions , WebBackendParentComponentPartOptions , WebBackendSvgTextPartOptions {
    WebBackendSvgPartOptions getSvgPart();

    WebBackendParentComponentPartOptions getParentComponentPart();

    WebBackendBaseComponentPartOptions getBaseComponentPart();
}