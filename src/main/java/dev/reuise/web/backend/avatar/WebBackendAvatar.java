package dev.reuise.web.backend.avatar;
import dev.reuise.web.backend.WebBackendComponent;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponent;
import dev.reuise.web.core.avatar.WebAvatar;
public interface WebBackendAvatar extends WebBackendParentComponent , WebAvatar , WebBackendComponent , WebBackendAvatarPart {
    WebBackendAvatar getComponent();
}