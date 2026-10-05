package dev.reuise.web.backend.accordion;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.layout.WebBackendFlexContainerPart;
import dev.reuise.web.core.accordion.WebAccordionPart;
public interface WebBackendAccordionPart extends WebAccordionPart , WebBackendComponentPart , WebBackendFlexContainerPart , WebBackendAccordionFeatures {
    WebBackendFlexContainerPart getFlexContainerPart();
}