package cubesystem3d;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.DepthTest;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.paint.Material;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.RectangleBuilder;
import javafx.scene.shape.Sphere;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Translate;
import javafx.stage.Stage;
import javafx.util.Duration;

public class CubeSystem3D extends Application {

    private Timeline animation;

    private void init(Stage primaryStage) {
        Group root = new Group();
        root.setDepthTest(DepthTest.ENABLE);
        primaryStage.setResizable(false);
        primaryStage.setScene(new Scene(root, 500, 500, true));
        primaryStage.getScene().setCamera(new PerspectiveCamera());
        root.getTransforms().addAll(
                new Translate(500 / 2, 500 / 2),
                new Rotate(180, Rotate.X_AXIS)
        );
        root.getChildren().add(create3dContent());
    }

    public Node create3dContent() {
        Xform sceneRoot = new Xform();

        Xform Ellipse1X = new Xform();
        Ellipse Ellipse1 = new Ellipse(40, "file:sun.jpg", 1.0);

        Xform Ellipse1_1X = new Xform();
        Xform Ellipse1_2X = new Xform();
        Xform Ellipse1_3X = new Xform();
        Xform Ellipse1_4X = new Xform();
        Xform Ellipse1_5X = new Xform();
        Xform Ellipse1_6X = new Xform();
        Xform Ellipse1_7X = new Xform();
        Xform Ellipse1_8X = new Xform();
        Xform Ellipse1_9X = new Xform();

        Ellipse Ellipse1_1 = new Ellipse(4,"file:sun.jpg" , 1.0);
        Ellipse Ellipse1_2 = new Ellipse(5, "file:mercury.jpg", 1.0);
        Ellipse Ellipse1_3 = new Ellipse(6, "file:venus.jpg", 1.0);
        Ellipse Ellipse1_4 = new Ellipse(7, "file:earth.jpg", 1.0);
        Ellipse Ellipse1_5 = new Ellipse(8, "file:mars.jpg", 1.0);
        Ellipse Ellipse1_6 = new Ellipse(9,"file:jupiter.jpg", 1.0);
        Ellipse Ellipse1_7 = new Ellipse(10,"file:saturn.jpg", 1.0);
        Ellipse Ellipse1_8 = new Ellipse(11, "file:uranus.jpg", 1.0);
        Ellipse Ellipse1_9 = new Ellipse(12, "file:neptune.jpg", 1.0);
        sceneRoot.getChildren().add(Ellipse1X);

        Ellipse1X.getChildren().add(Ellipse1);
        Ellipse1X.getChildren().add(Ellipse1_1X);
        Ellipse1X.getChildren().add(Ellipse1_2X);
        Ellipse1X.getChildren().add(Ellipse1_3X);
        Ellipse1X.getChildren().add(Ellipse1_4X);
        Ellipse1X.getChildren().add(Ellipse1_5X);
        Ellipse1X.getChildren().add(Ellipse1_6X);
        Ellipse1X.getChildren().add(Ellipse1_7X);
        Ellipse1X.getChildren().add(Ellipse1_8X);
        Ellipse1X.getChildren().add(Ellipse1_9X);

        Ellipse1_1X.getChildren().add(Ellipse1_1);
        Ellipse1_2X.getChildren().add(Ellipse1_2);
        Ellipse1_3X.getChildren().add(Ellipse1_3);
        Ellipse1_4X.getChildren().add(Ellipse1_4);
        Ellipse1_5X.getChildren().add(Ellipse1_5);
        Ellipse1_6X.getChildren().add(Ellipse1_6);
        Ellipse1_7X.getChildren().add(Ellipse1_7);
        Ellipse1_8X.getChildren().add(Ellipse1_8);
        Ellipse1_9X.getChildren().add(Ellipse1_9);
        Ellipse1_1.setTranslateX(40.0);
        Ellipse1_2.setTranslateX(60.0);
        Ellipse1_3.setTranslateX(80.0);
        Ellipse1_4.setTranslateX(100.0);
        Ellipse1_5.setTranslateX(120.0);
        Ellipse1_6.setTranslateX(140.0);
        Ellipse1_7.setTranslateX(160.0);
        Ellipse1_8.setTranslateX(180.0);
        Ellipse1_9.setTranslateX(200.0);
        Ellipse1_1X.rx.setAngle(90.0);
        Ellipse1_2X.rz.setAngle(90.0);
        Ellipse1_3X.rz.setAngle(90.0);
        Ellipse1_4X.rz.setAngle(90.0);
        Ellipse1_5X.rz.setAngle(90.0);
        Ellipse1_6X.rz.setAngle(90.0);
        Ellipse1_7X.rz.setAngle(90.0);
        Ellipse1_8X.rz.setAngle(90.0);
        Ellipse1_9X.rz.setAngle(90.0);
        double endTime = 8000.0;

        //Animate 
        animation = new Timeline();
        animation.getKeyFrames().addAll(new KeyFrame(Duration.ZERO,
                new KeyValue(Ellipse1X.ry.angleProperty(), 0.0)),
                new KeyFrame(new Duration(endTime),
                        new KeyValue(Ellipse1X.ry.angleProperty(), 360.0)),
                new KeyFrame(Duration.ZERO,
                        new KeyValue(Ellipse1X.rx.angleProperty(), 0.0)),
                new KeyFrame(new Duration(endTime),
                        new KeyValue(Ellipse1X.rx.angleProperty(), 360.0)),
                new KeyFrame(Duration.ZERO,
                        new KeyValue(Ellipse1_1X.ry.angleProperty(), 0.0)),
                new KeyFrame(new Duration(endTime),
                        new KeyValue(Ellipse1_1X.ry.angleProperty(), -2880.0)),
                new KeyFrame(Duration.ZERO,
                        new KeyValue(Ellipse1_2X.ry.angleProperty(), 0.0)),
                new KeyFrame(new Duration(endTime),
                        new KeyValue(Ellipse1_2X.ry.angleProperty(), -1440.0)),
                new KeyFrame(Duration.ZERO,
                        new KeyValue(Ellipse1_3X.ry.angleProperty(), 0.0)),
                new KeyFrame(new Duration(endTime),
                        new KeyValue(Ellipse1_3X.ry.angleProperty(), -1080.0)),
                new KeyFrame(Duration.ZERO,
                        new KeyValue(Ellipse1_4X.ry.angleProperty(), 0.0)),
                new KeyFrame(new Duration(endTime),
                        new KeyValue(Ellipse1_4X.ry.angleProperty(), -720.0)),
                new KeyFrame(Duration.ZERO,
                        new KeyValue(Ellipse1_5X.ry.angleProperty(), 0.0)),
                new KeyFrame(new Duration(endTime),
                        new KeyValue(Ellipse1_5X.ry.angleProperty(), 1440.0)),
                new KeyFrame(Duration.ZERO,
                        new KeyValue(Ellipse1_6X.ry.angleProperty(), 0.0)),
                new KeyFrame(new Duration(endTime),
                        new KeyValue(Ellipse1_6X.ry.angleProperty(), 1080.0)),
                new KeyFrame(Duration.ZERO,
                        new KeyValue(Ellipse1_7X.ry.angleProperty(), 0.0)),
                new KeyFrame(new Duration(endTime),
                        new KeyValue(Ellipse1_7X.ry.angleProperty(), -360.0)),
                new KeyFrame(Duration.ZERO,
                        new KeyValue(Ellipse1_8X.ry.angleProperty(), 0.0)),
                new KeyFrame(new Duration(endTime),
                        new KeyValue(Ellipse1_8X.ry.angleProperty(), -720.0)),
                new KeyFrame(Duration.ZERO,
                        new KeyValue(Ellipse1_9X.ry.angleProperty(), 0.0)),
                new KeyFrame(new Duration(endTime),
                        new KeyValue(Ellipse1_9X.ry.angleProperty(), -1080.0)),
                new KeyFrame(Duration.ZERO,
                        new KeyValue(Ellipse1_1.rx.angleProperty(), 0.0)),
                new KeyFrame(new Duration(endTime),
                        new KeyValue(Ellipse1_1.rx.angleProperty(), 7200.0)),
                new KeyFrame(Duration.ZERO,
                        new KeyValue(Ellipse1_2.rx.angleProperty(), 0.0)),
                new KeyFrame(new Duration(endTime),
                        new KeyValue(Ellipse1_2.rx.angleProperty(), -7200.0)),
                new KeyFrame(Duration.ZERO,
                        new KeyValue(Ellipse1_3.rx.angleProperty(), 0.0)),
                new KeyFrame(new Duration(endTime),
                        new KeyValue(Ellipse1_3.rx.angleProperty(), 7200.0)),
                new KeyFrame(Duration.ZERO,
                        new KeyValue(Ellipse1_4.rx.angleProperty(), 0.0)),
                new KeyFrame(new Duration(endTime),
                        new KeyValue(Ellipse1_4.rx.angleProperty(), -7200.0)),
                new KeyFrame(Duration.ZERO,
                        new KeyValue(Ellipse1_5.rx.angleProperty(), 0.0)),
                new KeyFrame(new Duration(endTime),
                        new KeyValue(Ellipse1_5.rx.angleProperty(), 7200.0)),
                new KeyFrame(Duration.ZERO,
                        new KeyValue(Ellipse1_6.rx.angleProperty(), 0.0)),
                new KeyFrame(new Duration(endTime),
                        new KeyValue(Ellipse1_6.rx.angleProperty(), -7200.0)),
                new KeyFrame(Duration.ZERO,
                        new KeyValue(Ellipse1_7.rx.angleProperty(), 0.0)),
                new KeyFrame(new Duration(endTime),
                        new KeyValue(Ellipse1_7.rx.angleProperty(), 7200.0)),
                new KeyFrame(Duration.ZERO,
                        new KeyValue(Ellipse1_8.rx.angleProperty(), 0.0)),
                new KeyFrame(new Duration(endTime),
                        new KeyValue(Ellipse1_8.rx.angleProperty(), -7200.0)),
                new KeyFrame(Duration.ZERO,
                        new KeyValue(Ellipse1_9.rx.angleProperty(), 0.0)),
                new KeyFrame(new Duration(endTime),
                        new KeyValue(Ellipse1_9.rx.angleProperty(), 7200.0))
        );
        animation.setCycleCount(Timeline.INDEFINITE);
        animation.play();

        return sceneRoot;
    }

    public void play() {
        animation.play();
    }

    @Override
    public void stop() {
        animation.pause();
    }

    class Xform extends Group {

        final Rotate rx = new Rotate(0, Rotate.X_AXIS);
        final Rotate ry = new Rotate(0, Rotate.Y_AXIS);
        final Rotate rz = new Rotate(0, Rotate.Z_AXIS);

        public Xform() {
            super();
            getTransforms().addAll(rz, ry, rx);
        }
    }

    public class Ellipse extends Group {

        final Rotate rx = new Rotate(0, Rotate.X_AXIS);
        final Rotate ry = new Rotate(0, Rotate.Y_AXIS);
        final Rotate rz = new Rotate(0, Rotate.Z_AXIS);

        public Ellipse(double size, String PlanetMaterial, double shade) {
            PhongMaterial material = new PhongMaterial();
//            material.setDiffuseColor(color);
//            material.setSpecularColor(Color.BLACK);

            getTransforms().addAll(rz, ry, rx);
            Sphere s = new Sphere(size);
            Image earthImage = new Image(PlanetMaterial);
            PhongMaterial earthPhong = new PhongMaterial();
            earthPhong.setDiffuseMap(earthImage);
            s.setMaterial(earthPhong);

//            s.setMaterial(material);
            getChildren().addAll(s);
        }
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        init(primaryStage);
        primaryStage.show();
        play();
    }

    /**
     * The main() method is ignored in correctly deployed JavaFX application.
     * main() serves only as fallback in case the application can not be
     * launched through deployment artifacts, e.g., in IDEs with limited FX
     * support. NetBeans ignores main().
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}
