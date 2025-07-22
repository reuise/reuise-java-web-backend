package dev.reuise.web.backend.progressindicator;
import dev.reuise.core.State;
import dev.reuise.core.option.ComponentCreator;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.layout.WebBackendContainer;
import dev.reuise.web.backend.layout.WebBackendContainerOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPartOptions;
import dev.reuise.web.core.progressindicator.WebProgressIndicatorPartOptions;
public interface WebBackendProgressIndicatorPartOptions extends WebProgressIndicatorPartOptions {
    WebBackendParentComponentPartOptions getParentComponentPart();

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebBackendProgressIndicatorPartOptions setTrackCreator(ComponentCreator<? extends WebBackendContainer, ? extends WebBackendContainerOptions> trackCreator);

    WebBackendComponentFactory getComponentFactory();

    WebBackendProgressIndicator getComponent();
}