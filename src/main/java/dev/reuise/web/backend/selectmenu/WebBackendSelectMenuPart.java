package dev.reuise.web.backend.selectmenu;
import dev.reuise.core.input.TextFieldSize;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.input.WebBackendTextField;
import dev.reuise.web.backend.menu.WebBackendMenu;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPart;
import dev.reuise.web.core.selectmenu.WebSelectMenuPart;
// Placeholder here??
// Label here??
// Autocomplete here??
// ReadOnly here??
// Size here??
public interface WebBackendSelectMenuPart extends WebSelectMenuPart , WebBackendSelectMenuFeatures , WebBackendComponentPart , WebBackendParentComponentPart {
    String getPlaceholder();

    WebBackendSelectMenuPart setPlaceholder(String placeholder);

    String getLabel();

    WebBackendSelectMenuPart setLabel(String label);

    String getAutocomplete();

    WebBackendSelectMenuPart setAutocomplete(String autocomplete);

    boolean isReadOnly();

    WebBackendSelectMenuPart setReadOnly(Boolean readOnly);

    TextFieldSize getSize();

    WebBackendSelectMenuPart setSize(TextFieldSize size);

    WebBackendTextField getTextField();

    WebBackendMenu getMenu();

    WebBackendParentComponentPart getParentComponentPart();
}