package dev.reuise.web.backend.accordion;
import dev.reuise.web.backend.WebBackendComponent;
import dev.reuise.web.backend.layout.WebBackendFlexContainer;
import dev.reuise.web.core.accordion.WebAccordionItem;
public interface WebBackendAccordionItem extends WebAccordionItem , WebBackendComponent , WebBackendAccordionItemPart , WebBackendFlexContainer {
    WebBackendAccordionItem getComponent();
}