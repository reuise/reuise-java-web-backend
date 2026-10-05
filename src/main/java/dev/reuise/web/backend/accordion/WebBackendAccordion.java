package dev.reuise.web.backend.accordion;
import dev.reuise.web.backend.WebBackendComponent;
import dev.reuise.web.backend.layout.WebBackendFlexContainer;
import dev.reuise.web.core.accordion.WebAccordion;
public interface WebBackendAccordion extends WebAccordion , WebBackendComponent , WebBackendFlexContainer , WebBackendAccordionPart {
    WebBackendAccordion getComponent();
}