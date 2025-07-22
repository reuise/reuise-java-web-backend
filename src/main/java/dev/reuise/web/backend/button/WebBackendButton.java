package dev.reuise.web.backend.button;
import dev.reuise.web.backend.WebBackendComponent;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponent;
import dev.reuise.web.core.button.WebButton;
public interface WebBackendButton extends WebBackendButtonPart , WebBackendParentComponent , WebButton , WebBackendComponent {
    WebBackendButton getComponent();
}