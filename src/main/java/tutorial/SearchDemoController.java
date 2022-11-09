package tutorial;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.event.Events;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zul.*;

import java.util.Set;

public class SearchDemoController extends SelectorComposer<Component>{

    @Wire
    private Textbox keywordBox;
    @Wire
    private Listbox carListbox;
    @Wire
    private Label modelLabel;
    @Wire
    private Label makeLabel;
    @Wire
    private Label priceLabel;
    @Wire
    private Label descriptionLabel;
    @Wire
    private Image previewImage;

    @Wire
    private Button searchButton;
    private ListModelList<Car> dataModel = new ListModelList<>();
    private CarService carService = new CarServiceImpl();

    @Override
    public void doAfterCompose(Component comp)throws Exception{
        super.doAfterCompose(comp);
        carListbox.setModel(dataModel);
    }

    @Listen("onClick = #searchButton")
    public void search(){
        String keyword = keywordBox.getValue();
        dataModel.clear();
        dataModel.addAll(carService.search(keyword));
    }

    @Listen(Events.ON_SELECT + " = #carListbox")
    public void showDetail(){
        Set<Car> selection = dataModel.getSelection();
        Car selected = selection.iterator().next();
        previewImage.setSrc(selected.getPreview());
        modelLabel.setValue(selected.getModel());
        makeLabel.setValue(selected.getMake());
        priceLabel.setValue(selected.getPrice().toString());
        descriptionLabel.setValue(selected.getDescription());
    }
}
