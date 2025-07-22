package dev.reuise.web.backend.splitcontainer;
import dev.reuise.core.State;
import dev.reuise.core.option.ComponentCreator;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.layout.WebBackendContainer;
import dev.reuise.web.backend.layout.WebBackendContainerOptions;
import dev.reuise.web.backend.layout.WebBackendContainerPartOptions;
import dev.reuise.web.core.splitcontainer.WebSplitContainerPartOptions;
public interface WebBackendSplitContainerPartOptions extends WebSplitContainerPartOptions {
    WebBackendContainerPartOptions getContainerPart();

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebBackendSplitContainerPartOptions setContainerCreator(ComponentCreator<? extends WebBackendContainer, ? extends WebBackendContainerOptions> containerCreator);

    WebBackendSplitContainerPartOptions setStartPanelCreator(ComponentCreator<? extends WebBackendSplitContainerPanel, ? extends WebBackendSplitContainerPanelOptions> startPanelCreator);

    WebBackendSplitContainerPartOptions setDividerCreator(ComponentCreator<? extends WebBackendSplitContainerDivider, ? extends WebBackendSplitContainerDividerOptions> dividerCreator);

    WebBackendSplitContainerPartOptions setEndPanelCreator(ComponentCreator<? extends WebBackendSplitContainerPanel, ? extends WebBackendSplitContainerPanelOptions> endPanelCreator);

    WebBackendComponentFactory getComponentFactory();

    WebBackendSplitContainer getComponent();
}