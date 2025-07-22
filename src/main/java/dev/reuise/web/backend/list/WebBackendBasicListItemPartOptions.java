package dev.reuise.web.backend.list;
import dev.reuise.core.State;
import dev.reuise.core.option.ComponentCreator;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.link.WebBackendLink;
import dev.reuise.web.backend.link.WebBackendLinkOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPartOptions;
import dev.reuise.web.core.list.WebBasicListItemPartOptions;
public interface WebBackendBasicListItemPartOptions extends WebBasicListItemPartOptions {
    WebBackendParentComponentPartOptions getParentComponentPart();

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebBackendBasicListItemPartOptions setLinkCreator(ComponentCreator<? extends WebBackendLink, ? extends WebBackendLinkOptions> linkCreator);

    WebBackendComponentFactory getComponentFactory();

    WebBackendBasicListItem getComponent();
}