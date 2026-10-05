package dev.reuise.web.backend.accordion;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.layout.WebBackendFlexContainerPart;
import dev.reuise.web.core.accordion.WebAccordionItemPart;
public interface WebBackendAccordionItemPart extends WebAccordionItemPart , WebBackendAccordionItemFeatures , WebBackendComponentPart , WebBackendFlexContainerPart {
    WebBackendFlexContainerPart getFlexContainerPart();
}