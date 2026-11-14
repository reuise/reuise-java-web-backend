package dev.reuise.web.backend.navigation;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.link.WebBackendNavigationLinkPart;
import dev.reuise.web.backend.list.WebBackendListItem;
import dev.reuise.web.core.navigation.WebNavigationTreeLinkPart;
public interface WebBackendNavigationTreeLinkPart extends WebNavigationTreeLinkPart , WebBackendNavigationTreeLinkFeatures , WebBackendComponentPart , WebBackendNavigationLinkPart {
    WebBackendListItem getItem();

    WebBackendNavigationLinkPart getNavigationLinkPart();
}
