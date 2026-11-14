package dev.reuise.web.backend.menu;
import dev.reuise.core.State;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.button.WebBackendButtonPartOptions;
import dev.reuise.web.core.menu.WebMenuButtonItemPartOptions;
public interface WebBackendMenuButtonItemPartOptions extends WebMenuButtonItemPartOptions {
    WebBackendButtonPartOptions getButtonPart();

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebBackendComponentFactory getComponentFactory();

    WebBackendMenuButtonItem getComponent();
}
