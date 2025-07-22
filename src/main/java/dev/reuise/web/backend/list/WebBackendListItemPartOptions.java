package dev.reuise.web.backend.list;
import dev.reuise.core.State;
import dev.reuise.core.option.ComponentCreator;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.checkbox.WebBackendCheckbox;
import dev.reuise.web.backend.checkbox.WebBackendCheckboxOptions;
import dev.reuise.web.backend.icon.WebBackendIcon;
import dev.reuise.web.backend.icon.WebBackendIconOptions;
import dev.reuise.web.backend.layout.WebBackendContainer;
import dev.reuise.web.backend.layout.WebBackendContainerOptions;
import dev.reuise.web.backend.text.WebBackendInlineText;
import dev.reuise.web.backend.text.WebBackendInlineTextOptions;
import dev.reuise.web.core.list.WebListItemPartOptions;
public interface WebBackendListItemPartOptions extends WebListItemPartOptions {
    WebBackendBasicListItemPartOptions getBasicListItemPart();

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebBackendListItemPartOptions setCheckboxCreator(ComponentCreator<? extends WebBackendCheckbox, ? extends WebBackendCheckboxOptions> checkboxCreator);

    WebBackendListItemPartOptions setStartIconCreator(ComponentCreator<? extends WebBackendIcon, ? extends WebBackendIconOptions> startIconCreator);

    WebBackendListItemPartOptions setTextContainerCreator(ComponentCreator<? extends WebBackendContainer, ? extends WebBackendContainerOptions> textContainerCreator);

    WebBackendListItemPartOptions setLabelContainerCreator(ComponentCreator<? extends WebBackendInlineText, ? extends WebBackendInlineTextOptions> labelContainerCreator);

    WebBackendListItemPartOptions setSecondaryLabelContainerCreator(ComponentCreator<? extends WebBackendInlineText, ? extends WebBackendInlineTextOptions> secondaryLabelContainerCreator);

    WebBackendListItemPartOptions setEndIconCreator(ComponentCreator<? extends WebBackendIcon, ? extends WebBackendIconOptions> endIconCreator);

    WebBackendComponentFactory getComponentFactory();

    WebBackendListItem getComponent();
}