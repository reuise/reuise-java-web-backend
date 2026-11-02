package dev.reuise.web.backend.text;
import dev.reuise.web.backend.WebBackendComponentOptions;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentOptions;
import dev.reuise.web.backend.basecomponent.WebBackendBaseComponentPartOptions;
import dev.reuise.web.core.text.WebLineBreakOptions;
// Todo: Clean up unneeded interfaces
public interface WebBackendLineBreakOptions extends WebLineBreakOptions , WebBackendBaseComponentPartOptions , WebBackendLineBreakPartOptions , WebBackendComponentOptions , WebBackendBaseComponentOptions {
    WebBackendBaseComponentPartOptions getBaseComponentPart();
}
