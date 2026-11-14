package dev.reuise.web.backend.scrollablecontainer;
import dev.reuise.core.ComponentAnimation;
import dev.reuise.web.backend.WebBackendComponent;
import dev.reuise.web.backend.layout.WebBackendContainer;
import dev.reuise.web.core.scrollablecontainer.WebScrollableContainer;
public interface WebBackendScrollableContainer extends WebBackendScrollableContainerPart , WebScrollableContainer , WebBackendComponent , WebBackendContainer {
    WebBackendScrollableContainer getComponent();

    WebBackendScrollableContainer setAnimation(ComponentAnimation animation);

    WebBackendScrollableContainer startAnimation();

    WebBackendScrollableContainer cancelAnimation();
}
