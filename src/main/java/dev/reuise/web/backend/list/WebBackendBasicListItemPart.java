package dev.reuise.web.backend.list;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.link.WebBackendLink;
import dev.reuise.web.backend.parentcomponent.WebBackendParentComponentPart;
import dev.reuise.web.core.list.WebBasicListItemPart;
public interface WebBackendBasicListItemPart extends WebBackendBasicListItemFeatures , WebBackendComponentPart , WebBasicListItemPart , WebBackendParentComponentPart {
    WebBackendLink getLink();

    WebBackendParentComponentPart getParentComponentPart();
}