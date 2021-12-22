package dev.reuise.web.backend.button;
/**
 * A Button bla bla. For use with web backend.
 */
public class Button {
    private final ButtonFoundation foundation;

    /**
     * Creates a new button.
     */
    public Button(ButtonOptions options) {
        this.foundation = new ButtonFoundation(new ButtonAdapter(options), options);
    }

    /**
     * Creates options to be passed to a new button.
     */
    public static ButtonOptions newOptions() {
        return new ButtonOptions();
    }
}