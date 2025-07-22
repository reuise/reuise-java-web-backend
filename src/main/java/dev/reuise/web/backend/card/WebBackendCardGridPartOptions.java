package dev.reuise.web.backend.card;
import dev.reuise.core.State;
import dev.reuise.core.option.ComponentCreator;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.layout.WebBackendContainer;
import dev.reuise.web.backend.layout.WebBackendContainerOptions;
import dev.reuise.web.backend.layout.WebBackendContainerPartOptions;
import dev.reuise.web.core.card.WebCardGridPartOptions;
public interface WebBackendCardGridPartOptions extends WebCardGridPartOptions {
    WebBackendContainerPartOptions getContainerPart();

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebBackendCardGridPartOptions setScrimCreator(ComponentCreator<? extends WebBackendContainer, ? extends WebBackendContainerOptions> scrimCreator);

    WebBackendCardGridPartOptions setCardContainerCreator(ComponentCreator<? extends WebBackendContainer, ? extends WebBackendContainerOptions> cardContainerCreator);

    WebBackendComponentFactory getComponentFactory();

    WebBackendCardGrid getComponent();
}