package dev.reuise.web.backend.accordion;
import dev.reuise.core.ComponentAnimation;
import dev.reuise.web.backend.WebBackendComponent;
import dev.reuise.web.backend.layout.WebBackendFlexContainer;
import dev.reuise.web.core.accordion.WebAccordion;
public interface WebBackendAccordion extends WebAccordion , WebBackendComponent , WebBackendFlexContainer , WebBackendAccordionPart {
    WebBackendAccordion getComponent();

    WebBackendAccordion setAnimation(ComponentAnimation animation);

    WebBackendAccordion startAnimation();

    WebBackendAccordion cancelAnimation();
}
