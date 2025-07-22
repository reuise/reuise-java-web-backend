package dev.reuise.web.backend.list;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPart;
import dev.reuise.web.core.list.WebListViewPart;
public interface WebBackendListViewPart extends WebListViewPart , WebBackendComponentPart , WebBackendParentComponentPart , WebBackendListViewFeatures {
    WebBackendParentComponentPart getParentComponentPart();
}