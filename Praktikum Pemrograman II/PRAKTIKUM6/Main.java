package PRAKTIKUM6;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;

public class Main extends Application {
	
	public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
    	
        TableView<Mahasiswa> tabel = new TableView<>();
        tabel.setPlaceholder(new javafx.scene.control.Label("No data found!"));
        TableColumn<Mahasiswa, String> kolomNama = new TableColumn<>("NAMA");
        kolomNama.setCellValueFactory(new PropertyValueFactory<>("nama"));
        TableColumn<Mahasiswa, String> kolomNIM = new TableColumn<>("NIM");
        kolomNIM.setCellValueFactory(new PropertyValueFactory<>("nim"));

        tabel.getColumns().addAll(kolomNIM, kolomNama);
        tabel.getItems().add(new Mahasiswa("Nazar", "32"));
        tabel.getItems().add(new Mahasiswa("Reza", "35"));
        tabel.getItems().add(new Mahasiswa("Ihsan", "45"));
        tabel.getItems().add(new Mahasiswa("Rahmat", "36"));
        tabel.getItems().add(new Mahasiswa("Permana", "43"));
        tabel.getItems().add(new Mahasiswa("Naim", "21"));
        tabel.getItems().add(new Mahasiswa("Ahmad", "24"));
        tabel.getItems().add(new Mahasiswa("Fitri", "29"));
        tabel.getItems().add(new Mahasiswa("Naafi", "41"));
        tabel.getItems().add(new Mahasiswa("Nasir", "20"));

        VBox box = new VBox(tabel);
        Scene scene = new Scene(box);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
