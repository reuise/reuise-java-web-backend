package dev.reuise.web.backend.skeleton;
import dev.reuise.web.backend.WebBackendComponent;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponent;
import dev.reuise.web.core.skeleton.WebSkeleton;
public interface WebBackendSkeleton extends WebBackendBaseComponent , WebBackendComponent , WebSkeleton , WebBackendSkeletonPart {
    WebBackendSkeleton getComponent();
}