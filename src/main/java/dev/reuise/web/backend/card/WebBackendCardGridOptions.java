package dev.reuise.web.backend.card;
import dev.reuise.web.backend.WebBackendComponentOptions;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentPartOptions;
import dev.reuise.web.backend.layout.WebBackendContainerOptions;
import dev.reuise.web.backend.layout.WebBackendContainerPartOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPartOptions;
import dev.reuise.web.core.card.WebCardGridOptions;
// Todo: Clean up uneeded interfaces
public interface WebBackendCardGridOptions extends WebBackendContainerPartOptions , WebCardGridOptions , WebBackendBaseComponentPartOptions , WebBackendCardGridPartOptions , WebBackendContainerOptions , WebBackendComponentOptions , WebBackendParentComponentPartOptions {
    WebBackendContainerPartOptions getContainerPart();

    WebBackendParentComponentPartOptions getParentComponentPart();

    WebBackendBaseComponentPartOptions getBaseComponentPart();
}