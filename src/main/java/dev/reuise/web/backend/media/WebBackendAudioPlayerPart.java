package dev.reuise.web.backend.media;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.core.media.WebAudioPlayerPart;
public interface WebBackendAudioPlayerPart extends WebAudioPlayerPart , WebBackendAudioPlayerFeatures , WebBackendMediaPlayerPart , WebBackendComponentPart {
    WebBackendMediaPlayerPart getMediaPlayerPart();
}