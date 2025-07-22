package dev.reuise.web.backend.media;
import dev.reuise.web.backend.WebBackendComponent;
import dev.reuise.web.core.media.WebAudioPlayer;
public interface WebBackendAudioPlayer extends WebBackendAudioPlayerPart , WebBackendComponent , WebAudioPlayer , WebBackendMediaPlayer {
    WebBackendAudioPlayer getComponent();
}