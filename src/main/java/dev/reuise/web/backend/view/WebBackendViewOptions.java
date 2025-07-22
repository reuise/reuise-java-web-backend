package dev.reuise.web.backend.view;
import dev.reuise.web.backend.WebBackendComponentOptions;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentPartOptions;
import dev.reuise.web.backend.layout.WebBackendContainerPartOptions;
import dev.reuise.web.backend.layout.WebBackendFlexContainerOptions;
import dev.reuise.web.backend.layout.WebBackendFlexContainerPartOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPartOptions;
import dev.reuise.web.core.view.WebViewOptions;
// Todo: Clean up uneeded interfaces
public interface WebBackendViewOptions extends WebBackendContainerPartOptions , WebBackendViewPartOptions , WebViewOptions , WebBackendBaseComponentPartOptions , WebBackendFlexContainerOptions , WebBackendFlexContainerPartOptions , WebBackendComponentOptions , WebBackendParentComponentPartOptions {
    WebBackendFlexContainerPartOptions getFlexContainerPart();

    WebBackendContainerPartOptions getContainerPart();

    WebBackendParentComponentPartOptions getParentComponentPart();

    WebBackendBaseComponentPartOptions getBaseComponentPart();
}