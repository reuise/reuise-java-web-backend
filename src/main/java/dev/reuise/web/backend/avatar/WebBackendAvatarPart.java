package dev.reuise.web.backend.avatar;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.badge.WebBackendBadge;
import dev.reuise.web.backend.image.WebBackendImage;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPart;
import dev.reuise.web.core.avatar.WebAvatarPart;
public interface WebBackendAvatarPart extends WebBackendComponentPart , WebBackendAvatarFeatures , WebBackendParentComponentPart , WebAvatarPart {
    WebBackendImage getImage();

    WebBackendBadge getBadge();

    WebBackendParentComponentPart getParentComponentPart();
}