package dev.reuise.web.backend.table;
import dev.reuise.core.State;
import dev.reuise.core.option.ComponentCreator;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.button.WebBackendIconButton;
import dev.reuise.web.backend.button.WebBackendIconButtonOptions;
import dev.reuise.web.backend.menu.WebBackendMenu;
import dev.reuise.web.backend.menu.WebBackendMenuOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPartOptions;
import dev.reuise.web.backend.text.WebBackendInlineText;
import dev.reuise.web.backend.text.WebBackendInlineTextOptions;
import dev.reuise.web.core.table.WebTableHeaderCellPartOptions;
public interface WebBackendTableHeaderCellPartOptions extends WebTableHeaderCellPartOptions {
    WebBackendParentComponentPartOptions getParentComponentPart();

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebBackendTableHeaderCellPartOptions setLabelContainerCreator(ComponentCreator<? extends WebBackendInlineText, ? extends WebBackendInlineTextOptions> labelContainerCreator);

    WebBackendTableHeaderCellPartOptions setMenuCreator(ComponentCreator<? extends WebBackendMenu, ? extends WebBackendMenuOptions> menuCreator);

    WebBackendTableHeaderCellPartOptions setMenuButtonCreator(ComponentCreator<? extends WebBackendIconButton, ? extends WebBackendIconButtonOptions> menuButtonCreator);

    WebBackendComponentFactory getComponentFactory();

    WebBackendTableHeaderCell getComponent();
}