package dev.reuise.web.backend.skeleton;
import dev.reuise.web.backend.WebBackendComponentPart;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentPart;
import dev.reuise.web.core.skeleton.WebSkeletonPart;
public interface WebBackendSkeletonPart extends WebBackendSkeletonFeatures , WebBackendComponentPart , WebBackendBaseComponentPart , WebSkeletonPart {
    WebBackendBaseComponentPart getBaseComponentPart();
}