/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventorysystem;

import java.io.IOException;
import java.net.*;
import java.util.*;
import javafx.event.*;
import javafx.fxml.*;
import javafx.scene.control.*;
import javafx.stage.*;
import javafx.application.*;
import javafx.scene.*;
import javafx.scene.layout.*;

/**
 *
 * @author John
 */
public class FXMLController implements Initializable {

    //Object Instances
    InventorySystem imsApplication = new InventorySystem();
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }      
    
    /*Scene Identifiers Naming Convention (Appends fx:id name)
    * 1 = FXMLMain.fxml             (Main Menu)
    * 2 = FXMLAddPart.fxml          (Add Part Screen)
    * 3 = FXMLModifyPart.fxml       (Modify Part Screen)
    * 4 = FXMLAddProduct.fxml       (Add Product Screen)
    * 5 = FXMLModifyProduct.fxml    (Modify Product Screen)
    */

    /************************
    * FXML Main - 1
    *************************/
    @FXML
    private AnchorPane sceneMain1;

    @FXML
    private Button buttonSearchPart1;

    @FXML
    private Button buttonNavModifyPart1;

    @FXML
    private Button buttonDeletePart1;

    @FXML
    private TextField fieldSearchPart1;

    @FXML
    private Button buttonNavAddPart1;

    @FXML
    private Button buttonSearchProduct1;

    @FXML
    private Button buttonNavModifyProduct1;

    @FXML
    private Button buttonDeleteProduct1;

    @FXML
    private TextField fieldSearchProduct1;

    @FXML
    private Button buttonNavAddProduct1;

    @FXML
    private Button mainExit1;

    @FXML
    void handleDeleteSelectedPart1(ActionEvent event) {

    }

    @FXML
    void handleDeleteSelectedProduct1(ActionEvent event) {

    }

    @FXML
    void handleExitApplication1(ActionEvent event) {
        Platform.exit();
    }

    @FXML
    void handleNavAddPart1(ActionEvent event) throws IOException {
        imsApplication.setScene("FXMLAddPart.fxml", event);
    }

    @FXML
    void handleNavAddProduct1(ActionEvent event) throws IOException {
        imsApplication.setScene("FXMLAddProduct.fxml", event);
    }

    @FXML
    void handleNavModifyPart1(ActionEvent event) throws IOException {
        imsApplication.setScene("FXMLModifyPart.fxml",event);
    }

    @FXML
    void handleNavModifyProduct1(ActionEvent event) throws IOException {
        imsApplication.setScene("FXMLModifyProduct.fxml", event);
    }

    @FXML
    void handleSearchPart1(ActionEvent event) {

    }

    @FXML
    void handleSearchProduct1(ActionEvent event) {

    }

    /************************
    * FXML Add Part - 2
    *************************/
    @FXML
    private AnchorPane sceneAddPart2;

    @FXML
    private RadioButton radioInHouse2;

    @FXML
    private RadioButton radioOutsourced2;
    
    @FXML
    private ToggleGroup groupSource2;

    @FXML
    private Label labelCompanyNameMachineID2;

    @FXML
    private TextField fieldID2;

    @FXML
    private TextField fieldName2;

    @FXML
    private TextField fieldInventory2;

    @FXML
    private TextField fieldPrice2;

    @FXML
    private TextField fieldMax2;

    @FXML
    private TextField fieldMin2;

    @FXML
    private TextField fieldCompanyNameMachineID2;

    @FXML
    private Button buttonSavePart2;

    @FXML
    private Button buttonNavCancel2;

    @FXML
    void handleInHouseAddPartRadio2(ActionEvent event) {

    }

    @FXML
    void handleNavCancelAddPartButton2(ActionEvent event) throws IOException {
        imsApplication.setScene("FXMLMain.fxml", event);
    }

    @FXML
    void handleOutsourcedAddPartRadio2(ActionEvent event) {

    }

    @FXML
    void handleSaveAddPartButton2(ActionEvent event) {

    }

    /************************
    * FXML Modify Part - 3
    *************************/
    @FXML
    private AnchorPane sceneModifyPart3;

    @FXML
    private RadioButton radioInHouse3;

    @FXML
    private RadioButton radioOutsourced3;
    
    @FXML
    private ToggleGroup groupSource3;

    @FXML
    private Label labelCompanyNameMachineID3;

    @FXML
    private TextField fieldID3;

    @FXML
    private TextField fieldName3;

    @FXML
    private TextField fieldInventory3;

    @FXML
    private TextField fieldPrice3;

    @FXML
    private TextField fieldMax3;

    @FXML
    private TextField fieldMin3;

    @FXML
    private TextField fieldCompanyNameMachineID3;

    @FXML
    private Button buttonSavePart3;

    @FXML
    private Button buttonNavCancel3;

    @FXML
    void handleInHouseRadio3(ActionEvent event) {

    }

    @FXML
    void handleNavCancelButton3(ActionEvent event) throws IOException {
        imsApplication.setScene("FXMLMain.fxml", event);
    }

    @FXML
    void handleOutsourcedRadio3(ActionEvent event) {

    }

    @FXML
    void handleSaveModifyPartButton3(ActionEvent event) {
        
    }
       
    /************************
    * FXML Add Product - 4
    *************************/
    @FXML
    private AnchorPane sceneAddProduct4;

    @FXML
    private Button buttonSearchProduct4;

    @FXML
    private TextField fieldSearchProduct4;

    @FXML
    private Button buttonAddProduct4;

    @FXML
    private Button buttonSaveProduct4;

    @FXML
    private Button buttonNavCancel4;

    @FXML
    private Button buttonDeleteProduct4;

    @FXML
    private TextField fieldID4;

    @FXML
    private TextField fieldName4;

    @FXML
    private TextField fieldInventory4;

    @FXML
    private TextField fieldPrice4;

    @FXML
    private TextField fieldMax4;

    @FXML
    private TextField fieldMin4;

    @FXML
    void handleAddProduct4(ActionEvent event) {

    }

    @FXML
    void handleNavCancelProduct4(ActionEvent event) throws IOException {
        imsApplication.setScene("FXMLMain.fxml", event);
    }

    @FXML
    void handleDeleteProduct4(ActionEvent event) {

    }

    @FXML
    void handleSaveProduct4(ActionEvent event) {

    }

    @FXML
    void handleSearchProductButton4(ActionEvent event) {

    }
    
    /************************
    * FXML Modify Product - 5
    *************************/
      @FXML
    private AnchorPane sceneModifyProduct5;

    @FXML
    private Button buttonSearchProduct5;

    @FXML
    private TextField fieldSearchProduct5;

    @FXML
    private Button buttonAddProduct5;

    @FXML
    private Button buttonSaveProduct5;

    @FXML
    private Button buttonNavCancel5;

    @FXML
    private Button buttonDeleteProduct5;

    @FXML
    private TextField fieldID5;

    @FXML
    private TextField fieldName5;

    @FXML
    private TextField fieldInventory5;

    @FXML
    private TextField fieldPrice5;

    @FXML
    private TextField fieldMax5;

    @FXML
    private TextField fieldMin5;

    @FXML
    void handleAddProduct5(ActionEvent event) {

    }

    @FXML
    void handleDeleteProduct5(ActionEvent event) {

    }

    @FXML
    void handleNavCancelProduct5(ActionEvent event) throws IOException {
        imsApplication.setScene("FXMLMain.fxml", event);
    }

    @FXML
    void handleSaveProduct5(ActionEvent event) {

    }

    @FXML
    void handleSearchProductButton5(ActionEvent event) {

    }  
}
