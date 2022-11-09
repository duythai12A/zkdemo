package tutorial;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zul.Checkbox;
import org.zkoss.zul.Label;

public class RadioAndCheckboxController extends SelectorComposer<Component> {
    @Wire
    private Checkbox l1;

    @Wire
    private Checkbox l2;

    @Wire
    private Checkbox l3;

    @Wire
    private Label layout;

    @Listen("onCheck = layout")
    public void doChecked() {
        layout.setValue((l1.isChecked() ? l1.getValue().toString()+' ' : "")
        + (l2.isChecked() ? l2.getValue().toString()+' ' : "")
        + (l3.isChecked() ? l3.getValue().toString()+' ' : ""));
    }
}
