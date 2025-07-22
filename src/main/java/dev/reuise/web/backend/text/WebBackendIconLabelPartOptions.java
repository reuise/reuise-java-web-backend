package dev.reuise.web.backend.text;
import dev.reuise.core.State;
import dev.reuise.core.option.ComponentCreator;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.icon.WebBackendIcon;
import dev.reuise.web.backend.icon.WebBackendIconOptions;
import dev.reuise.web.backend.link.WebBackendLink;
import dev.reuise.web.backend.link.WebBackendLinkOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPartOptions;
import dev.reuise.web.core.text.WebIconLabelPartOptions;
public interface WebBackendIconLabelPartOptions extends WebIconLabelPartOptions {
    WebBackendParentComponentPartOptions getParentComponentPart();

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebBackendIconLabelPartOptions setLinkCreator(ComponentCreator<? extends WebBackendLink, ? extends WebBackendLinkOptions> linkCreator);

    WebBackendIconLabelPartOptions setStartIconCreator(ComponentCreator<? extends WebBackendIcon, ? extends WebBackendIconOptions> startIconCreator);

    WebBackendIconLabelPartOptions setLabelContainerCreator(ComponentCreator<? extends WebBackendInlineText, ? extends WebBackendInlineTextOptions> labelContainerCreator);

    WebBackendIconLabelPartOptions setEndIconCreator(ComponentCreator<? extends WebBackendIcon, ? extends WebBackendIconOptions> endIconCreator);

    WebBackendComponentFactory getComponentFactory();

    WebBackendIconLabel getComponent();
}