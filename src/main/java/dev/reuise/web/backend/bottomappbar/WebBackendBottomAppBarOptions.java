package dev.reuise.web.backend.bottomappbar;
import dev.reuise.web.backend.WebBackendComponentOptions;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentOptions;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentPartOptions;
import dev.reuise.web.core.bottomappbar.WebBottomAppBarOptions;
// Todo: Clean up uneeded interfaces
public interface WebBackendBottomAppBarOptions extends WebBackendBaseComponentPartOptions , WebBottomAppBarOptions , WebBackendBottomAppBarPartOptions , WebBackendComponentOptions , WebBackendBaseComponentOptions {
    WebBackendBaseComponentPartOptions getBaseComponentPart();
}