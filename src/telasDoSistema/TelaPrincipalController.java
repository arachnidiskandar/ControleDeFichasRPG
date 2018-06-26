/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telasDoSistema;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import personagens.jogador.Jogador;

/**
 *
 * @author augst
 */
public class TelaPrincipalController implements Initializable { 
    
    @FXML
    private TableView<Jogador> tableView;
    @FXML
    private TableColumn<Jogador, String> colunaNomeJogador;
    @FXML
    private TableColumn<Jogador, String> colunaNomePersonagem;
    @FXML
    private MenuItem criarPlayer;
    @FXML
    private Label labelNomeJogador;
    @FXML
    private Label labelNomePersonagem;
    @FXML
    private Label labelNomeNacao;
    @FXML
    private Label labelNomeReputacao;
    @FXML
    private Label labelNomeRiqueza;
    @FXML
    private Label labelNomeGrupo;
    @FXML
    private Label labelNomeVirtude;
    @FXML
    private Label labelNomeHubris;
    @FXML
    private Label labelNomeAventura;
    @FXML
    private Label labelRecompensaAventura;
    @FXML
    private Label labelQntdVigor;
    @FXML
    private Label labelQntdFinesse;
    @FXML
    private Label labelQntdArgucia;
    @FXML
    private Label labelQntdPanache;
    @FXML
    private Label labelNomeFomacao1;
    @FXML
    private Label labelNomeFomacao2;
    @FXML
    private Label labelTotalFeridas;
    @FXML
    private Button botaoAddFerida;
    @FXML
    private Button botaoRemoverFerida;
    @FXML
    private Button alterarDadosPersonagem;
    @FXML
    private Button deletarPersonagem;
    
    @FXML
    public void initialize(URL url, ResourceBundle rb) {
        
    }
    
    
}
