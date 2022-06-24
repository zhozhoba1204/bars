package com.blinov.bars.controller;

import com.blinov.bars.model.ContractEntity;
import com.blinov.bars.service.ContractService;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import javax.annotation.PostConstruct;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
public class JavaFxController {
    @Autowired
    private ContractService contractService;

    @FXML private TableView<ContractEntity> table;
    @FXML private TextField txtNumber;
    @FXML private TextField txtDateOfCreation;
    @FXML private TextField txtLastUpdate;
    @FXML private TextField txtCheckBox;

    private ObservableList<ContractEntity> data;

    @FXML
    public void initialize() {
    }

    @PostConstruct
    public void init() {
        List<ContractEntity> contacts = contractService.findAll();
        data = FXCollections.observableArrayList(contacts);

        TableColumn<ContractEntity, String> numberColumn = new TableColumn<>("number");
        numberColumn.setCellValueFactory(new PropertyValueFactory<>("number"));

        TableColumn<ContractEntity, String> dateOfCreationColumn = new TableColumn<>("date_of_creation");
        dateOfCreationColumn.setCellValueFactory(new PropertyValueFactory<>("dateOfCreation"));

        TableColumn<ContractEntity, String> lastUpdateColumn = new TableColumn<>("last_update");
        lastUpdateColumn.setCellValueFactory(new PropertyValueFactory<>("lastUpdate"));

        TableColumn<ContractEntity, String> checkBox = new TableColumn<>("check_box");
        checkBox.setCellValueFactory(new PropertyValueFactory<>("checkBox"));

        table.getColumns().setAll(numberColumn, dateOfCreationColumn, lastUpdateColumn, checkBox);

        table.setItems(data);
    }
}

