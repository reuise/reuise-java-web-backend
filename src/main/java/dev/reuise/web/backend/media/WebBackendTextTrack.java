package dev.reuise.web.backend.media;
import dev.reuise.web.backend.WebBackendComponent;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponent;
import dev.reuise.web.core.media.WebTextTrack;
public interface WebBackendTextTrack extends WebBackendTextTrackPart , WebBackendParentComponent , WebTextTrack , WebBackendComponent {
    WebBackendTextTrack getComponent();
}