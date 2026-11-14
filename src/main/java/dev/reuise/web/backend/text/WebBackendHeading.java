package dev.reuise.web.backend.text;
import dev.reuise.core.ComponentAnimation;
import dev.reuise.web.backend.WebBackendComponent;
import dev.reuise.web.core.text.WebHeading;
public interface WebBackendHeading extends WebHeading , WebBackendText , WebBackendComponent , WebBackendHeadingPart {
    WebBackendHeading getComponent();

    WebBackendHeading setAnimation(ComponentAnimation animation);

    WebBackendHeading startAnimation();

    WebBackendHeading cancelAnimation();
}
