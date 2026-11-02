package dev.reuise.web.backend.regionselector;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.selectmenu.WebBackendSelectMenuPart;
import dev.reuise.web.core.regionselector.WebRegionSelectorPart;
public interface WebBackendRegionSelectorPart extends WebBackendSelectMenuPart , WebBackendRegionSelectorFeatures , WebBackendComponentPart , WebRegionSelectorPart {
    WebBackendSelectMenuPart getSelectMenuPart();
}
