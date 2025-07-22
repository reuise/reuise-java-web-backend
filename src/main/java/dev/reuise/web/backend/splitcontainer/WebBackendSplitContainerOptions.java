package dev.reuise.web.backend.splitcontainer;
import dev.reuise.web.backend.WebBackendComponentOptions;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentPartOptions;
import dev.reuise.web.backend.layout.WebBackendContainerOptions;
import dev.reuise.web.backend.layout.WebBackendContainerPartOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPartOptions;
import dev.reuise.web.core.splitcontainer.WebSplitContainerOptions;
// Todo: Clean up uneeded interfaces
public interface WebBackendSplitContainerOptions extends WebBackendContainerPartOptions , WebSplitContainerOptions , WebBackendBaseComponentPartOptions , WebBackendContainerOptions , WebBackendComponentOptions , WebBackendParentComponentPartOptions , WebBackendSplitContainerPartOptions {
    WebBackendContainerPartOptions getContainerPart();

    WebBackendParentComponentPartOptions getParentComponentPart();

    WebBackendBaseComponentPartOptions getBaseComponentPart();
}