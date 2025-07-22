package dev.reuise.web.backend.table;
import dev.reuise.core.State;
import dev.reuise.core.option.ComponentCreator;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.layout.WebBackendContainer;
import dev.reuise.web.backend.layout.WebBackendContainerOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPartOptions;
import dev.reuise.web.core.table.WebTablePartOptions;
public interface WebBackendTablePartOptions extends WebTablePartOptions {
    WebBackendParentComponentPartOptions getParentComponentPart();

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebBackendTablePartOptions setTableCreator(ComponentCreator<? extends WebBackendContainer, ? extends WebBackendContainerOptions> tableCreator);

    WebBackendTablePartOptions setColumnGroupCreator(ComponentCreator<? extends WebBackendTableColumnGroup, ? extends WebBackendTableColumnGroupOptions> columnGroupCreator);

    WebBackendTablePartOptions setHeaderCreator(ComponentCreator<? extends WebBackendTableHeader, ? extends WebBackendTableHeaderOptions> headerCreator);

    WebBackendTablePartOptions setBodyCreator(ComponentCreator<? extends WebBackendTableBody, ? extends WebBackendTableBodyOptions> bodyCreator);

    WebBackendTablePartOptions setFooterCreator(ComponentCreator<? extends WebBackendTableFooter, ? extends WebBackendTableFooterOptions> footerCreator);

    WebBackendComponentFactory getComponentFactory();

    WebBackendTable getComponent();
}