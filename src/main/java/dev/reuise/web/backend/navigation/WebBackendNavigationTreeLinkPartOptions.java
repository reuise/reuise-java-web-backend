package dev.reuise.web.backend.navigation;
import dev.reuise.core.State;
import dev.reuise.core.option.ComponentCreator;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.link.WebBackendNavigationLinkPartOptions;
import dev.reuise.web.backend.list.WebBackendListItem;
import dev.reuise.web.backend.list.WebBackendListItemOptions;
import dev.reuise.web.core.navigation.WebNavigationTreeLinkPartOptions;
public interface WebBackendNavigationTreeLinkPartOptions extends WebNavigationTreeLinkPartOptions {
    WebBackendNavigationLinkPartOptions getNavigationLinkPart();

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebBackendNavigationTreeLinkPartOptions setItemCreator(ComponentCreator<? extends WebBackendListItem, ? extends WebBackendListItemOptions> itemCreator);

    WebBackendComponentFactory getComponentFactory();

    WebBackendNavigationTreeLink getComponent();
}
