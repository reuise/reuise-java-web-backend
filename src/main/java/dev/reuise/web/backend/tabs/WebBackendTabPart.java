package dev.reuise.web.backend.tabs;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.badge.WebBackendBadge;
import dev.reuise.web.backend.icon.WebBackendIcon;
import dev.reuise.web.backend.link.WebBackendLink;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPart;
import dev.reuise.web.backend.text.WebBackendInlineText;
import dev.reuise.web.core.tabs.WebTabPart;
public interface WebBackendTabPart extends WebBackendComponentPart , WebBackendTabFeatures , WebBackendParentComponentPart , WebTabPart {
    WebBackendLink getLink();

    WebBackendBadge getBadge();

    WebBackendIcon getIcon();

    WebBackendInlineText getLabelContainer();

    WebBackendParentComponentPart getParentComponentPart();
}