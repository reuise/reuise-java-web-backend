package dev.reuise.web.backend.slidecontainer;
import dev.reuise.web.backend.WebBackendComponentOptions;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentPartOptions;
import dev.reuise.web.backend.layout.WebBackendContainerOptions;
import dev.reuise.web.backend.layout.WebBackendContainerPartOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPartOptions;
import dev.reuise.web.core.slidecontainer.WebSlideContainerOptions;
// Todo: Clean up uneeded interfaces
public interface WebBackendSlideContainerOptions extends WebBackendContainerPartOptions , WebBackendBaseComponentPartOptions , WebBackendContainerOptions , WebSlideContainerOptions , WebBackendComponentOptions , WebBackendSlideContainerPartOptions , WebBackendParentComponentPartOptions {
    WebBackendContainerPartOptions getContainerPart();

    WebBackendParentComponentPartOptions getParentComponentPart();

    WebBackendBaseComponentPartOptions getBaseComponentPart();
}