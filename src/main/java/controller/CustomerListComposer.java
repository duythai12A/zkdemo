package controller;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;

import java.util.HashMap;

public class CustomerListComposer extends SelectorComposer<Component> {
    @Override
    public void doAfterCompose(Component comp) throws Exception {
        super.doAfterCompose(comp);
    }

    @Listen("onClick = #addNewCustomerButton")
    public void addNewCustomerButton(){
        final HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("sCustomer", null);
        map.put("recordMode", "NEW");
        Executions.createComponents("CustomerCRUD.zul", null, map);
    }
}
