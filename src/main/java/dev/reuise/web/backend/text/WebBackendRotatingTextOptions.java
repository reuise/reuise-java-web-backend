package dev.reuise.web.backend.text;
import dev.reuise.web.backend.WebBackendComponentOptions;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentOptions;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentPartOptions;
import dev.reuise.web.core.text.WebRotatingTextOptions;
// Todo: Clean up unneeded interfaces
public interface WebBackendRotatingTextOptions extends WebBackendBaseComponentPartOptions , WebBackendComponentOptions , WebRotatingTextOptions , WebBackendRotatingTextPartOptions , WebBackendBaseComponentOptions {
    WebBackendBaseComponentPartOptions getBaseComponentPart();
}
