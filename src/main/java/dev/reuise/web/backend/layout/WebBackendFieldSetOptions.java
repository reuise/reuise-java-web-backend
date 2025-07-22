package dev.reuise.web.backend.layout;
import dev.reuise.web.backend.WebBackendComponentOptions;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentPartOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPartOptions;
import dev.reuise.web.core.layout.WebFieldSetOptions;
// Todo: Clean up uneeded interfaces
public interface WebBackendFieldSetOptions extends WebFieldSetOptions , WebBackendContainerPartOptions , WebBackendBaseComponentPartOptions , WebBackendFieldSetPartOptions , WebBackendContainerOptions , WebBackendComponentOptions , WebBackendParentComponentPartOptions {
    WebBackendContainerPartOptions getContainerPart();

    WebBackendParentComponentPartOptions getParentComponentPart();

    WebBackendBaseComponentPartOptions getBaseComponentPart();
}