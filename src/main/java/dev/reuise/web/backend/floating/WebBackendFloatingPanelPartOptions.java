package dev.reuise.web.backend.floating;
import dev.reuise.core.State;
import dev.reuise.core.option.ComponentCreator;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.button.WebBackendButton;
import dev.reuise.web.backend.button.WebBackendButtonOptions;
import dev.reuise.web.backend.layout.WebBackendContainer;
import dev.reuise.web.backend.layout.WebBackendContainerOptions;
import dev.reuise.web.backend.layout.WebBackendContainerPartOptions;
import dev.reuise.web.backend.text.WebBackendInlineText;
import dev.reuise.web.backend.text.WebBackendInlineTextOptions;
import dev.reuise.web.core.floating.WebFloatingPanelPartOptions;
public interface WebBackendFloatingPanelPartOptions extends WebFloatingPanelPartOptions {
    WebBackendContainerPartOptions getContainerPart();

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebBackendFloatingPanelPartOptions setTriggerCreator(ComponentCreator<? extends WebBackendFloatingActionButton, ? extends WebBackendFloatingActionButtonOptions> triggerCreator);

    WebBackendFloatingPanelPartOptions setPanelCreator(ComponentCreator<? extends WebBackendContainer, ? extends WebBackendContainerOptions> panelCreator);

    WebBackendFloatingPanelPartOptions setHeaderCreator(ComponentCreator<? extends WebBackendContainer, ? extends WebBackendContainerOptions> headerCreator);

    WebBackendFloatingPanelPartOptions setTitleContainerCreator(ComponentCreator<? extends WebBackendInlineText, ? extends WebBackendInlineTextOptions> titleContainerCreator);

    WebBackendFloatingPanelPartOptions setMinimiseButtonCreator(ComponentCreator<? extends WebBackendButton, ? extends WebBackendButtonOptions> minimiseButtonCreator);

    WebBackendFloatingPanelPartOptions setCloseButtonCreator(ComponentCreator<? extends WebBackendButton, ? extends WebBackendButtonOptions> closeButtonCreator);

    WebBackendFloatingPanelPartOptions setContentCreator(ComponentCreator<? extends WebBackendContainer, ? extends WebBackendContainerOptions> contentCreator);

    WebBackendComponentFactory getComponentFactory();

    WebBackendFloatingPanel getComponent();
}
