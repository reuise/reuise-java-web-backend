package dev.reuise.web.backend.menu;
import dev.reuise.core.State;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.core.menu.WebMenuDividerPartOptions;
public interface WebBackendMenuDividerPartOptions extends WebMenuDividerPartOptions {
    WebBackendMenuItemPartOptions getMenuItemPart();

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebBackendComponentFactory getComponentFactory();

    WebBackendMenuDivider getComponent();
}