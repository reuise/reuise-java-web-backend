package dev.reuise.web.backend.drawer;
import dev.reuise.web.backend.WebBackendComponentOptions;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentPartOptions;
import dev.reuise.web.backend.layout.WebBackendContainerOptions;
import dev.reuise.web.backend.layout.WebBackendContainerPartOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPartOptions;
import dev.reuise.web.core.drawer.WebDrawerOptions;
// Todo: Clean up uneeded interfaces
public interface WebBackendDrawerOptions extends WebBackendContainerPartOptions , WebBackendBaseComponentPartOptions , WebBackendContainerOptions , WebDrawerOptions , WebBackendComponentOptions , WebBackendParentComponentPartOptions , WebBackendDrawerPartOptions {
    WebBackendContainerPartOptions getContainerPart();

    WebBackendParentComponentPartOptions getParentComponentPart();

    WebBackendBaseComponentPartOptions getBaseComponentPart();
}