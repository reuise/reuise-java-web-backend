package dev.reuise.web.backend.basecomponent;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.web.core.basecomponent.AbstractWebBaseComponentOptions;
import java.util.ArrayList;
import java.util.Arrays;
public abstract class AbstractWebBackendBaseComponentOptions<S extends AbstractWebBackendBaseComponentOptions<S>> extends AbstractWebBaseComponentOptions<S> implements WebBackendBaseComponentOptions {
    protected AbstractWebBackendBaseComponentOptions() {
    }

    public <O extends CoreComponentOptions> void initialize(O options) {
        super.initialize(options);
    }

    public boolean onPreInitialize() {
        if (!super.onPreInitialize())
            return false;

        setStoreInElementOptions(new ArrayList(Arrays.asList("debug", "debugId")));
        return true;
    }

    public void onInitialize() {
        super.onInitialize();
    }

    public WebBackendBaseComponent getComponent() {
        return ((WebBackendBaseComponent) (super.getComponent()));
    }

    public void setComponent(WebBackendBaseComponent component) {
    }
}