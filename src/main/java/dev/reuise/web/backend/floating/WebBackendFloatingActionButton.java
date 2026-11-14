package dev.reuise.web.backend.floating;
import dev.reuise.web.backend.WebBackendComponent;
import dev.reuise.web.backend.button.WebBackendButton;
import dev.reuise.web.core.floating.WebFloatingActionButton;
public interface WebBackendFloatingActionButton extends WebBackendButton , WebBackendComponent , WebFloatingActionButton , WebBackendFloatingActionButtonPart {
    WebBackendFloatingActionButton getComponent();
}
