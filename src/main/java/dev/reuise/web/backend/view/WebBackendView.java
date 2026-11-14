package dev.reuise.web.backend.view;
import dev.reuise.core.ComponentAnimation;
import dev.reuise.web.backend.WebBackendComponent;
import dev.reuise.web.backend.layout.WebBackendFlexContainer;
import dev.reuise.web.core.view.WebView;
public interface WebBackendView extends WebView , WebBackendViewPart , WebBackendComponent , WebBackendFlexContainer {
    WebBackendView getComponent();

    WebBackendView setAnimation(ComponentAnimation animation);

    WebBackendView startAnimation();

    WebBackendView cancelAnimation();
}
