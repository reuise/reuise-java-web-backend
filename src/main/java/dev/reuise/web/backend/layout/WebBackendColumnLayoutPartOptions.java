package dev.reuise.web.backend.layout;
import dev.reuise.core.State;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.core.layout.WebColumnLayoutPartOptions;
public interface WebBackendColumnLayoutPartOptions extends WebColumnLayoutPartOptions {
    WebBackendFlexContainerPartOptions getFlexContainerPart();

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebBackendComponentFactory getComponentFactory();

    WebBackendColumnLayout getComponent();
}