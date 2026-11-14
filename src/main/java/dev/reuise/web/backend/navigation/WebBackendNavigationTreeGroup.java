package dev.reuise.web.backend.navigation;
import dev.reuise.core.ComponentAnimation;
import dev.reuise.web.backend.WebBackendComponent;
import dev.reuise.web.backend.accordion.WebBackendAccordionItem;
import dev.reuise.web.core.navigation.WebNavigationTreeGroup;
public interface WebBackendNavigationTreeGroup extends WebBackendNavigationTreeGroupPart , WebBackendComponent , WebNavigationTreeGroup , WebBackendAccordionItem {
    WebBackendNavigationTreeGroup getComponent();

    WebBackendNavigationTreeGroup setAnimation(ComponentAnimation animation);

    WebBackendNavigationTreeGroup startAnimation();

    WebBackendNavigationTreeGroup cancelAnimation();
}
