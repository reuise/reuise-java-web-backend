package dev.reuise.web.backend.splitcontainer;
import dev.reuise.core.State;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.layout.WebBackendContainerPartOptions;
import dev.reuise.web.core.splitcontainer.WebSplitContainerPanelPartOptions;
public interface WebBackendSplitContainerPanelPartOptions extends WebSplitContainerPanelPartOptions {
    WebBackendContainerPartOptions getContainerPart();

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebBackendComponentFactory getComponentFactory();

    WebBackendSplitContainerPanel getComponent();
}