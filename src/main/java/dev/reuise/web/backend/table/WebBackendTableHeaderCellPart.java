package dev.reuise.web.backend.table;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.button.WebBackendIconButton;
import dev.reuise.web.backend.menu.WebBackendMenu;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPart;
import dev.reuise.web.backend.text.WebBackendInlineText;
import dev.reuise.web.core.table.WebTableHeaderCellPart;
public interface WebBackendTableHeaderCellPart extends WebBackendTableHeaderCellFeatures , WebTableHeaderCellPart , WebBackendComponentPart , WebBackendParentComponentPart {
    WebBackendInlineText getLabelContainer();

    WebBackendMenu getMenu();

    WebBackendIconButton getMenuButton();

    WebBackendParentComponentPart getParentComponentPart();
}