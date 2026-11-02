package dev.reuise.web.backend.style;
import java.util.HashMap;
import java.util.Map;

/**
 * Lets structurally-identical component styles share a single generated CSS class and a single
 * emitted &lt;style&gt; element instead of every component instance minting its own random class
 * and repeating the same CSS text.
 *
 * <p>The registry is scoped per rendered document/request: {@link #reset()} must be called once
 * at the start of rendering a page (see {@code DefaultWebBackendDocument.writeTo}) so dedup never
 * leaks state across unrelated requests, and each thread gets its own map so concurrent
 * server-side renders don't interfere with each other.</p>
 */
public final class StyleDeduplicationRegistry {
    private static final ThreadLocal<Map<String, String>> REGISTRY = ThreadLocal.withInitial(HashMap::new);

    private StyleDeduplicationRegistry() {
    }

    /**
     * Clears any entries recorded for the current thread. Call once per rendered document, before
     * any component is written.
     */
    public static void reset() {
        REGISTRY.get().clear();
    }

    /**
     * Returns the CSS class name already registered for this exact style content on the current
     * page render, or {@code null} if this content hasn't been seen yet.
     */
    public static String lookup(String contentKey) {
        if (contentKey == null)
            return null;

        return REGISTRY.get().get(contentKey);
    }

    /**
     * Records that {@code contentKey} is now rendered under {@code styleClass}, so later
     * components with the same content can reuse it instead of emitting their own
     * &lt;style&gt; element.
     */
    public static void register(String contentKey, String styleClass) {
        if ((contentKey == null) || (styleClass == null))
            return;

        REGISTRY.get().put(contentKey, styleClass);
    }
}
