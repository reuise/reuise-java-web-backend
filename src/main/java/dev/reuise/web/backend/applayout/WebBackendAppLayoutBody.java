package dev.reuise.web.backend.applayout;
import dev.reuise.core.ComponentAnimation;
import dev.reuise.web.backend.WebBackendComponent;
import dev.reuise.web.backend.layout.WebBackendFlexContainer;
import dev.reuise.web.core.applayout.WebAppLayoutBody;
public interface WebBackendAppLayoutBody extends WebBackendAppLayoutBodyPart , WebBackendComponent , WebAppLayoutBody , WebBackendFlexContainer {
    WebBackendAppLayoutBody getComponent();

    WebBackendAppLayoutBody setAnimation(ComponentAnimation animation);

    WebBackendAppLayoutBody startAnimation();

    WebBackendAppLayoutBody cancelAnimation();
}
