package dev.reuise.web.backend.image;
import dev.reuise.core.State;
import dev.reuise.core.option.ComponentCreator;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentPartOptions;
import dev.reuise.web.backend.link.WebBackendLink;
import dev.reuise.web.backend.link.WebBackendLinkOptions;
import dev.reuise.web.core.image.WebImagePartOptions;
public interface WebBackendImagePartOptions extends WebImagePartOptions {
    WebBackendBaseComponentPartOptions getBaseComponentPart();

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebBackendImagePartOptions setLinkCreator(ComponentCreator<? extends WebBackendLink, ? extends WebBackendLinkOptions> linkCreator);

    WebBackendComponentFactory getComponentFactory();

    WebBackendImage getComponent();
}