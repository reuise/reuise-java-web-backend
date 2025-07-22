package dev.reuise.web.backend.slidecontainer;
import dev.reuise.web.backend.WebBackendComponentOptions;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentPartOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPartOptions;
import dev.reuise.web.core.slidecontainer.WebSlideContainerEdgeOptions;
// Todo: Clean up uneeded interfaces
public interface WebBackendSlideContainerEdgeOptions extends WebBackendBaseComponentPartOptions , WebBackendSlideContainerEdgePartOptions , WebBackendComponentOptions , WebBackendParentComponentOptions , WebSlideContainerEdgeOptions , WebBackendParentComponentPartOptions {
    WebBackendParentComponentPartOptions getParentComponentPart();

    WebBackendBaseComponentPartOptions getBaseComponentPart();
}