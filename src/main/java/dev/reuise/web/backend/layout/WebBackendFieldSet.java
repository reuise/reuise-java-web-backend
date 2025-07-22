package dev.reuise.web.backend.layout;
import dev.reuise.web.backend.WebBackendComponent;
import dev.reuise.web.core.layout.WebFieldSet;
public interface WebBackendFieldSet extends WebFieldSet , WebBackendFieldSetPart , WebBackendComponent , WebBackendContainer {
    WebBackendFieldSet getComponent();
}