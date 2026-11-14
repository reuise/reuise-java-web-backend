package dev.reuise.web.backend.menu;
import dev.reuise.web.backend.WebBackendComponentOptions;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentPartOptions;
import dev.reuise.web.backend.button.WebBackendButtonOptions;
import dev.reuise.web.backend.button.WebBackendButtonPartOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPartOptions;
import dev.reuise.web.core.menu.WebMenuButtonItemOptions;
// Todo: Clean up unneeded interfaces
public interface WebBackendMenuButtonItemOptions extends WebBackendButtonOptions , WebBackendMenuButtonItemPartOptions , WebBackendButtonPartOptions , WebBackendBaseComponentPartOptions , WebBackendComponentOptions , WebBackendParentComponentPartOptions , WebMenuButtonItemOptions {
    WebBackendButtonPartOptions getButtonPart();

    WebBackendParentComponentPartOptions getParentComponentPart();

    WebBackendBaseComponentPartOptions getBaseComponentPart();
}
