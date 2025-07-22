package dev.reuise.web.backend.media;
import dev.reuise.web.backend.WebBackendComponentOptions;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentPartOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPartOptions;
import dev.reuise.web.core.media.WebAudioPlayerOptions;
// Todo: Clean up uneeded interfaces
public interface WebBackendAudioPlayerOptions extends WebAudioPlayerOptions , WebBackendMediaPlayerPartOptions , WebBackendBaseComponentPartOptions , WebBackendAudioPlayerPartOptions , WebBackendComponentOptions , WebBackendParentComponentPartOptions , WebBackendMediaPlayerOptions {
    WebBackendMediaPlayerPartOptions getMediaPlayerPart();

    WebBackendParentComponentPartOptions getParentComponentPart();

    WebBackendBaseComponentPartOptions getBaseComponentPart();
}