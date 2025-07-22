package dev.reuise.web.backend.media;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPart;
import dev.reuise.web.core.media.WebMediaPlayerPart;
public interface WebBackendMediaPlayerPart extends WebMediaPlayerPart , WebBackendComponentPart , WebBackendParentComponentPart , WebBackendMediaPlayerFeatures {
    WebBackendParentComponentPart getParentComponentPart();
}