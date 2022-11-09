package tutorial;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zul.Button;
import org.zkoss.zul.Checkbox;

public class RegistrationController extends SelectorComposer<Component> {
    @Wire
    private Button submitButton;
    @Wire
    private Checkbox acceptTermBox;

    @Listen("onCheck = #acceptTermBox")
    public void changeSubmitStatus() {
        if (acceptTermBox.isChecked()) {
            submitButton.setDisabled(false);
            submitButton.setImage("/img/car1.png");
        } else {
            submitButton.setDisabled(true);
            submitButton.setImage("");
        }
    }
}