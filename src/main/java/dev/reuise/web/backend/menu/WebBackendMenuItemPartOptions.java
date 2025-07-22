package dev.reuise.web.backend.menu;
import dev.reuise.core.State;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.list.WebBackendListItemPartOptions;
import dev.reuise.web.core.menu.WebMenuItemPartOptions;
public interface WebBackendMenuItemPartOptions extends WebMenuItemPartOptions {
    WebBackendListItemPartOptions getListItemPart();

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebBackendComponentFactory getComponentFactory();

    WebBackendMenuItem getComponent();
}