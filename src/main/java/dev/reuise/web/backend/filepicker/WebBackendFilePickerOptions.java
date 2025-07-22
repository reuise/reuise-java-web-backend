package dev.reuise.web.backend.filepicker;
import dev.reuise.web.backend.WebBackendComponentOptions;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentOptions;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentPartOptions;
import dev.reuise.web.core.filepicker.WebFilePickerOptions;
// Todo: Clean up uneeded interfaces
public interface WebBackendFilePickerOptions extends WebBackendBaseComponentPartOptions , WebFilePickerOptions , WebBackendComponentOptions , WebBackendFilePickerPartOptions , WebBackendBaseComponentOptions {
    WebBackendBaseComponentPartOptions getBaseComponentPart();
}