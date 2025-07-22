package dev.reuise.web.backend.chip;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.icon.WebBackendIcon;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPart;
import dev.reuise.web.backend.text.WebBackendLabel;
import dev.reuise.web.core.chip.WebChipPart;
public interface WebBackendChipPart extends WebBackendChipFeatures , WebBackendComponentPart , WebChipPart , WebBackendParentComponentPart {
    WebBackendIcon getStartIcon();

    WebBackendLabel getLabelContainer();

    WebBackendIcon getEndIcon();

    WebBackendParentComponentPart getParentComponentPart();
}