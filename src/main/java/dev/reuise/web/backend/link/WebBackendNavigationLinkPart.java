package dev.reuise.web.backend.link;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.core.link.WebNavigationLinkPart;
public interface WebBackendNavigationLinkPart extends WebBackendComponentPart , WebBackendLinkPart , WebBackendNavigationLinkFeatures , WebNavigationLinkPart {
    WebBackendLinkPart getLinkPart();
}