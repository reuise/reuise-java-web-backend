package dev.reuise.web.backend.menu;
import dev.reuise.core.State;
import dev.reuise.core.option.ComponentCreator;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.list.WebBackendListView;
import dev.reuise.web.backend.list.WebBackendListViewOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPartOptions;
import dev.reuise.web.core.menu.WebMenuPartOptions;
public interface WebBackendMenuPartOptions extends WebMenuPartOptions {
    WebBackendParentComponentPartOptions getParentComponentPart();

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebBackendMenuPartOptions setListCreator(ComponentCreator<? extends WebBackendListView, ? extends WebBackendListViewOptions> listCreator);

    WebBackendComponentFactory getComponentFactory();

    WebBackendMenu getComponent();
}