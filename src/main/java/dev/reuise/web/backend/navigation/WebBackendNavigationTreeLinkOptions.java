package dev.reuise.web.backend.navigation;
import dev.reuise.web.backend.WebBackendComponentOptions;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentPartOptions;
import dev.reuise.web.backend.link.WebBackendLinkPartOptions;
import dev.reuise.web.backend.link.WebBackendNavigationLinkOptions;
import dev.reuise.web.backend.link.WebBackendNavigationLinkPartOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPartOptions;
import dev.reuise.web.core.navigation.WebNavigationTreeLinkOptions;
// Todo: Clean up unneeded interfaces
public interface WebBackendNavigationTreeLinkOptions extends WebNavigationTreeLinkOptions , WebBackendBaseComponentPartOptions , WebBackendNavigationTreeLinkPartOptions , WebBackendNavigationLinkPartOptions , WebBackendComponentOptions , WebBackendParentComponentPartOptions , WebBackendLinkPartOptions , WebBackendNavigationLinkOptions {
    WebBackendNavigationLinkPartOptions getNavigationLinkPart();

    WebBackendLinkPartOptions getLinkPart();

    WebBackendParentComponentPartOptions getParentComponentPart();

    WebBackendBaseComponentPartOptions getBaseComponentPart();
}
