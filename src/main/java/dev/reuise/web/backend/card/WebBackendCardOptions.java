package dev.reuise.web.backend.card;
import dev.reuise.web.backend.WebBackendComponentOptions;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentPartOptions;
import dev.reuise.web.backend.layout.WebBackendContainerPartOptions;
import dev.reuise.web.backend.layout.WebBackendFlexContainerPartOptions;
import dev.reuise.web.backend.layout.WebBackendSurfaceOptions;
import dev.reuise.web.backend.layout.WebBackendSurfacePartOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPartOptions;
import dev.reuise.web.core.card.WebCardOptions;
// Todo: Clean up uneeded interfaces
public interface WebBackendCardOptions extends WebBackendContainerPartOptions , WebBackendCardPartOptions , WebBackendBaseComponentPartOptions , WebBackendSurfaceOptions , WebCardOptions , WebBackendFlexContainerPartOptions , WebBackendComponentOptions , WebBackendParentComponentPartOptions , WebBackendSurfacePartOptions {
    WebBackendSurfacePartOptions getSurfacePart();

    WebBackendFlexContainerPartOptions getFlexContainerPart();

    WebBackendContainerPartOptions getContainerPart();

    WebBackendParentComponentPartOptions getParentComponentPart();

    WebBackendBaseComponentPartOptions getBaseComponentPart();
}