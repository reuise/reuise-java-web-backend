package dev.reuise.web.backend.button;
import dev.reuise.core.ComponentAnimation;
import dev.reuise.web.backend.WebBackendComponent;
import dev.reuise.web.backend.layout.WebBackendFlexContainer;
import dev.reuise.web.core.button.WebButtonBar;
public interface WebBackendButtonBar extends WebBackendButtonBarPart , WebBackendComponent , WebButtonBar , WebBackendFlexContainer {
    WebBackendButtonBar getComponent();

    WebBackendButtonBar setAnimation(ComponentAnimation animation);

    WebBackendButtonBar startAnimation();

    WebBackendButtonBar cancelAnimation();
}
