package dev.reuise.web.backend.list;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPart;
import dev.reuise.web.core.list.WebBasicListPart;
public interface WebBackendBasicListPart extends WebBasicListPart , WebBackendComponentPart , WebBackendParentComponentPart , WebBackendBasicListFeatures {
    WebBackendParentComponentPart getParentComponentPart();
}