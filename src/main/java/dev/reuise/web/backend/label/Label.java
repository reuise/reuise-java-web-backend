package dev.reuise.web.backend.label;
/**
 * A Label bla bla. For use with web backend.
 */
public class Label {
    private final LabelFoundation foundation;

    /**
     * Creates a new label.
     */
    public Label(LabelOptions options) {
        this.foundation = new LabelFoundation(new LabelAdapter(options), options);
    }

    /**
     * Creates options to be passed to a new label.
     */
    public static LabelOptions newOptions() {
        return new LabelOptions();
    }
}