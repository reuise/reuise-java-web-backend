package dev.reuise.web.backend.applayout;
import dev.reuise.core.State;
import dev.reuise.core.option.ComponentCreator;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.layout.WebBackendContainer;
import dev.reuise.web.backend.layout.WebBackendContainerOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPartOptions;
import dev.reuise.web.backend.splitcontainer.WebBackendSplitContainer;
import dev.reuise.web.backend.splitcontainer.WebBackendSplitContainerOptions;
import dev.reuise.web.core.applayout.WebAppLayoutPartOptions;
public interface WebBackendAppLayoutPartOptions extends WebAppLayoutPartOptions {
    WebBackendParentComponentPartOptions getParentComponentPart();

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebBackendAppLayoutPartOptions setDrawerScrimCreator(ComponentCreator<? extends WebBackendContainer, ? extends WebBackendContainerOptions> drawerScrimCreator);

    WebBackendAppLayoutPartOptions setDrawerSplitCreator(ComponentCreator<? extends WebBackendSplitContainer, ? extends WebBackendSplitContainerOptions> drawerSplitCreator);

    WebBackendAppLayoutPartOptions setTopAppBarSplitCreator(ComponentCreator<? extends WebBackendSplitContainer, ? extends WebBackendSplitContainerOptions> topAppBarSplitCreator);

    WebBackendAppLayoutPartOptions setBodyCreator(ComponentCreator<? extends WebBackendAppLayoutBody, ? extends WebBackendAppLayoutBodyOptions> bodyCreator);

    WebBackendComponentFactory getComponentFactory();

    WebBackendAppLayout getComponent();
}