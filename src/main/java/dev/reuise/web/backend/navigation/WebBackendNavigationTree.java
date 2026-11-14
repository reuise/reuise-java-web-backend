package dev.reuise.web.backend.navigation;
import dev.reuise.core.ComponentAnimation;
import dev.reuise.web.backend.WebBackendComponent;
import dev.reuise.web.backend.accordion.WebBackendAccordion;
import dev.reuise.web.core.navigation.WebNavigationTree;
public interface WebBackendNavigationTree extends WebBackendNavigationTreePart , WebNavigationTree , WebBackendAccordion , WebBackendComponent {
    WebBackendNavigationTree getComponent();

    WebBackendNavigationTree setAnimation(ComponentAnimation animation);

    WebBackendNavigationTree startAnimation();

    WebBackendNavigationTree cancelAnimation();
}
