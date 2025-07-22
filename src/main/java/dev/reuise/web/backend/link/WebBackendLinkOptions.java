package dev.reuise.web.backend.link;
import dev.reuise.web.backend.WebBackendComponentOptions;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentPartOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPartOptions;
import dev.reuise.web.core.link.WebLinkOptions;
// Todo: Clean up uneeded interfaces
public interface WebBackendLinkOptions extends WebBackendBaseComponentPartOptions , WebBackendComponentOptions , WebBackendParentComponentOptions , WebBackendParentComponentPartOptions , WebBackendLinkPartOptions , WebLinkOptions {
    WebBackendParentComponentPartOptions getParentComponentPart();

    WebBackendBaseComponentPartOptions getBaseComponentPart();
}