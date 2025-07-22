package dev.reuise.web.backend.skeleton;
import dev.reuise.web.backend.WebBackendComponentOptions;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentOptions;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentPartOptions;
import dev.reuise.web.core.skeleton.WebSkeletonOptions;
// Todo: Clean up uneeded interfaces
public interface WebBackendSkeletonOptions extends WebBackendSkeletonPartOptions , WebBackendBaseComponentPartOptions , WebBackendComponentOptions , WebSkeletonOptions , WebBackendBaseComponentOptions {
    WebBackendBaseComponentPartOptions getBaseComponentPart();
}