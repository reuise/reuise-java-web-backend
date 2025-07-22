package dev.reuise.web.backend.layout;
import dev.reuise.web.backend.WebBackendComponentOptions;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentPartOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPartOptions;
import dev.reuise.web.core.layout.WebSurfaceOptions;
// Todo: Clean up uneeded interfaces
public interface WebBackendSurfaceOptions extends WebBackendContainerPartOptions , WebSurfaceOptions , WebBackendBaseComponentPartOptions , WebBackendFlexContainerOptions , WebBackendFlexContainerPartOptions , WebBackendComponentOptions , WebBackendParentComponentPartOptions , WebBackendSurfacePartOptions {
    WebBackendFlexContainerPartOptions getFlexContainerPart();

    WebBackendContainerPartOptions getContainerPart();

    WebBackendParentComponentPartOptions getParentComponentPart();

    WebBackendBaseComponentPartOptions getBaseComponentPart();
}