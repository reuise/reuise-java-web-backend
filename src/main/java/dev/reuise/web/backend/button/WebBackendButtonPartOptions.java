package dev.reuise.web.backend.button;
import dev.reuise.core.State;
import dev.reuise.core.option.ComponentCreator;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.icon.WebBackendIcon;
import dev.reuise.web.backend.icon.WebBackendIconOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPartOptions;
import dev.reuise.web.backend.text.WebBackendInlineText;
import dev.reuise.web.backend.text.WebBackendInlineTextOptions;
import dev.reuise.web.core.button.WebButtonPartOptions;
public interface WebBackendButtonPartOptions extends WebButtonPartOptions {
    WebBackendParentComponentPartOptions getParentComponentPart();

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebBackendButtonPartOptions setStartIconCreator(ComponentCreator<? extends WebBackendIcon, ? extends WebBackendIconOptions> startIconCreator);

    WebBackendButtonPartOptions setLabelContainerCreator(ComponentCreator<? extends WebBackendInlineText, ? extends WebBackendInlineTextOptions> labelContainerCreator);

    WebBackendButtonPartOptions setEndIconCreator(ComponentCreator<? extends WebBackendIcon, ? extends WebBackendIconOptions> endIconCreator);

    WebBackendComponentFactory getComponentFactory();

    WebBackendButton getComponent();
}