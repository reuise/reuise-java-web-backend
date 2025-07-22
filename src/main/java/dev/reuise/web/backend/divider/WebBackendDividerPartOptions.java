package dev.reuise.web.backend.divider;
import dev.reuise.core.State;
import dev.reuise.core.option.ComponentCreator;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.layout.WebBackendContainer;
import dev.reuise.web.backend.layout.WebBackendContainerOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPartOptions;
import dev.reuise.web.backend.text.WebBackendInlineText;
import dev.reuise.web.backend.text.WebBackendInlineTextOptions;
import dev.reuise.web.core.divider.WebDividerPartOptions;
public interface WebBackendDividerPartOptions extends WebDividerPartOptions {
    WebBackendParentComponentPartOptions getParentComponentPart();

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebBackendDividerPartOptions setStartLineCreator(ComponentCreator<? extends WebBackendContainer, ? extends WebBackendContainerOptions> startLineCreator);

    WebBackendDividerPartOptions setLabelContainerCreator(ComponentCreator<? extends WebBackendInlineText, ? extends WebBackendInlineTextOptions> labelContainerCreator);

    WebBackendDividerPartOptions setEndLineCreator(ComponentCreator<? extends WebBackendContainer, ? extends WebBackendContainerOptions> endLineCreator);

    WebBackendComponentFactory getComponentFactory();

    WebBackendDivider getComponent();
}