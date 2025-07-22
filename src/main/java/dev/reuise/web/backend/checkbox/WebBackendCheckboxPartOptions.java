package dev.reuise.web.backend.checkbox;
import dev.reuise.core.State;
import dev.reuise.core.checkbox.CheckboxSize;
import dev.reuise.core.option.ComponentCreator;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPartOptions;
import dev.reuise.web.backend.text.WebBackendLabel;
import dev.reuise.web.backend.text.WebBackendLabelOptions;
import dev.reuise.web.core.checkbox.WebCheckboxPartOptions;
// Size here??
public interface WebBackendCheckboxPartOptions extends WebCheckboxPartOptions {
    WebBackendParentComponentPartOptions getParentComponentPart();

    CheckboxSize getSize();

    WebBackendCheckboxPartOptions setSize(CheckboxSize size);

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebBackendCheckboxPartOptions setCheckboxCreator(ComponentCreator<? extends WebBackendBasicCheckbox, ? extends WebBackendBasicCheckboxOptions> checkboxCreator);

    WebBackendCheckboxPartOptions setLabelContainerCreator(ComponentCreator<? extends WebBackendLabel, ? extends WebBackendLabelOptions> labelContainerCreator);

    WebBackendComponentFactory getComponentFactory();

    WebBackendCheckbox getComponent();
}