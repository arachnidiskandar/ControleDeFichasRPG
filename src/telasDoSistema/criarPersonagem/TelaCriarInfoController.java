/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telasDoSistema.criarPersonagem;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;

/**
 *
 * @author augst
 */
public class TelaCriarInfoController implements Initializable{
    ObservableList list = FXCollections.observableArrayList();
    @FXML
    private ChoiceBox<String> nacoes;

    @FXML
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        loadData();
    }
    private void loadData(){
        list.removeAll(list);
        String nacao1= "Avalon";
        String nacao2= "Inismore";
        String nacao3= "The Highland Marches";
        String nacao4= "Castile";
        String nacao5= "Eisen";
        String nacao6= "Montaigne";
        String nacao7= "Sarmantia";
        String nacao8= "Ussura";
        String nacao9= "Vesten";
        String nacao10= "Vodacce";
        list.addAll(nacao1,nacao10,nacao2,nacao3,nacao4,nacao5,nacao6,nacao7,nacao8,nacao9);
        nacoes.getItems().addAll();
    }
}
