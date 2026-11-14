package dev.reuise.web.backend.navigation;
import dev.reuise.web.backend.WebBackendComponentOptions;
import dev.reuise.web.backend.accordion.WebBackendAccordionOptions;
import dev.reuise.web.backend.accordion.WebBackendAccordionPartOptions;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentPartOptions;
import dev.reuise.web.backend.layout.WebBackendContainerPartOptions;
import dev.reuise.web.backend.layout.WebBackendFlexContainerPartOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPartOptions;
import dev.reuise.web.core.navigation.WebNavigationTreeOptions;
// Todo: Clean up unneeded interfaces
public interface WebBackendNavigationTreeOptions extends WebBackendContainerPartOptions , WebNavigationTreeOptions , WebBackendAccordionOptions , WebBackendBaseComponentPartOptions , WebBackendFlexContainerPartOptions , WebBackendAccordionPartOptions , WebBackendComponentOptions , WebBackendParentComponentPartOptions , WebBackendNavigationTreePartOptions {
    WebBackendAccordionPartOptions getAccordionPart();

    WebBackendFlexContainerPartOptions getFlexContainerPart();

    WebBackendContainerPartOptions getContainerPart();

    WebBackendParentComponentPartOptions getParentComponentPart();

    WebBackendBaseComponentPartOptions getBaseComponentPart();
}
