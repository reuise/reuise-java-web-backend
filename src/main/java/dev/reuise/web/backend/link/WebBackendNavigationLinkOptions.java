package dev.reuise.web.backend.link;
import dev.reuise.web.backend.WebBackendComponentOptions;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentPartOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPartOptions;
import dev.reuise.web.core.link.WebNavigationLinkOptions;
// Todo: Clean up uneeded interfaces
public interface WebBackendNavigationLinkOptions extends WebBackendLinkOptions , WebBackendBaseComponentPartOptions , WebNavigationLinkOptions , WebBackendNavigationLinkPartOptions , WebBackendComponentOptions , WebBackendParentComponentPartOptions , WebBackendLinkPartOptions {
    WebBackendLinkPartOptions getLinkPart();

    WebBackendParentComponentPartOptions getParentComponentPart();

    WebBackendBaseComponentPartOptions getBaseComponentPart();
}