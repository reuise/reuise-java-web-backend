package dev.reuise.web.backend.floating;
import dev.reuise.web.backend.WebBackendComponentOptions;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentPartOptions;
import dev.reuise.web.backend.button.WebBackendButtonOptions;
import dev.reuise.web.backend.button.WebBackendButtonPartOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPartOptions;
import dev.reuise.web.core.floating.WebFloatingActionButtonOptions;
// Todo: Clean up unneeded interfaces
public interface WebBackendFloatingActionButtonOptions extends WebBackendButtonOptions , WebBackendButtonPartOptions , WebFloatingActionButtonOptions , WebBackendBaseComponentPartOptions , WebBackendFloatingActionButtonPartOptions , WebBackendComponentOptions , WebBackendParentComponentPartOptions {
    WebBackendButtonPartOptions getButtonPart();

    WebBackendParentComponentPartOptions getParentComponentPart();

    WebBackendBaseComponentPartOptions getBaseComponentPart();
}
