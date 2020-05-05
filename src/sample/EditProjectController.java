package sample;


import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableView;
import javafx.stage.Stage;


public class EditProjectController {



    private class Result {
        private SimpleIntegerProperty nr = new SimpleIntegerProperty();
        private SimpleStringProperty mt = new SimpleStringProperty();
        private SimpleIntegerProperty qn = new SimpleIntegerProperty();
        private SimpleIntegerProperty pr = new SimpleIntegerProperty();

        public int getNr() {
            return nr.get();
        }

        public SimpleIntegerProperty nrProperty() {
            return nr;
        }

        public void setNr(int nr) {
            this.nr.set(nr);
        }

        public String getMt() {
            return mt.get();
        }

        public SimpleStringProperty mtProperty() {
            return mt;
        }

        public void setMt(String mt) {
            this.mt.set(mt);
        }

        public int getQn() {
            return qn.get();
        }

        public SimpleIntegerProperty qnProperty() {
            return qn;
        }

        public void setQn(int qn) {
            this.qn.set(qn);
        }

        public int getPr() {
            return pr.get();
        }

        public SimpleIntegerProperty prProperty() {
            return pr;
        }

        public void setPr(int pr) {
            this.pr.set(pr);
        }
    }

    public void addMaterial(ActionEvent actionEvent) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("AddMaterial.fxml"));
        Parent root = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setTitle("УД Бюджет");
        stage.setScene(new Scene(root));
        stage.show();


    }
}
