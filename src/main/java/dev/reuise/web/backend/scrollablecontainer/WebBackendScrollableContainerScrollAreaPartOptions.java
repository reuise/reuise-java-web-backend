package dev.reuise.web.backend.scrollablecontainer;
import dev.reuise.core.State;
import dev.reuise.core.option.ComponentCreator;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.layout.WebBackendContainer;
import dev.reuise.web.backend.layout.WebBackendContainerOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPartOptions;
import dev.reuise.web.core.scrollablecontainer.WebScrollableContainerScrollAreaPartOptions;
public interface WebBackendScrollableContainerScrollAreaPartOptions extends WebScrollableContainerScrollAreaPartOptions {
    WebBackendParentComponentPartOptions getParentComponentPart();

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebBackendScrollableContainerScrollAreaPartOptions setScrollAreaTopFadeCreator(ComponentCreator<? extends WebBackendContainer, ? extends WebBackendContainerOptions> scrollAreaTopFadeCreator);

    WebBackendScrollableContainerScrollAreaPartOptions setScrollAreaLeftFadeCreator(ComponentCreator<? extends WebBackendContainer, ? extends WebBackendContainerOptions> scrollAreaLeftFadeCreator);

    WebBackendScrollableContainerScrollAreaPartOptions setScrollAreaContentCreator(ComponentCreator<? extends WebBackendContainer, ? extends WebBackendContainerOptions> scrollAreaContentCreator);

    WebBackendScrollableContainerScrollAreaPartOptions setScrollAreaBottomFadeCreator(ComponentCreator<? extends WebBackendContainer, ? extends WebBackendContainerOptions> scrollAreaBottomFadeCreator);

    WebBackendScrollableContainerScrollAreaPartOptions setScrollAreaRightFadeCreator(ComponentCreator<? extends WebBackendContainer, ? extends WebBackendContainerOptions> scrollAreaRightFadeCreator);

    WebBackendComponentFactory getComponentFactory();

    WebBackendScrollableContainerScrollArea getComponent();
}