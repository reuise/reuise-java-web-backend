package dev.reuise.web.backend.applayout;
import dev.reuise.core.State;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.layout.WebBackendFlexContainerPartOptions;
import dev.reuise.web.core.applayout.WebAppLayoutBodyPartOptions;
public interface WebBackendAppLayoutBodyPartOptions extends WebAppLayoutBodyPartOptions {
    WebBackendFlexContainerPartOptions getFlexContainerPart();

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebBackendComponentFactory getComponentFactory();

    WebBackendAppLayoutBody getComponent();
}