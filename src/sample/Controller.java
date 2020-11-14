package sample;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    public TextField weight;
    public TextField height;
    public TextField bmi;
    public Label label;

    public void butact() {
        double d1=Double.parseDouble(weight.getText());
        double d2=Double.parseDouble(height.getText());
        double d3=d1/((d2*0.0254)*(d2*0.0254));
        bmi.setText(Double.toString(d3));
        if(18.5<=d3 && d3<=24.9)
            label.setText("Normal weight");
        else if(25<=d3 && d3<=29.9)
            label.setText("Over weight");
        else if(d3<18.5)
            label.setText("Under weight");
        else
            label.setText("Abnormal weight");
    }
}
