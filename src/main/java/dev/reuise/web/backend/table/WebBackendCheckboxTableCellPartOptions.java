package dev.reuise.web.backend.table;
import dev.reuise.core.State;
import dev.reuise.core.option.ComponentCreator;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.checkbox.WebBackendCheckbox;
import dev.reuise.web.backend.checkbox.WebBackendCheckboxOptions;
import dev.reuise.web.core.table.WebCheckboxTableCellPartOptions;
public interface WebBackendCheckboxTableCellPartOptions extends WebCheckboxTableCellPartOptions {
    WebBackendTableCellPartOptions getTableCellPart();

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebBackendCheckboxTableCellPartOptions setCheckboxCreator(ComponentCreator<? extends WebBackendCheckbox, ? extends WebBackendCheckboxOptions> checkboxCreator);

    WebBackendComponentFactory getComponentFactory();

    WebBackendCheckboxTableCell getComponent();
}