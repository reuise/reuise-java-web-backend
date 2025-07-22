package dev.reuise.web.backend.dropzone;
import dev.reuise.web.backend.WebBackendComponent;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponent;
import dev.reuise.web.core.dropzone.WebDropZone;
public interface WebBackendDropZone extends WebDropZone , WebBackendParentComponent , WebBackendComponent , WebBackendDropZonePart {
    WebBackendDropZone getComponent();
}