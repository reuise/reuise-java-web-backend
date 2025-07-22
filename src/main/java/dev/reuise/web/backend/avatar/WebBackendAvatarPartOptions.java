package dev.reuise.web.backend.avatar;
import dev.reuise.core.State;
import dev.reuise.core.option.ComponentCreator;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.badge.WebBackendBadge;
import dev.reuise.web.backend.badge.WebBackendBadgeOptions;
import dev.reuise.web.backend.image.WebBackendImage;
import dev.reuise.web.backend.image.WebBackendImageOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPartOptions;
import dev.reuise.web.core.avatar.WebAvatarPartOptions;
public interface WebBackendAvatarPartOptions extends WebAvatarPartOptions {
    WebBackendParentComponentPartOptions getParentComponentPart();

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebBackendAvatarPartOptions setImageCreator(ComponentCreator<? extends WebBackendImage, ? extends WebBackendImageOptions> imageCreator);

    WebBackendAvatarPartOptions setBadgeCreator(ComponentCreator<? extends WebBackendBadge, ? extends WebBackendBadgeOptions> badgeCreator);

    WebBackendComponentFactory getComponentFactory();

    WebBackendAvatar getComponent();
}