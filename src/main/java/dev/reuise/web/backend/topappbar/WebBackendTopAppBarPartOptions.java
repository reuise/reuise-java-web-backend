package dev.reuise.web.backend.topappbar;
import dev.reuise.core.State;
import dev.reuise.core.option.ComponentCreator;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.button.WebBackendIconButton;
import dev.reuise.web.backend.button.WebBackendIconButtonOptions;
import dev.reuise.web.backend.layout.WebBackendContainer;
import dev.reuise.web.backend.layout.WebBackendContainerOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPartOptions;
import dev.reuise.web.core.topappbar.WebTopAppBarPartOptions;
public interface WebBackendTopAppBarPartOptions extends WebTopAppBarPartOptions {
    WebBackendParentComponentPartOptions getParentComponentPart();

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebBackendTopAppBarPartOptions setContainerCreator(ComponentCreator<? extends WebBackendContainer, ? extends WebBackendContainerOptions> containerCreator);

    WebBackendTopAppBarPartOptions setNavigationButtonCreator(ComponentCreator<? extends WebBackendIconButton, ? extends WebBackendIconButtonOptions> navigationButtonCreator);

    WebBackendTopAppBarPartOptions setTitleContainerCreator(ComponentCreator<? extends WebBackendContainer, ? extends WebBackendContainerOptions> titleContainerCreator);

    WebBackendTopAppBarPartOptions setActionsContainerCreator(ComponentCreator<? extends WebBackendContainer, ? extends WebBackendContainerOptions> actionsContainerCreator);

    WebBackendComponentFactory getComponentFactory();

    WebBackendTopAppBar getComponent();
}