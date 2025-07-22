package dev.reuise.web.backend.media;
import dev.reuise.core.State;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.core.media.WebAudioPlayerPartOptions;
public interface WebBackendAudioPlayerPartOptions extends WebAudioPlayerPartOptions {
    WebBackendMediaPlayerPartOptions getMediaPlayerPart();

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebBackendComponentFactory getComponentFactory();

    WebBackendAudioPlayer getComponent();
}