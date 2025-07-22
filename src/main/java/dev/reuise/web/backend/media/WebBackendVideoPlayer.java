package dev.reuise.web.backend.media;
import dev.reuise.web.backend.WebBackendComponent;
import dev.reuise.web.core.media.WebVideoPlayer;
public interface WebBackendVideoPlayer extends WebBackendVideoPlayerPart , WebBackendComponent , WebBackendMediaPlayer , WebVideoPlayer {
    WebBackendVideoPlayer getComponent();
}