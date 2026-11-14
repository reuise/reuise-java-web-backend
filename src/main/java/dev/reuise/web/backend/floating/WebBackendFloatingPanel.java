package dev.reuise.web.backend.floating;
import dev.reuise.core.ComponentAnimation;
import dev.reuise.web.backend.WebBackendComponent;
import dev.reuise.web.backend.layout.WebBackendContainer;
import dev.reuise.web.core.floating.WebFloatingPanel;
public interface WebBackendFloatingPanel extends WebBackendFloatingPanelPart , WebBackendComponent , WebBackendContainer , WebFloatingPanel {
    WebBackendFloatingPanel getComponent();

    WebBackendFloatingPanel setAnimation(ComponentAnimation animation);

    WebBackendFloatingPanel startAnimation();

    WebBackendFloatingPanel cancelAnimation();
}
