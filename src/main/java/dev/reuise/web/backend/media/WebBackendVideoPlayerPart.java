package dev.reuise.web.backend.media;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.core.media.WebVideoPlayerPart;
public interface WebBackendVideoPlayerPart extends WebVideoPlayerPart , WebBackendMediaPlayerPart , WebBackendComponentPart , WebBackendVideoPlayerFeatures {
    WebBackendMediaPlayerPart getMediaPlayerPart();
}