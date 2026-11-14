package dev.reuise.web.backend.menu;
import dev.reuise.core.State;
import dev.reuise.core.option.ComponentCreator;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.button.WebBackendButton;
import dev.reuise.web.backend.button.WebBackendButtonOptions;
import dev.reuise.web.backend.layout.WebBackendContainer;
import dev.reuise.web.backend.layout.WebBackendContainerOptions;
import dev.reuise.web.backend.layout.WebBackendContainerPartOptions;
import dev.reuise.web.core.menu.WebMenuButtonPartOptions;
public interface WebBackendMenuButtonPartOptions extends WebMenuButtonPartOptions {
    WebBackendContainerPartOptions getContainerPart();

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebBackendMenuButtonPartOptions setTriggerCreator(ComponentCreator<? extends WebBackendButton, ? extends WebBackendButtonOptions> triggerCreator);

    WebBackendMenuButtonPartOptions setPopupCreator(ComponentCreator<? extends WebBackendContainer, ? extends WebBackendContainerOptions> popupCreator);

    WebBackendComponentFactory getComponentFactory();

    WebBackendMenuButton getComponent();
}
