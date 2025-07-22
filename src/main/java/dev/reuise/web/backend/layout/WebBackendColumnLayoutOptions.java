package dev.reuise.web.backend.layout;
import dev.reuise.web.backend.WebBackendComponentOptions;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentPartOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPartOptions;
import dev.reuise.web.core.layout.WebColumnLayoutOptions;
// Todo: Clean up uneeded interfaces
public interface WebBackendColumnLayoutOptions extends WebBackendContainerPartOptions , WebColumnLayoutOptions , WebBackendBaseComponentPartOptions , WebBackendColumnLayoutPartOptions , WebBackendFlexContainerOptions , WebBackendFlexContainerPartOptions , WebBackendComponentOptions , WebBackendParentComponentPartOptions {
    WebBackendFlexContainerPartOptions getFlexContainerPart();

    WebBackendContainerPartOptions getContainerPart();

    WebBackendParentComponentPartOptions getParentComponentPart();

    WebBackendBaseComponentPartOptions getBaseComponentPart();
}