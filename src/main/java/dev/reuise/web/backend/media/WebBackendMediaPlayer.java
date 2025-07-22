package dev.reuise.web.backend.media;
import dev.reuise.web.backend.WebBackendComponent;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponent;
import dev.reuise.web.core.media.WebMediaPlayer;
public interface WebBackendMediaPlayer extends WebBackendParentComponent , WebBackendMediaPlayerPart , WebMediaPlayer , WebBackendComponent {
    WebBackendMediaPlayer getComponent();
}