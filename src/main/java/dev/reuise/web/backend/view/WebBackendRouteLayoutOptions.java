package dev.reuise.web.backend.view;
import dev.reuise.web.backend.WebBackendComponentOptions;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentPartOptions;
import dev.reuise.web.backend.layout.WebBackendContainerOptions;
import dev.reuise.web.backend.layout.WebBackendContainerPartOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPartOptions;
import dev.reuise.web.core.view.WebRouteLayoutOptions;
// Todo: Clean up uneeded interfaces
public interface WebBackendRouteLayoutOptions extends WebBackendContainerPartOptions , WebBackendRouteLayoutPartOptions , WebBackendBaseComponentPartOptions , WebBackendContainerOptions , WebRouteLayoutOptions , WebBackendComponentOptions , WebBackendParentComponentPartOptions {
    WebBackendContainerPartOptions getContainerPart();

    WebBackendParentComponentPartOptions getParentComponentPart();

    WebBackendBaseComponentPartOptions getBaseComponentPart();
}