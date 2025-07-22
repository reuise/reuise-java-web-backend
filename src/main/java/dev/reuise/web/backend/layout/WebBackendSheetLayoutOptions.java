package dev.reuise.web.backend.layout;
import dev.reuise.web.backend.WebBackendComponentOptions;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentPartOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPartOptions;
import dev.reuise.web.backend.splitcontainer.WebBackendSplitContainerOptions;
import dev.reuise.web.backend.splitcontainer.WebBackendSplitContainerPartOptions;
import dev.reuise.web.core.layout.WebSheetLayoutOptions;
// Todo: Clean up uneeded interfaces
public interface WebBackendSheetLayoutOptions extends WebBackendContainerPartOptions , WebSheetLayoutOptions , WebBackendBaseComponentPartOptions , WebBackendSheetLayoutPartOptions , WebBackendSplitContainerOptions , WebBackendComponentOptions , WebBackendParentComponentPartOptions , WebBackendSplitContainerPartOptions {
    WebBackendSplitContainerPartOptions getSplitContainerPart();

    WebBackendContainerPartOptions getContainerPart();

    WebBackendParentComponentPartOptions getParentComponentPart();

    WebBackendBaseComponentPartOptions getBaseComponentPart();
}