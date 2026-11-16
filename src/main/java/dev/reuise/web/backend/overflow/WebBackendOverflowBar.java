package dev.reuise.web.backend.overflow;
import dev.reuise.core.ComponentAnimation;
import dev.reuise.web.backend.WebBackendComponent;
import dev.reuise.web.backend.layout.WebBackendFlexContainer;
import dev.reuise.web.core.overflow.WebOverflowBar;
public interface WebBackendOverflowBar extends WebBackendOverflowBarPart , WebOverflowBar , WebBackendComponent , WebBackendFlexContainer {
    WebBackendOverflowBar getComponent();

    WebBackendOverflowBar setAnimation(ComponentAnimation animation);

    WebBackendOverflowBar startAnimation();

    WebBackendOverflowBar cancelAnimation();
}
