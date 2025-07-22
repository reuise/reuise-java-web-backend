package dev.reuise.web.backend.selectmenu;
import dev.reuise.core.State;
import dev.reuise.core.input.TextFieldSize;
import dev.reuise.core.option.ComponentCreator;
import dev.reuise.web.backend.WebBackendComponentFactory;
import dev.reuise.web.backend.input.WebBackendTextField;
import dev.reuise.web.backend.input.WebBackendTextFieldOptions;
import dev.reuise.web.backend.menu.WebBackendMenu;
import dev.reuise.web.backend.menu.WebBackendMenuOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPartOptions;
import dev.reuise.web.core.selectmenu.WebSelectMenuPartOptions;
// Placeholder here??
// Label here??
// Autocomplete here??
// ReadOnly here??
// Size here??
public interface WebBackendSelectMenuPartOptions extends WebSelectMenuPartOptions {
    WebBackendParentComponentPartOptions getParentComponentPart();

    String getPlaceholder();

    WebBackendSelectMenuPartOptions setPlaceholder(String placeholder);

    String getLabel();

    WebBackendSelectMenuPartOptions setLabel(String label);

    String getAutocomplete();

    WebBackendSelectMenuPartOptions setAutocomplete(String autocomplete);

    boolean isReadOnly();

    WebBackendSelectMenuPartOptions setReadOnly(Boolean readOnly);

    TextFieldSize getSize();

    WebBackendSelectMenuPartOptions setSize(TextFieldSize size);

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebBackendSelectMenuPartOptions setTextFieldCreator(ComponentCreator<? extends WebBackendTextField, ? extends WebBackendTextFieldOptions> textFieldCreator);

    WebBackendSelectMenuPartOptions setMenuCreator(ComponentCreator<? extends WebBackendMenu, ? extends WebBackendMenuOptions> menuCreator);

    WebBackendComponentFactory getComponentFactory();

    WebBackendSelectMenu getComponent();
}