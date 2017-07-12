/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatroomfx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 *
 * @author BenBody
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private TextField hostTextField;
            
    @FXML
    private TextField portTextField;
    
    @FXML
    private TextField usernameTextField;
    
    @FXML
    private TextArea chatTextArea;
    
    @FXML
    private TextField messageTextField;
    
    @FXML
    private void connectButtonActionPerformed(ActionEvent e)
    {
        //TODO connect
    }
    
    @FXML
    private void sendButtonActionPerformed(ActionEvent e)
    {
        //TODO: sending protocol
    }
    
    @FXML
    private void userListButtonActionPerformed(ActionEvent e)
    {
        //TODO: Who is in?
    }
    
    @FXML
    private void logOutButtonActionPerformed(ActionEvent e)
    {
        // TODO Disconnect
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }  
    
    public void append(String message)
    {
        chatTextArea.appendText(message);
    }
    
    public void append(ChatMessage message)
    {
        StringBuilder output = new StringBuilder();
        
        output.append(message.getuser())
                .append(" ")
                .append(message.getTime())
                .append(": ")
                .append(message.getMessage())
                .append("\n");
        
        chatTextArea.appendText(output.toString());
    }
    
}
