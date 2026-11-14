package dev.reuise.web.backend.navigation;
import dev.reuise.web.backend.WebBackendComponentOptions;
import dev.reuise.web.backend.accordion.WebBackendAccordionItemOptions;
import dev.reuise.web.backend.accordion.WebBackendAccordionItemPartOptions;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentPartOptions;
import dev.reuise.web.backend.layout.WebBackendContainerPartOptions;
import dev.reuise.web.backend.layout.WebBackendFlexContainerPartOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPartOptions;
import dev.reuise.web.core.navigation.WebNavigationTreeGroupOptions;
// Todo: Clean up unneeded interfaces
public interface WebBackendNavigationTreeGroupOptions extends WebBackendNavigationTreeGroupPartOptions , WebBackendContainerPartOptions , WebBackendAccordionItemPartOptions , WebBackendAccordionItemOptions , WebBackendBaseComponentPartOptions , WebBackendFlexContainerPartOptions , WebBackendComponentOptions , WebNavigationTreeGroupOptions , WebBackendParentComponentPartOptions {
    WebBackendAccordionItemPartOptions getAccordionItemPart();

    WebBackendFlexContainerPartOptions getFlexContainerPart();

    WebBackendContainerPartOptions getContainerPart();

    WebBackendParentComponentPartOptions getParentComponentPart();

    WebBackendBaseComponentPartOptions getBaseComponentPart();
}
