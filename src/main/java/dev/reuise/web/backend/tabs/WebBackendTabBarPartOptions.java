package dev.reuise.web.backend.tabs;
import dev.reuise.core.State;
import dev.reuise.core.option.ComponentCreator;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.layout.WebBackendContainer;
import dev.reuise.web.backend.layout.WebBackendContainerOptions;
import dev.reuise.web.backend.layout.WebBackendContainerPartOptions;
import dev.reuise.web.core.tabs.WebTabBarPartOptions;
public interface WebBackendTabBarPartOptions extends WebTabBarPartOptions {
    WebBackendContainerPartOptions getContainerPart();

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebBackendTabBarPartOptions setContainerCreator(ComponentCreator<? extends WebBackendContainer, ? extends WebBackendContainerOptions> containerCreator);

    WebBackendTabBarPartOptions setActiveIndicatorCreator(ComponentCreator<? extends WebBackendContainer, ? extends WebBackendContainerOptions> activeIndicatorCreator);

    WebBackendComponentFactory getComponentFactory();

    WebBackendTabBar getComponent();
}