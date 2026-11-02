package dev.reuise.web.backend;

import dev.reuise.core.RootComponent;

/**
 * Thread-bound "current root component" (the Document being built) for server-side rendering.
 * Concurrent requests run on different threads, so each sees only its own Document. A view opens a scope
 * before it constructs its Document and closes it in a finally block; closing restores the root that was
 * current when the scope opened (nested render) or removes the binding when there was none (pooled
 * threads do not retain a finished request's Document).
 */
public final class WebBackendRootScope implements AutoCloseable {
    private static final ThreadLocal<RootComponent> CURRENT = new ThreadLocal<>();

    private final RootComponent previous;
    private boolean closed;

    private WebBackendRootScope(RootComponent previous) {
        this.previous = previous;
    }

    public static WebBackendRootScope open() {
        return new WebBackendRootScope(CURRENT.get());
    }

    public static RootComponent get() {
        return CURRENT.get();
    }

    public static void set(RootComponent rootComponent) {
        CURRENT.set(rootComponent);
    }

    @Override
    public void close() {
        if (closed)
            return;

        closed = true;
        if (previous == null)
            CURRENT.remove();
        else
            CURRENT.set(previous);
    }
}
