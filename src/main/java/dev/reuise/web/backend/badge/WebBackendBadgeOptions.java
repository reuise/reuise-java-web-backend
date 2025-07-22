package dev.reuise.web.backend.badge;
import dev.reuise.web.backend.WebBackendComponentOptions;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentOptions;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentPartOptions;
import dev.reuise.web.core.badge.WebBadgeOptions;
// Todo: Clean up uneeded interfaces
public interface WebBackendBadgeOptions extends WebBadgeOptions , WebBackendBadgePartOptions , WebBackendBaseComponentPartOptions , WebBackendComponentOptions , WebBackendBaseComponentOptions {
    WebBackendBaseComponentPartOptions getBaseComponentPart();
}