package dev.reuise.web.backend.dropzone;
import dev.reuise.web.backend.WebBackendComponentOptions;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentPartOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPartOptions;
import dev.reuise.web.core.dropzone.WebDropZoneOptions;
// Todo: Clean up uneeded interfaces
public interface WebBackendDropZoneOptions extends WebBackendBaseComponentPartOptions , WebBackendDropZonePartOptions , WebBackendComponentOptions , WebBackendParentComponentOptions , WebDropZoneOptions , WebBackendParentComponentPartOptions {
    WebBackendParentComponentPartOptions getParentComponentPart();

    WebBackendBaseComponentPartOptions getBaseComponentPart();
}