package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import javax.xml.transform.Result;

public class AddMaterialController {
    public TextField mat;
    public TextField quantity;
    public TextField price;

    public void add(ActionEvent actionEvent) {
//        String m = mat.getText();
//        int q = Integer.parseInt(quantity.getText());
//        int p = Integer.parseInt(price.getText());


        System.out.println("Материал: " + mat.getText());
        System.out.println("Количество: " + quantity.getText());
        System.out.println("Цена: " + price.getText());

    }
}
