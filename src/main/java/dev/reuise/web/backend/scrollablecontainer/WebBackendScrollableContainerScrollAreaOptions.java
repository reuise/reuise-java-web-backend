package dev.reuise.web.backend.scrollablecontainer;
import dev.reuise.web.backend.WebBackendComponentOptions;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentPartOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPartOptions;
import dev.reuise.web.core.scrollablecontainer.WebScrollableContainerScrollAreaOptions;
// Todo: Clean up uneeded interfaces
public interface WebBackendScrollableContainerScrollAreaOptions extends WebScrollableContainerScrollAreaOptions , WebBackendBaseComponentPartOptions , WebBackendScrollableContainerScrollAreaPartOptions , WebBackendComponentOptions , WebBackendParentComponentOptions , WebBackendParentComponentPartOptions {
    WebBackendParentComponentPartOptions getParentComponentPart();

    WebBackendBaseComponentPartOptions getBaseComponentPart();
}