package dev.reuise.web.backend.table;
import dev.reuise.core.State;
import dev.reuise.core.option.ComponentCreator;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPartOptions;
import dev.reuise.web.core.table.WebTableHeaderPartOptions;
public interface WebBackendTableHeaderPartOptions extends WebTableHeaderPartOptions {
    WebBackendParentComponentPartOptions getParentComponentPart();

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebBackendTableHeaderPartOptions setRowCreator(ComponentCreator<? extends WebBackendTableHeaderRow, ? extends WebBackendTableHeaderRowOptions> rowCreator);

    WebBackendComponentFactory getComponentFactory();

    WebBackendTableHeader getComponent();
}