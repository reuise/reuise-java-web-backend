package dev.reuise.web.backend.layout;
import dev.reuise.core.ComponentAnimation;
import dev.reuise.web.backend.WebBackendComponent;
import dev.reuise.web.core.layout.WebRowLayout;
public interface WebBackendRowLayout extends WebRowLayout , WebBackendRowLayoutPart , WebBackendComponent , WebBackendFlexContainer {
    WebBackendRowLayout getComponent();

    WebBackendRowLayout setAnimation(ComponentAnimation animation);

    WebBackendRowLayout startAnimation();

    WebBackendRowLayout cancelAnimation();
}
