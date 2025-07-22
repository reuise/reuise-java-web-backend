package dev.reuise.web.backend.scrollablecontainer;
import dev.reuise.web.backend.WebBackendComponentOptions;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentPartOptions;
import dev.reuise.web.backend.layout.WebBackendContainerOptions;
import dev.reuise.web.backend.layout.WebBackendContainerPartOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPartOptions;
import dev.reuise.web.core.scrollablecontainer.WebScrollableContainerOptions;
// Todo: Clean up uneeded interfaces
public interface WebBackendScrollableContainerOptions extends WebBackendContainerPartOptions , WebBackendBaseComponentPartOptions , WebBackendContainerOptions , WebBackendComponentOptions , WebBackendParentComponentPartOptions , WebScrollableContainerOptions , WebBackendScrollableContainerPartOptions {
    WebBackendContainerPartOptions getContainerPart();

    WebBackendParentComponentPartOptions getParentComponentPart();

    WebBackendBaseComponentPartOptions getBaseComponentPart();
}