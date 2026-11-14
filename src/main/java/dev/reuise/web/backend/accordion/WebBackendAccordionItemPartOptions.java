package dev.reuise.web.backend.accordion;
import dev.reuise.core.State;
import dev.reuise.core.option.ComponentCreator;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.button.WebBackendButton;
import dev.reuise.web.backend.button.WebBackendButtonOptions;
import dev.reuise.web.backend.layout.WebBackendContainer;
import dev.reuise.web.backend.layout.WebBackendContainerOptions;
import dev.reuise.web.backend.layout.WebBackendFlexContainer;
import dev.reuise.web.backend.layout.WebBackendFlexContainerOptions;
import dev.reuise.web.backend.layout.WebBackendFlexContainerPartOptions;
import dev.reuise.web.core.accordion.WebAccordionItemPartOptions;
public interface WebBackendAccordionItemPartOptions extends WebAccordionItemPartOptions {
    WebBackendFlexContainerPartOptions getFlexContainerPart();

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebBackendAccordionItemPartOptions setHeaderCreator(ComponentCreator<? extends WebBackendFlexContainer, ? extends WebBackendFlexContainerOptions> headerCreator);

    WebBackendAccordionItemPartOptions setToggleCreator(ComponentCreator<? extends WebBackendButton, ? extends WebBackendButtonOptions> toggleCreator);

    WebBackendAccordionItemPartOptions setContentCreator(ComponentCreator<? extends WebBackendContainer, ? extends WebBackendContainerOptions> contentCreator);

    WebBackendComponentFactory getComponentFactory();

    WebBackendAccordionItem getComponent();
}
