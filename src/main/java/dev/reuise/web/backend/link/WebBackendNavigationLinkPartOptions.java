package dev.reuise.web.backend.link;
import dev.reuise.core.State;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.core.link.WebNavigationLinkPartOptions;
public interface WebBackendNavigationLinkPartOptions extends WebNavigationLinkPartOptions {
    WebBackendLinkPartOptions getLinkPart();

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebBackendComponentFactory getComponentFactory();

    WebBackendNavigationLink getComponent();
}