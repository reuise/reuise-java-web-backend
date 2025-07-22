package dev.reuise.web.backend.media;
import dev.reuise.web.backend.WebBackendComponentOptions;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentPartOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPartOptions;
import dev.reuise.web.core.media.WebVideoPlayerOptions;
// Todo: Clean up uneeded interfaces
public interface WebBackendVideoPlayerOptions extends WebVideoPlayerOptions , WebBackendMediaPlayerPartOptions , WebBackendBaseComponentPartOptions , WebBackendComponentOptions , WebBackendVideoPlayerPartOptions , WebBackendParentComponentPartOptions , WebBackendMediaPlayerOptions {
    WebBackendMediaPlayerPartOptions getMediaPlayerPart();

    WebBackendParentComponentPartOptions getParentComponentPart();

    WebBackendBaseComponentPartOptions getBaseComponentPart();
}