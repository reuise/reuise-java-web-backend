package dev.reuise.web.backend.layout;
import dev.reuise.web.backend.WebBackendComponentOptions;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentPartOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPartOptions;
import dev.reuise.web.core.layout.WebRowLayoutOptions;
// Todo: Clean up uneeded interfaces
public interface WebBackendRowLayoutOptions extends WebBackendContainerPartOptions , WebBackendBaseComponentPartOptions , WebBackendRowLayoutPartOptions , WebBackendFlexContainerOptions , WebBackendFlexContainerPartOptions , WebBackendComponentOptions , WebBackendParentComponentPartOptions , WebRowLayoutOptions {
    WebBackendFlexContainerPartOptions getFlexContainerPart();

    WebBackendContainerPartOptions getContainerPart();

    WebBackendParentComponentPartOptions getParentComponentPart();

    WebBackendBaseComponentPartOptions getBaseComponentPart();
}