package dev.reuise.web.backend.overflow;
import dev.reuise.core.State;
import dev.reuise.core.option.ComponentCreator;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.layout.WebBackendFlexContainer;
import dev.reuise.web.backend.layout.WebBackendFlexContainerOptions;
import dev.reuise.web.backend.layout.WebBackendFlexContainerPartOptions;
import dev.reuise.web.backend.menu.WebBackendMenuButton;
import dev.reuise.web.backend.menu.WebBackendMenuButtonOptions;
import dev.reuise.web.core.overflow.WebOverflowBarPartOptions;
public interface WebBackendOverflowBarPartOptions extends WebOverflowBarPartOptions {
    WebBackendFlexContainerPartOptions getFlexContainerPart();

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebBackendOverflowBarPartOptions setItemsCreator(ComponentCreator<? extends WebBackendFlexContainer, ? extends WebBackendFlexContainerOptions> itemsCreator);

    WebBackendOverflowBarPartOptions setOverflowMenuCreator(ComponentCreator<? extends WebBackendMenuButton, ? extends WebBackendMenuButtonOptions> overflowMenuCreator);

    WebBackendComponentFactory getComponentFactory();

    WebBackendOverflowBar getComponent();
}
