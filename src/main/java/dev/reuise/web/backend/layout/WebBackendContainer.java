package dev.reuise.web.backend.layout;
import dev.reuise.core.ComponentAnimation;
import dev.reuise.web.backend.WebBackendComponent;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponent;
import dev.reuise.web.core.layout.WebContainer;
public interface WebBackendContainer extends WebBackendParentComponent , WebBackendContainerPart , WebBackendComponent , WebContainer {
    WebBackendContainer getComponent();

    WebBackendContainer setAnimation(ComponentAnimation animation);

    WebBackendContainer startAnimation();

    WebBackendContainer cancelAnimation();
}
