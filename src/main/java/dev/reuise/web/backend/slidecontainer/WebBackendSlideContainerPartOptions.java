package dev.reuise.web.backend.slidecontainer;
import dev.reuise.core.State;
import dev.reuise.core.option.ComponentCreator;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.layout.WebBackendContainer;
import dev.reuise.web.backend.layout.WebBackendContainerOptions;
import dev.reuise.web.backend.layout.WebBackendContainerPartOptions;
import dev.reuise.web.core.slidecontainer.WebSlideContainerPartOptions;
public interface WebBackendSlideContainerPartOptions extends WebSlideContainerPartOptions {
    WebBackendContainerPartOptions getContainerPart();

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebBackendSlideContainerPartOptions setSlideAreaBeforeCreator(ComponentCreator<? extends WebBackendContainer, ? extends WebBackendContainerOptions> slideAreaBeforeCreator);

    WebBackendSlideContainerPartOptions setSlideAreaCreator(ComponentCreator<? extends WebBackendContainer, ? extends WebBackendContainerOptions> slideAreaCreator);

    WebBackendSlideContainerPartOptions setSlideAreaAfterCreator(ComponentCreator<? extends WebBackendContainer, ? extends WebBackendContainerOptions> slideAreaAfterCreator);

    WebBackendComponentFactory getComponentFactory();

    WebBackendSlideContainer getComponent();
}