package scavChall_2;

import javafx.application.Application;
import javafx.scene.*;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;

public class Hunt2FX extends Application {
	
	public void start(Stage primaryStage) {
		Group root = new Group();
		Scene scene = new Scene(root, 1000, 400, Color.ORANGE);
		
		// rectangle
		Rectangle r1 = new Rectangle();
		r1.setX(50);
		r1.setY(50);
		r1.setHeight(300);
		r1.setWidth(50);
		root.getChildren().add(r1);
		
		// line 1
		Line line1 = new Line();
		line1.setStartX(300);
		line1.setStartY(350);
		line1.setEndX(500);
		line1.setEndY(350);
		line1.setStrokeWidth(8.0);
		root.getChildren().add(line1);
		
		// circle
		Circle c1 = new Circle();
		c1.setCenterX(650);
		c1.setCenterY(125);
		c1.setRadius(75);
		c1.setFill(Color.ORANGE);
		c1.setStroke(Color.BLACK);
		c1.setStrokeWidth(8.0);
		root.getChildren().add(c1);
		
		// rectangle 2
		Rectangle r2 = new Rectangle();
		r2.setX(r1.getX());
		r2.setY(r1.getY());
		r2.setWidth(3*r1.getWidth());
		r2.setHeight(r1.getHeight()/6);
		root.getChildren().add(r2);
		
		// line 2
		Line line2 = new Line();
		line2.setStartX(800);
		line2.setStartY(350);
		line2.setEndX(1000);
		line2.setEndY(125);
		line2.setStrokeWidth(8.0);
		root.getChildren().add(line2);
		
		// arc 1
		Arc arc1 = new Arc();
		arc1.setCenterX((line1.getStartX()+line1.getEndX())/2);
		arc1.setCenterY(c1.getCenterY());
		arc1.setRadiusX(100);
		arc1.setRadiusY(75);
		arc1.setStartAngle(0);
		arc1.setLength(180);
		arc1.setFill(Color.ORANGE);
		arc1.setStroke(Color.BLACK);
		arc1.setStrokeWidth(8.0);
		root.getChildren().add(arc1);
		
		// rectangle 3
		Rectangle r3 = new Rectangle();
		r3.setX(r2.getX());
		r3.setY(r2.getY()+125);
		r3.setWidth(r2.getWidth());
		r3.setHeight(r2.getHeight());
		root.getChildren().add(r3);
		
		// line 3
		Line line3 = new Line();
		line3.setStartX(800);
		line3.setStartY(350);
		line3.setEndX(1000);
		line3.setEndY(350);
		line3.setStrokeWidth(8.0);
		root.getChildren().add(line3);
		
		// arc 2
		Arc arc2 = new Arc();
		arc2.setCenterX((line3.getStartX()+line3.getEndX())/2);
		arc2.setCenterY(c1.getCenterY());
		arc2.setRadiusX(100);
		arc2.setRadiusY(75);
		arc2.setStartAngle(0);
		arc2.setLength(180);
		arc2.setFill(Color.ORANGE);
		arc2.setStroke(Color.BLACK);
		arc2.setStrokeWidth(8.0);
		root.getChildren().add(arc2);
		
		// line 4
		Line line4 = new Line();
		line4.setStartX(line1.getStartX());
		line4.setStartY(line1.getStartY());
		line4.setEndX(500);
		line4.setEndY(100);
		line4.setStrokeWidth(8.0);
		root.getChildren().add(line4);
		
		// rectangle 4
		Rectangle r4 = new Rectangle();
		r4.setX(r2.getX());
		r4.setY(300);
		r4.setWidth(r2.getWidth());
		r4.setHeight(r2.getHeight());
		root.getChildren().add(r4);
		
		// circle 2
		Circle c2 = new Circle();
		c2.setCenterX(c1.getCenterX());
		c2.setCenterY(2*c1.getRadius()+c1.getCenterY());
		c2.setRadius(c1.getRadius());
		c2.setFill(Color.ORANGE);
		c2.setStroke(Color.BLACK);
		c2.setStrokeWidth(8.0);
		root.getChildren().add(c2);
		
		primaryStage.setTitle("HUNT2FX");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
