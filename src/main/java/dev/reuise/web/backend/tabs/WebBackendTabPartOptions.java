package dev.reuise.web.backend.tabs;
import dev.reuise.core.State;
import dev.reuise.core.option.ComponentCreator;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.badge.WebBackendBadge;
import dev.reuise.web.backend.badge.WebBackendBadgeOptions;
import dev.reuise.web.backend.icon.WebBackendIcon;
import dev.reuise.web.backend.icon.WebBackendIconOptions;
import dev.reuise.web.backend.link.WebBackendLink;
import dev.reuise.web.backend.link.WebBackendLinkOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPartOptions;
import dev.reuise.web.backend.text.WebBackendInlineText;
import dev.reuise.web.backend.text.WebBackendInlineTextOptions;
import dev.reuise.web.core.tabs.WebTabPartOptions;
public interface WebBackendTabPartOptions extends WebTabPartOptions {
    WebBackendParentComponentPartOptions getParentComponentPart();

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebBackendTabPartOptions setLinkCreator(ComponentCreator<? extends WebBackendLink, ? extends WebBackendLinkOptions> linkCreator);

    WebBackendTabPartOptions setBadgeCreator(ComponentCreator<? extends WebBackendBadge, ? extends WebBackendBadgeOptions> badgeCreator);

    WebBackendTabPartOptions setIconCreator(ComponentCreator<? extends WebBackendIcon, ? extends WebBackendIconOptions> iconCreator);

    WebBackendTabPartOptions setLabelContainerCreator(ComponentCreator<? extends WebBackendInlineText, ? extends WebBackendInlineTextOptions> labelContainerCreator);

    WebBackendComponentFactory getComponentFactory();

    WebBackendTab getComponent();
}