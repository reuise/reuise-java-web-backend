package dev.reuise.web.backend.button;
import dev.reuise.web.backend.WebBackendComponent;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponent;
import dev.reuise.web.core.button.WebIconButton;
public interface WebBackendIconButton extends WebBackendParentComponent , WebBackendComponent , WebIconButton , WebBackendIconButtonPart {
    WebBackendIconButton getComponent();
}