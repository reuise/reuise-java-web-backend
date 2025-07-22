package dev.reuise.web.backend.filepicker;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentPart;
import dev.reuise.web.core.filepicker.WebFilePickerPart;
public interface WebBackendFilePickerPart extends WebFilePickerPart , WebBackendFilePickerFeatures , WebBackendComponentPart , WebBackendBaseComponentPart {
    WebBackendBaseComponentPart getBaseComponentPart();
}