package dev.reuise.web.backend.basecomponent;
import dev.reuise.core.State;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.core.basecomponent.WebBaseComponentPartOptions;
public interface WebBackendBaseComponentPartOptions extends WebBaseComponentPartOptions {
    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebBackendComponentFactory getComponentFactory();

    WebBackendBaseComponent getComponent();
}