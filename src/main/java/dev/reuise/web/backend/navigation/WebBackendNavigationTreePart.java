package dev.reuise.web.backend.navigation;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.accordion.WebBackendAccordionPart;
import dev.reuise.web.core.navigation.WebNavigationTreePart;
public interface WebBackendNavigationTreePart extends WebBackendNavigationTreeFeatures , WebBackendComponentPart , WebBackendAccordionPart , WebNavigationTreePart {
    WebBackendAccordionPart getAccordionPart();
}
