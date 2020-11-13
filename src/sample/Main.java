//p.s. : je sais qu'il n'y a pas beaucoup de choses ici mais je me suis dit que j'alais l'envoyer quand même :))))
package sample;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.ClipboardContent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.TransferMode;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.stage.Stage;

import java.io.FileInputStream;

public class Main extends Application {

    @Override
    public void start(Stage window) throws Exception{
        window.setFullScreen(true);
        window.setMaximized(true);

        GridPane gp = new GridPane();
        gp.setVgap(3);
        gp.setHgap(3);
        gp.setGridLinesVisible(true);
        gp.setAlignment(Pos.CENTER);

        ColumnConstraints column;
        column = new ColumnConstraints();
        gp.getColumnConstraints().add(column);

        RowConstraints row;
        row = new RowConstraints();
        gp.getRowConstraints().add(row);

        FileInputStream input0 = new FileInputStream("src/sample/mario0.jpg");
        Image image0 = new Image(input0);
        ImageView imageView0 = new ImageView(image0);

        FileInputStream input1 = new FileInputStream("src/sample/mario1.jpg");
        Image image1 = new Image(input1);
        ImageView imageView1 = new ImageView(image1);

        FileInputStream input2 = new FileInputStream("src/sample/mario2.jpg");
        Image image2 = new Image(input2);
        ImageView imageView2 = new ImageView(image2);

        FileInputStream input3 = new FileInputStream("src/sample/mario3.jpg");
        Image image3 = new Image(input3);
        ImageView imageView3 = new ImageView(image3);

        FileInputStream input4 = new FileInputStream("src/sample/mario4.jpg");
        Image image4 = new Image(input4);
        ImageView imageView4 = new ImageView(image4);

        FileInputStream input5 = new FileInputStream("src/sample/mario5.jpg");
        Image image5 = new Image(input5);
        ImageView imageView5 = new ImageView(image5);

        FileInputStream input6 = new FileInputStream("src/sample/mario6.jpg");
        Image image6 = new Image(input6);
        ImageView imageView6 = new ImageView(image6);

        FileInputStream input7 = new FileInputStream("src/sample/mario7.jpg");
        Image image7 = new Image(input7);
        ImageView imageView7 = new ImageView(image7);

        FileInputStream input8 = new FileInputStream("src/sample/mario8.jpg");
        Image image8 = new Image(input8);
        ImageView imageView8 = new ImageView(image8);

        gp.setMinSize(603, 603);

        gp.add(imageView0, 0, 0);
        gp.add(imageView1, 0, 1);
        gp.add(imageView2, 0, 2);
        gp.add(imageView3, 1, 0);
        gp.add(imageView4, 1, 1);
        gp.add(imageView5, 1, 2);
        gp.add(imageView6, 2, 0);
        gp.add(imageView7, 2, 1);
        gp.add(imageView8, 2, 2);

        gp.setOnDragDetected(event -> {
            Dragboard dragboard = gp.startDragAndDrop(TransferMode.COPY);
            ClipboardContent contenu = new ClipboardContent();
            dragboard.setContent(contenu);
            int indexRow = GridPane.getRowIndex(gp);
            int indexColumn = GridPane.getColumnIndex(gp);
        });

        gp.setOnDragDropped(event -> {
            event.acceptTransferModes(TransferMode.COPY);
            event.setDropCompleted(true);
        });
        gp.setOnDragDone(event -> {
            System.out.println("hehe");
        });

        Group group = new Group(gp);
        Scene root = new Scene(group);
        window.setScene(root);
        window.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}