package dev.reuise.web.backend.link;
import dev.reuise.web.backend.WebBackendComponent;
import dev.reuise.web.core.link.WebNavigationLink;
public interface WebBackendNavigationLink extends WebNavigationLink , WebBackendLink , WebBackendComponent , WebBackendNavigationLinkPart {
    WebBackendNavigationLink getComponent();
}