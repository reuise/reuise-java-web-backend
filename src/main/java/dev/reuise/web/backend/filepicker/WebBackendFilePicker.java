package dev.reuise.web.backend.filepicker;
import dev.reuise.web.backend.WebBackendComponent;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponent;
import dev.reuise.web.core.filepicker.WebFilePicker;
public interface WebBackendFilePicker extends WebBackendFilePickerPart , WebFilePicker , WebBackendBaseComponent , WebBackendComponent {
    WebBackendFilePicker getComponent();
}