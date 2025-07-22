package dev.reuise.web.backend.layout;
import dev.reuise.core.State;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.core.layout.WebFlexContainerPartOptions;
public interface WebBackendFlexContainerPartOptions extends WebFlexContainerPartOptions {
    WebBackendContainerPartOptions getContainerPart();

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebBackendComponentFactory getComponentFactory();

    WebBackendFlexContainer getComponent();
}