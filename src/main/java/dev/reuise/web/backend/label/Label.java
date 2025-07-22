package dev.reuise.web.backend.label;
/**
 * A Label bla bla. For use with web backend.
 */
public final class Label extends WebBackendLabelImpl<Label, LabelAdapter> {
    /**
     * Options for Label. For use with web backend.
     */
    public static class Options extends WebBackendLabelImpl.Options<Options> {
        @Override
        protected Options self() {
            return this;
        }
    }

    /**
     * Creates a new label.
     */
    public Label(Options options) {
        super(new LabelAdapter(options), options);
    }

    /**
     * Creates options to be passed to a new label.
     */
    public static Options newOptions() {
        return new Options();
    }

    @Override
    protected Label self() {
        return this;
    }
}