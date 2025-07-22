package dev.reuise.web.backend.graphics.svg;
import dev.reuise.web.backend.WebBackendComponentOptions;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentPartOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPartOptions;
import dev.reuise.web.core.graphics.svg.WebSvgGroupOptions;
// Todo: Clean up uneeded interfaces
public interface WebBackendSvgGroupOptions extends WebBackendSvgPartOptions , WebBackendSvgOptions , WebSvgGroupOptions , WebBackendSvgGroupPartOptions , WebBackendBaseComponentPartOptions , WebBackendComponentOptions , WebBackendParentComponentPartOptions {
    WebBackendSvgPartOptions getSvgPart();

    WebBackendParentComponentPartOptions getParentComponentPart();

    WebBackendBaseComponentPartOptions getBaseComponentPart();
}