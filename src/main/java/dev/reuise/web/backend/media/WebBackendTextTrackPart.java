package dev.reuise.web.backend.media;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPart;
import dev.reuise.web.core.media.WebTextTrackPart;
public interface WebBackendTextTrackPart extends WebBackendComponentPart , WebTextTrackPart , WebBackendTextTrackFeatures , WebBackendParentComponentPart {
    WebBackendParentComponentPart getParentComponentPart();
}