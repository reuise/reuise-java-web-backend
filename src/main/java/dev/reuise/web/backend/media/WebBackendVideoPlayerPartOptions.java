package dev.reuise.web.backend.media;
import dev.reuise.core.State;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.core.media.WebVideoPlayerPartOptions;
public interface WebBackendVideoPlayerPartOptions extends WebVideoPlayerPartOptions {
    WebBackendMediaPlayerPartOptions getMediaPlayerPart();

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebBackendComponentFactory getComponentFactory();

    WebBackendVideoPlayer getComponent();
}