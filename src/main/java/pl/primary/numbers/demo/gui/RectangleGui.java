package pl.primary.numbers.demo.gui;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

@Route
public class RectangleGui extends VerticalLayout {
    private Long id;
    private TextField textfiedwidth;
    private TextField textfiedheight;
    private Button button;

    public RectangleGui() {
        textfiedwidth = new TextField("podaj wysokość");
        textfiedheight = new TextField("Podaj szerokość");
        button = new Button("Dodaj!!!");

        add(textfiedheight);
        add(textfiedwidth);
        add(button);
    }


}
