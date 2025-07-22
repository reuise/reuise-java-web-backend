package dev.reuise.web.backend.bottomappbar;
import dev.reuise.core.State;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentPartOptions;
import dev.reuise.web.core.bottomappbar.WebBottomAppBarPartOptions;
public interface WebBackendBottomAppBarPartOptions extends WebBottomAppBarPartOptions {
    WebBackendBaseComponentPartOptions getBaseComponentPart();

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebBackendComponentFactory getComponentFactory();

    WebBackendBottomAppBar getComponent();
}