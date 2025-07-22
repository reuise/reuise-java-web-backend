package dev.reuise.web.backend.applayout;
import dev.reuise.web.backend.WebBackendComponentOptions;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentPartOptions;
import dev.reuise.web.backend.layout.WebBackendContainerPartOptions;
import dev.reuise.web.backend.layout.WebBackendFlexContainerOptions;
import dev.reuise.web.backend.layout.WebBackendFlexContainerPartOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPartOptions;
import dev.reuise.web.core.applayout.WebAppLayoutBodyOptions;
// Todo: Clean up uneeded interfaces
public interface WebBackendAppLayoutBodyOptions extends WebAppLayoutBodyOptions , WebBackendContainerPartOptions , WebBackendBaseComponentPartOptions , WebBackendFlexContainerOptions , WebBackendFlexContainerPartOptions , WebBackendComponentOptions , WebBackendParentComponentPartOptions , WebBackendAppLayoutBodyPartOptions {
    WebBackendFlexContainerPartOptions getFlexContainerPart();

    WebBackendContainerPartOptions getContainerPart();

    WebBackendParentComponentPartOptions getParentComponentPart();

    WebBackendBaseComponentPartOptions getBaseComponentPart();
}