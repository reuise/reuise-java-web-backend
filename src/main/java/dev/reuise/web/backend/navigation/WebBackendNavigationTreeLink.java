package dev.reuise.web.backend.navigation;
import dev.reuise.web.backend.WebBackendComponent;
import dev.reuise.web.backend.link.WebBackendNavigationLink;
import dev.reuise.web.core.navigation.WebNavigationTreeLink;
public interface WebBackendNavigationTreeLink extends WebBackendNavigationLink , WebBackendNavigationTreeLinkPart , WebBackendComponent , WebNavigationTreeLink {
    WebBackendNavigationTreeLink getComponent();
}
