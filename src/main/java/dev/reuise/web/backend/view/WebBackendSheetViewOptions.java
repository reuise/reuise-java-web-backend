package dev.reuise.web.backend.view;
import dev.reuise.web.backend.WebBackendComponentOptions;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentPartOptions;
import dev.reuise.web.backend.layout.WebBackendContainerPartOptions;
import dev.reuise.web.backend.layout.WebBackendFlexContainerPartOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPartOptions;
import dev.reuise.web.core.view.WebSheetViewOptions;
// Todo: Clean up uneeded interfaces
public interface WebBackendSheetViewOptions extends WebBackendContainerPartOptions , WebBackendSheetViewPartOptions , WebSheetViewOptions , WebBackendViewPartOptions , WebBackendBaseComponentPartOptions , WebBackendFlexContainerPartOptions , WebBackendViewOptions , WebBackendComponentOptions , WebBackendParentComponentPartOptions {
    WebBackendViewPartOptions getViewPart();

    WebBackendFlexContainerPartOptions getFlexContainerPart();

    WebBackendContainerPartOptions getContainerPart();

    WebBackendParentComponentPartOptions getParentComponentPart();

    WebBackendBaseComponentPartOptions getBaseComponentPart();
}