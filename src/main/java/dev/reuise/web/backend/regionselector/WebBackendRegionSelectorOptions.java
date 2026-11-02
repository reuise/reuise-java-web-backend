package dev.reuise.web.backend.regionselector;
import dev.reuise.web.backend.WebBackendComponentOptions;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentPartOptions;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPartOptions;
import dev.reuise.web.backend.selectmenu.WebBackendSelectMenuOptions;
import dev.reuise.web.backend.selectmenu.WebBackendSelectMenuPartOptions;
import dev.reuise.web.core.regionselector.WebRegionSelectorOptions;
// Todo: Clean up unneeded interfaces
public interface WebBackendRegionSelectorOptions extends WebRegionSelectorOptions , WebBackendBaseComponentPartOptions , WebBackendSelectMenuOptions , WebBackendComponentOptions , WebBackendParentComponentPartOptions , WebBackendSelectMenuPartOptions , WebBackendRegionSelectorPartOptions {
    WebBackendSelectMenuPartOptions getSelectMenuPart();

    WebBackendParentComponentPartOptions getParentComponentPart();

    WebBackendBaseComponentPartOptions getBaseComponentPart();
}
