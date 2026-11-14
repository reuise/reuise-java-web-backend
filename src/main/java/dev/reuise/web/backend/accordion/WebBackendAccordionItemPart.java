package dev.reuise.web.backend.accordion;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.button.WebBackendButton;
import dev.reuise.web.backend.layout.WebBackendContainer;
import dev.reuise.web.backend.layout.WebBackendFlexContainer;
import dev.reuise.web.backend.layout.WebBackendFlexContainerPart;
import dev.reuise.web.core.accordion.WebAccordionItemPart;
public interface WebBackendAccordionItemPart extends WebAccordionItemPart , WebBackendAccordionItemFeatures , WebBackendComponentPart , WebBackendFlexContainerPart {
    WebBackendFlexContainer getHeader();

    WebBackendButton getToggle();

    WebBackendContainer getContent();

    WebBackendFlexContainerPart getFlexContainerPart();
}
