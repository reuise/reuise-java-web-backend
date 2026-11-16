package dev.reuise.web.backend.overflow;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.layout.WebBackendFlexContainer;
import dev.reuise.web.backend.layout.WebBackendFlexContainerPart;
import dev.reuise.web.backend.menu.WebBackendMenuButton;
import dev.reuise.web.core.overflow.WebOverflowBarPart;
public interface WebBackendOverflowBarPart extends WebOverflowBarPart , WebBackendComponentPart , WebBackendFlexContainerPart , WebBackendOverflowBarFeatures {
    WebBackendFlexContainer getItems();

    WebBackendMenuButton getOverflowMenu();

    WebBackendFlexContainerPart getFlexContainerPart();
}
