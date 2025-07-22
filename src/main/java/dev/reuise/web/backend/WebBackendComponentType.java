package dev.reuise.web.backend;
import dev.reuise.web.core.WebComponentType;
public interface WebBackendComponentType<C extends WebBackendComponent, O extends WebBackendComponentOptions> extends WebBackendComponentPart , WebBackendComponent , WebComponentType<C, O> {}