package dev.reuise.web.backend.table;
import dev.reuise.core.State;
import dev.reuise.core.option.ComponentCreator;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.checkbox.WebBackendCheckbox;
import dev.reuise.web.backend.checkbox.WebBackendCheckboxOptions;
import dev.reuise.web.core.table.WebCheckboxTableColumnPartOptions;
// Checked here??
public interface WebBackendCheckboxTableColumnPartOptions extends WebCheckboxTableColumnPartOptions {
    WebBackendTableColumnPartOptions getTableColumnPart();

    boolean isChecked();

    WebBackendCheckboxTableColumnPartOptions setChecked(Boolean checked);

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebBackendCheckboxTableColumnPartOptions setCheckboxCreator(ComponentCreator<? extends WebBackendCheckbox, ? extends WebBackendCheckboxOptions> checkboxCreator);

    WebBackendComponentFactory getComponentFactory();

    WebBackendCheckboxTableColumn getComponent();
}