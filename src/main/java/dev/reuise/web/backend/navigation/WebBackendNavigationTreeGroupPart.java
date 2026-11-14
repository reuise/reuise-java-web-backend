package dev.reuise.web.backend.navigation;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.accordion.WebBackendAccordionItemPart;
import dev.reuise.web.core.navigation.WebNavigationTreeGroupPart;
public interface WebBackendNavigationTreeGroupPart extends WebBackendNavigationTreeGroupFeatures , WebNavigationTreeGroupPart , WebBackendComponentPart , WebBackendAccordionItemPart {
    WebBackendNavigationTreeLink getLink();

    WebBackendNavigationTree getTree();

    WebBackendAccordionItemPart getAccordionItemPart();
}
