package dev.reuise.web.backend.dropzone;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPart;
import dev.reuise.web.core.dropzone.WebDropZonePart;
public interface WebBackendDropZonePart extends WebBackendComponentPart , WebBackendDropZoneFeatures , WebBackendParentComponentPart , WebDropZonePart {
    WebBackendParentComponentPart getParentComponentPart();
}