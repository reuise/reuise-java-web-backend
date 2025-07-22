package dev.reuise.web.backend.scrollablecontainer;
import dev.reuise.web.backend.WebBackendComponentOptions;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentPartOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPartOptions;
import dev.reuise.web.core.scrollablecontainer.WebScrollableContainerEdgeOptions;
// Todo: Clean up uneeded interfaces
public interface WebBackendScrollableContainerEdgeOptions extends WebBackendBaseComponentPartOptions , WebScrollableContainerEdgeOptions , WebBackendComponentOptions , WebBackendParentComponentOptions , WebBackendParentComponentPartOptions , WebBackendScrollableContainerEdgePartOptions {
    WebBackendParentComponentPartOptions getParentComponentPart();

    WebBackendBaseComponentPartOptions getBaseComponentPart();
}