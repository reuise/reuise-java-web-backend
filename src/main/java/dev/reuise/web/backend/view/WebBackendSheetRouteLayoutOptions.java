package dev.reuise.web.backend.view;
import dev.reuise.web.backend.WebBackendComponentOptions;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentPartOptions;
import dev.reuise.web.backend.layout.WebBackendContainerPartOptions;
import dev.reuise.web.backend.layout.WebBackendSheetLayoutOptions;
import dev.reuise.web.backend.layout.WebBackendSheetLayoutPartOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPartOptions;
import dev.reuise.web.backend.splitcontainer.WebBackendSplitContainerPartOptions;
import dev.reuise.web.core.view.WebSheetRouteLayoutOptions;
// Todo: Clean up uneeded interfaces
public interface WebBackendSheetRouteLayoutOptions extends WebBackendContainerPartOptions , WebBackendSheetLayoutOptions , WebBackendBaseComponentPartOptions , WebBackendSheetLayoutPartOptions , WebBackendSheetRouteLayoutPartOptions , WebBackendComponentOptions , WebBackendParentComponentPartOptions , WebSheetRouteLayoutOptions , WebBackendSplitContainerPartOptions {
    WebBackendSheetLayoutPartOptions getSheetLayoutPart();

    WebBackendSplitContainerPartOptions getSplitContainerPart();

    WebBackendContainerPartOptions getContainerPart();

    WebBackendParentComponentPartOptions getParentComponentPart();

    WebBackendBaseComponentPartOptions getBaseComponentPart();
}