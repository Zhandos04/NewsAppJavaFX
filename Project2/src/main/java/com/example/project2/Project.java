package com.example.project2;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.*;
import java.util.Scanner;

public class Project extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        DropShadow dropShadow = new DropShadow();
        dropShadow.setOffsetY(8);

        Text text = new Text("   Technological Development News");
        text.setEffect(dropShadow);
        text.setFill(Color.WHITE);
        text.setFont(Font.font("Serif", FontWeight.BOLD, FontPosture.REGULAR, 25));

        Image image = new Image(new File("C:\\Users\\Zhandos\\IdeaProjects\\Project2\\src\\main\\java\\com\\example\\project2\\Новая папка\\ezgif-3-30541cf074.jpg").toURI().toString());
        ImageView imageView = new ImageView(image);
        imageView.setFitWidth(100);
        imageView.setFitHeight(100);

        Button sign_up = new Button();
        sign_up.setShape(new Circle(1.5));
        sign_up.setText("Sign Up");
        sign_up.setOnAction(event -> {
            primaryStage.close();
            SignUp project2 = new SignUp();
            try {
                project2.start(primaryStage);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });

        TextField username = new TextField();
        username.setPromptText("Username");

        PasswordField password = new PasswordField();
        password.setPromptText("Password");

        VBox vBox = new VBox();
        vBox.getChildren().addAll(username);
        vBox.setPadding(new Insets(30, 195, 0, 215));

        VBox vBox2 = new VBox();
        vBox2.getChildren().addAll(password);
        vBox2.setPadding(new Insets(15, 195, 0, 215));

        Button login = new Button();
        login.setShape(new Circle(1.5));
        login.setText("Login");

        Text text2 = new Text();
        Text text3 = new Text();

        CheckBox remember = new CheckBox("Remember me!");
        remember.setFont(new Font(Font.font(12).getSize()));
        remember.setTextFill(Color.WHITE);
        remember.setPadding(new Insets(20));

        File rememberFile = new File("remember.txt");
        PrintWriter writer = new PrintWriter(new FileWriter(rememberFile, true));

        remember.setOnMouseClicked(event -> {
            writer.append(username.getText() + " ");
            writer.append(password.getText() + "\n");
            writer.close();
        });

        username.setOnKeyTyped(event -> {
            File file1 = new File("remember.txt");
            try {
                Scanner scanner = new Scanner(file1);
                while (scanner.hasNext()){
                    if(scanner.next().equals(username.getText())){
                        password.setText(scanner.next());
                        break;
                    }
                }
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        });

        ProgressBar progressBar = new ProgressBar();
        progressBar.setPadding(new Insets(0,-260,40,260));
        progressBar.setVisible(false);
        Timeline timeline = new Timeline(
                new KeyFrame(Duration.ZERO,new KeyValue(progressBar.progressProperty(),0)),new KeyFrame(Duration.seconds(2),new KeyValue(progressBar.progressProperty(),1))
        );



        Label forgotpassword = new Label("Forgot Password ?");
        forgotpassword.setTextFill(Color.WHITE);
        forgotpassword.setPadding(new Insets(0, 190, 0, 275));
        forgotpassword.setAlignment(Pos.BOTTOM_CENTER);
        forgotpassword.setFont(Font.font(10));
        forgotpassword.setOnMouseClicked(event -> {
            Text text1 = new Text("   Technological Development News");
            DropShadow dropShadow1 = new DropShadow();
            dropShadow1.setOffsetY(8);
            text1.setEffect(dropShadow1);
            text1.setFill(Color.WHITE);
            Font font1 = Font.font("Serif", FontWeight.BOLD, FontPosture.REGULAR, 25);
            text1.setFont(font1);

            Image image1 = new Image(new File("C:\\Users\\Zhandos\\IdeaProjects\\Project2\\src\\main\\java\\com\\example\\project2\\Новая папка\\ezgif-3-30541cf074.jpg").toURI().toString());
            ImageView imageView1 = new ImageView(image1);
            imageView1.setFitWidth(100);
            imageView1.setFitHeight(100);

            Button sign_up1 = new Button();
            sign_up1.setShape(new Circle(1.5));
            sign_up1.setText("Sign Up");
            sign_up1.setOnAction(event1 -> {
                SignUp project2 = new SignUp();
                try {
                    project2.start(new Stage(primaryStage.getStyle()));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });
            TextField username1 = new TextField();
            username1.setPromptText("Username");

            PasswordField newPassword = new PasswordField();
            newPassword.setPromptText("New Password");

            Button button = new Button();
            button.setText("Update Password");
            button.setShape(new Circle(1.5));

            HBox box = new HBox(145);
            box.getChildren().add(text1);
            box.getChildren().add(sign_up1);
            box.setPadding(new Insets(10, 0, 0, 0));

            VBox vBox1 = new VBox(10);
            vBox1.getChildren().addAll(imageView1, username1, newPassword, button);
            vBox1.setAlignment(Pos.CENTER);
            vBox1.setPadding(new Insets(0, 195, 0, 215));
            Image image10 = new Image(new File("C:\\Users\\Zhandos\\IdeaProjects\\Project2\\src\\main\\java\\com\\example\\project2\\Новая папка\\almaty.jpg").toURI().toString());
            ImageView imageView10 = new ImageView(image10);
            imageView10.setFitWidth(600);
            imageView10.setFitHeight(450);

            Button back = new Button("BACK");
            back.setLayoutY(50);
            back.setLayoutX(30);

            Pane pane1 = new Pane(back);

            BorderPane borderPane = new BorderPane();
            borderPane.getChildren().add(imageView10);
            borderPane.setTop(box);
            borderPane.setCenter(vBox1);
            borderPane.getChildren().add(pane1);

            Scene scene = new Scene(borderPane, 600, 450);
            Stage stage = new Stage();
            stage.setTitle("Forgot Password");
            stage.setScene(scene);
            stage.show();

            back.setOnAction(event1 -> {
                stage.close();
            });

            button.setOnAction(event1 -> {
                if (username1.getText().equals("") || newPassword.getText().equals("") || newPassword.getText().length() > 9 || username1.getText().length() > 9) {
                    ErrorPage errorPage = new ErrorPage();
                    try {
                        errorPage.start(primaryStage);
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                } else {
                    File file = new File("sign.txt");
                    String[] arr1 = new String[100];
                    int i = 0;
                    try {
                        Scanner scanner = new Scanner(file);
                        while (scanner.hasNext()) {
                            arr1[i] = scanner.next();
                            i++;
                        }
                        file.delete();
                        File file1 = new File("sign.txt");
                        FileWriter fileWriter = new FileWriter(file1);
                        for (int j = 0; j < arr1.length - 1; j++) {
                            if (username1.getText().equals(arr1[j])) {
                                arr1[j + 1] = newPassword.getText();
                            }
                        }
                        for (int j = 0; j < i - 1; j++) {
                            fileWriter.write(arr1[j] + " " + arr1[j + 1] + "\n");
                        }
                        fileWriter.close();
                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    stage.close();
                    primaryStage.show();

                    System.out.println("Password updated succesful!");
                }
            });
        });

        Button admin = new Button("ADMIN");
        admin.setShape(new Circle(1.5));

        admin.setOnAction(event -> {
            primaryStage.close();
            AdminPage adminPage = new AdminPage();
            try {
                adminPage.start(new Stage(primaryStage.getStyle()));
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });

        HBox hBox5 = new HBox();
        hBox5.getChildren().addAll(forgotpassword, admin);
        hBox5.setPadding(new Insets(0, 0, 13, -20));

        HBox hBox1 = new HBox(145);
        hBox1.getChildren().add(text);
        hBox1.getChildren().add(sign_up);
        hBox1.setPadding(new Insets(10, 0, 0, 0));

        HBox hBox = new HBox(remember, login);
        hBox.setAlignment(Pos.CENTER);

        VBox vBox1 = new VBox(imageView, vBox, vBox2, hBox);
        vBox1.setAlignment(Pos.CENTER);
        vBox1.setPadding(new Insets(10));

        Image image1 = new Image(new File("C:\\Users\\Zhandos\\IdeaProjects\\Project2\\src\\main\\java\\com\\example\\project2\\Новая папка\\almaty.jpg").toURI().toString());
        ImageView imageView1 = new ImageView(image1);
        imageView1.setFitWidth(600);
        imageView1.setFitHeight(450);
        BorderPane borderPane = new BorderPane();
        borderPane.getChildren().add(imageView1);
        borderPane.setTop(hBox1);
        borderPane.setCenter(vBox1);
        borderPane.setBottom(hBox5);

        login.setOnAction(event -> {
            remember.setSelected(false);
            if (username.getText().length() == 0) {
                text2.setFill(Color.WHITE);
                text2.setText("Username is Empty");
                vBox.getChildren().add(text2);
            }
            if (password.getText().length() == 0) {
                text3.setFill(Color.WHITE);
                text3.setText("Password is Empty");
                vBox2.getChildren().add(text3);
            }
            if (username.getText().length() < 9 && password.getText().length() < 9) {
                text2.setText("");
                text3.setText("");
                File file = new File("sign.txt");
                try {
                    Scanner scanner = new Scanner(file);
                    int s = 0;
                    while (scanner.hasNext()) {
                        if (username.getText().equals(scanner.next()) && password.getText().equals(scanner.next())) {
                            s++;
                            borderPane.setBottom(progressBar);
                            progressBar.setVisible(true);
                            timeline.play();
                            timeline.setOnFinished(event1 -> {
                                NewsPage newsPage = new NewsPage();
                                try {
                                    newsPage.start(new Stage(primaryStage.getStyle()));
                                } catch (Exception e) {
                                    throw new RuntimeException(e);
                                }
                                username.setText("");
                                password.setText("");
                            });
                            break;
                        }
                    }
                    if (s != 1) {
                        ErrorPage errorPage = new ErrorPage();
                        errorPage.start(new Stage(primaryStage.getStyle()));
                        username.setText("");
                        password.setText("");
                    }
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
            if (username.getText().length() > 9 || password.getText().length() > 9) {
                if (username.getText().length() > 0 && text2.getText().equals("Username is Empty")) {
                    text2.setText("");
                }
                if (password.getText().length() > 0 && text3.getText().equals("Password is Empty")) {
                    text3.setText("");
                }
                ErrorPage errorPage = new ErrorPage();
                try {
                    errorPage.start(new Stage(primaryStage.getStyle()));
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Scene scene = new Scene(borderPane, 600, 450);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Project #2");
        primaryStage.show();
    }
}

    class SignUp extends Application {
        private TextField textField;
        private PasswordField textField1;
        private TextField textField2;
        private int a;
        private String t;
        private String t1;
        private String mail;
        @Override
        public void start(Stage primaryStage) throws IOException {
            Text text = new Text("   Technological Development News");
            DropShadow dropShadow = new DropShadow();
            dropShadow.setOffsetY(8);
            text.setEffect(dropShadow);
            text.setFill(Color.WHITE);
            Font font = Font.font("Serif", FontWeight.BOLD, FontPosture.REGULAR,25);
            text.setFont(font);

            Image image = new Image(new File("C:\\Users\\Zhandos\\IdeaProjects\\Project2\\src\\main\\java\\com\\example\\project2\\Новая папка\\ezgif-3-30541cf074.jpg").toURI().toString());
            ImageView imageView = new ImageView(image);
            imageView.setFitWidth(80);
            imageView.setFitHeight(80);
            imageView.setX(45);
            imageView.setY(50);

            Button login = new Button();
            login.setOnAction(
                    event -> {
                        Project dragDropPractice = new Project();
                        try {
                            dragDropPractice.start(primaryStage);
                        } catch (FileNotFoundException e) {
                            throw new RuntimeException(e);
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    }
            );
            login.setText("Login");
            login.setShape(new Circle(1.5));

            HBox hBox = new HBox(145);
            hBox.getChildren().addAll(text,login);
            hBox.setPadding(new Insets(10));

            textField = new TextField();
            textField1 = new PasswordField();

            textField.setPromptText("Username");
            textField1.setPromptText("Password");

            ToggleGroup toggleGroup = new ToggleGroup();
            RadioButton radioButton = new RadioButton("Male");
            radioButton.setTextFill(Color.WHITE);
            radioButton.setToggleGroup(toggleGroup);
            RadioButton radioButton1 = new RadioButton("Female");
            radioButton1.setTextFill(Color.WHITE);
            radioButton1.setToggleGroup(toggleGroup);

            HBox hBox1 = new HBox(80);
            hBox1.getChildren().addAll(radioButton,radioButton1);

            textField2 = new TextField();
            textField2.setPromptText("Email");

            Button button = new Button();
            button.setText("Sign Up");

            File sign = new File("sign.txt");
            PrintWriter out = new PrintWriter(new FileWriter(sign, true));

            ProgressBar progressBar = new ProgressBar();
            progressBar.setPadding(new Insets(0,-260,40,260));
            progressBar.setVisible(false);
            Timeline timeline = new Timeline(
                    new KeyFrame(Duration.ZERO,new KeyValue(progressBar.progressProperty(),0)),new KeyFrame(Duration.seconds(2),new KeyValue(progressBar.progressProperty(),1))
            );

            button.setPadding(new Insets(3,70,3,70));

            VBox vBox = new VBox(20);
            vBox.getChildren().addAll(textField, textField1,hBox1,textField2,button);
            vBox.setAlignment(Pos.CENTER);
            vBox.setPadding(new Insets(0,195,0,215));

            Image image1 = new Image(new File("C:\\Users\\Zhandos\\IdeaProjects\\Project2\\src\\main\\java\\com\\example\\project2\\Новая папка\\almaty.jpg").toURI().toString());
            ImageView imageView1 = new ImageView(image1);
            imageView1.setFitWidth(600);
            imageView1.setFitHeight(450);
            BorderPane borderPane = new BorderPane();
            borderPane.getChildren().add(imageView1);
            borderPane.getChildren().add(imageView);
            borderPane.setCenter(vBox);
            borderPane.setTop(hBox);

            borderPane.setStyle("-fx-background-color: DARKSLATEBLUE");
            button.setOnAction(event -> {
                if(!radioButton.isSelected() && !radioButton1.isSelected() && !textField.getText().isEmpty() && !textField1.getText().isEmpty()){
                    textField.setText("");
                    textField1.setText("");
                    textField2.setText("");
                    Text text1 = new Text("Gender is not selected!");
                    text1.setX(100);
                    text1.setY(30);
                    Image image0 = new Image(new File("C:\\Users\\Zhandos\\IdeaProjects\\Project2\\src\\main\\java\\com\\example\\project2\\Новая папка\\ezgif-1-a62d9945a0.jpg").toURI().toString());
                    ImageView imageView0 = new ImageView(image0);
                    imageView0.setX(30);
                    imageView0.setY(20);
                    imageView0.setFitHeight(50);
                    imageView0.setFitWidth(60);
                    Button button1 = new Button();
                    button1.setText("OK");
                    button1.setLayoutX(425);
                    button1.setLayoutY(90);
                    button1.setMinWidth(60);
                    Pane pane = new Pane(button1, text1, imageView0);
                    Scene scene1 = new Scene(pane, 500, 120);
                    Stage stage = new Stage();
                    stage.setY(500);
                    stage.setX(525);
                    stage.setTitle("Error");
                    stage.setScene(scene1);
                    stage.show();
                    button1.setOnAction(event1 -> {
                        stage.close();
                    });
                }
                if(textField.getText().length() == 0){
                    Text text1 = new Text(262,190,"Username is Empty");
                    text1.setFill(Color.WHITE);
                    borderPane.getChildren().add(text1);
                }if(textField1.getText().length() == 0){
                    Text text2 = new Text(262,236,"Password is Empty");
                    text2.setFill(Color.WHITE);
                    borderPane.getChildren().add(text2);
                }
                if(textField.getText().length() == 0 && textField1.getText().length() == 0){
                    Text text1 = new Text(262,190,"Username is Empty");
                    text1.setFill(Color.WHITE);
                    Text text2 = new Text(262,236,"Password is Empty");
                    text2.setFill(Color.WHITE);
                    borderPane.getChildren().addAll(text1,text2);
                }
                else if(textField.getText().equals(textField1.getText())){
                    logic();
                }File file = new File("sign.txt");
                try {
                    Scanner scanner = new Scanner(file);
                    while (scanner.hasNext()) {
                        if(textField2.getText().equals(scanner.next())){
                            mailMatched();
                            a++;
                            break;
                        }
                    }
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                }
                try {
                    readFile();
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                }if(textField2.getText().isEmpty()){
                    Text text3 = new Text(267,320,"Email is Empty!");
                    text3.setFill(Color.WHITE);
                    borderPane.getChildren().add(text3);
                }
                if(!textField2.getText().contains("@")){
                    textField.setText("");
                    textField1.setText("");
                    textField2.setText("");
                    Text text1 = new Text("Email should be contains '@'!");
                    text1.setX(100);
                    text1.setY(30);
                    Image image0 = new Image(new File("C:\\Users\\Zhandos\\IdeaProjects\\Project2\\src\\main\\java\\com\\example\\project2\\Новая папка\\ezgif-1-a62d9945a0.jpg").toURI().toString());
                    ImageView imageView0 = new ImageView(image0);
                    imageView0.setX(30);
                    imageView0.setY(20);
                    imageView0.setFitHeight(50);
                    imageView0.setFitWidth(60);
                    Button button1 = new Button();
                    button1.setText("OK");
                    button1.setLayoutX(425);
                    button1.setLayoutY(90);
                    button1.setMinWidth(60);
                    Pane pane = new Pane(button1, text1, imageView0);
                    Scene scene1 = new Scene(pane, 500, 120);
                    Stage stage = new Stage();
                    stage.setY(500);
                    stage.setX(525);
                    stage.setTitle("Error");
                    stage.setScene(scene1);
                    stage.show();
                    button1.setOnAction(event1 -> {
                        stage.close();
                    });
                }
                if (textField.getText().length() < 9 && textField1.getText().length() < 9 && !textField2.getText().isEmpty() && a != 1 && !textField.getText().equals("") && !textField1.getText().equals("") && !textField.getText().equals(textField1.getText())) {
                    if(radioButton.isSelected() || radioButton1.isSelected()){
                    try {
                        addData();
                        borderPane.setBottom(progressBar);
                        progressBar.setVisible(true);
                        timeline.play();
                        timeline.setOnFinished(event1 -> {
                            System.out.println("Account created succesful!");
                            primaryStage.close();
                            Project dragDropPractice = new Project();
                            try {
                                dragDropPractice.start(primaryStage);
                            } catch (IOException e) {
                                throw new RuntimeException(e);
                            }
                        });
                    }catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    }
                } else if (a != 1 && !textField.getText().equals(textField1.getText()) && !textField2.getText().isEmpty()) {
                    ErrorPage errorPage = new ErrorPage();
                    try {
                        errorPage.start(new Stage(primaryStage.getStyle()));
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                }
            });

            Scene scene = new Scene(borderPane,600,450);
            primaryStage.setScene(scene);
            primaryStage.setTitle("Project #2");
            primaryStage.show();
        }
        void mailMatched() throws FileNotFoundException {
            textField.setText("");
            textField1.setText("");
            textField2.setText("");
            Text text1 = new Text("Email mathced");
            text1.setX(100);
            text1.setY(30);
            Image image1 = new Image(new File("C:\\Users\\Zhandos\\IdeaProjects\\Project2\\src\\main\\java\\com\\example\\project2\\Новая папка\\ezgif-1-a62d9945a0.jpg").toURI().toString());
            ImageView imageView1 = new ImageView(image1);
            imageView1.setX(30);
            imageView1.setY(20);
            imageView1.setFitHeight(50);
            imageView1.setFitWidth(60);
            Button button1 = new Button();
            button1.setText("OK");
            button1.setLayoutX(425);
            button1.setLayoutY(90);
            button1.setMinWidth(60);
            Pane pane = new Pane(button1, text1, imageView1);
            Scene scene1 = new Scene(pane, 500, 120);
            Stage stage = new Stage();
            stage.setY(500);
            stage.setX(525);
            stage.setTitle("Error");
            stage.setScene(scene1);
            stage.show();
            button1.setOnAction(event1 -> {
                stage.close();
            });
        }
        void createFolder() throws IOException {
            t = textField.getText();
            t1 = textField1.getText();
            mail = textField2.getText();
            File sign = new File("sign.txt");
            PrintWriter out = new PrintWriter(new FileWriter(sign, true));
            sign.createNewFile();
            out.append(t + " ");
            sign.createNewFile();
            out.append(t1 + " ");
            sign.createNewFile();
            out.append(mail + "\n");
            out.close();
        }
        void readFile() throws FileNotFoundException {
            File file = new File("sign.txt");
            Scanner scanner = new Scanner(file);
            a = 0;
            while (scanner.hasNext()) {
                if(textField.getText().equals(scanner.next())){
                checkData();
                a++;
                }
                break;
            }
        }void addData() throws IOException {
            t = textField.getText();
            t1 = textField1.getText();
            mail = textField2.getText();
            File sign = new File("sign.txt");
            PrintWriter out = new PrintWriter(new FileWriter(sign, true));
            sign.createNewFile();
            out.append(t + " ");
            sign.createNewFile();
            out.append(t1 + " ");
            sign.createNewFile();
            out.append(mail + "\n");
            out.close();
        }
        void logic(){
            textField.setText("");
            textField1.setText("");
            Text text1 = new Text("Password mathced");
            text1.setX(100);
            text1.setY(30);
            Image image1 = new Image(new File("C:\\Users\\Zhandos\\IdeaProjects\\Project2\\src\\main\\java\\com\\example\\project2\\Новая папка\\ezgif-1-a62d9945a0.jpg").toURI().toString());
            ImageView imageView1 = new ImageView(image1);
            imageView1.setX(30);
            imageView1.setY(20);
            imageView1.setFitHeight(50);
            imageView1.setFitWidth(60);
            Button button1 = new Button();
            button1.setText("OK");
            button1.setLayoutX(425);
            button1.setLayoutY(90);
            button1.setMinWidth(60);
            Pane pane = new Pane(button1,text1,imageView1);
            Scene scene1 = new Scene(pane,500,120);
            Stage stage = new Stage();
            stage.setY(500);
            stage.setX(525);
            stage.setTitle("Error");
            stage.setScene(scene1);
            stage.show();
            button1.setOnAction(event1 -> {
                stage.close();
            });
        }
        void checkData(){
            Text text1 = new Text("Username mathced");
            text1.setX(100);
            text1.setY(30);
            Image image1 = new Image(new File("C:\\Users\\Zhandos\\IdeaProjects\\Project2\\src\\main\\java\\com\\example\\project2\\Новая папка\\ezgif-1-a62d9945a0.jpg").toURI().toString());
            ImageView imageView1 = new ImageView(image1);
            imageView1.setX(30);
            imageView1.setY(20);
            imageView1.setFitHeight(50);
            imageView1.setFitWidth(60);
            Button button1 = new Button();
            button1.setText("OK");
            button1.setLayoutX(425);
            button1.setLayoutY(90);
            button1.setMinWidth(60);
            Pane pane = new Pane(button1,text1,imageView1);
            Scene scene1 = new Scene(pane,500,120);
            Stage stage = new Stage();
            stage.setY(500);
            stage.setX(525);
            stage.setTitle("Error");
            stage.setScene(scene1);
            stage.show();
            button1.setOnAction(event1 -> {
                stage.close();
            });
        }
    }

class NewsPage extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception {
        Image image1 = new Image(new File("C:\\Users\\Zhandos\\IdeaProjects\\Project2\\src\\main\\java\\com\\example\\project2\\Новая папка\\ezgif-3-30541cf074.jpg").toURI().toString());
        ImageView imageView1 = new ImageView(image1);
        imageView1.setFitWidth(80);
        imageView1.setFitHeight(80);

        Text text1 = new Text("Here you can see the news!");
        text1.setFont(Font.font("Serif",FontWeight.BOLD,FontPosture.REGULAR,15));
        text1.setFill(Color.WHITE);

        Button tech = new Button();
        tech.setText("Technology");
        tech.setTextFill(Color.BLACK);
        tech.setStyle("-fx-background-color: YELLOW");
        tech.setPadding(new Insets(5,11,5,11));

        Button spo = new Button();
        spo.setText("Sports");
        spo.setTextFill(Color.BLACK);
        spo.setStyle("-fx-background-color: YELLOW");
        spo.setPadding(new Insets(5,25.1,5,25.1));

        Button bus = new Button();
        bus.setTextFill(Color.BLACK);
        bus.setStyle("-fx-background-color: YELLOW");
        bus.setText("Business");
        bus.setPadding(new Insets(5,20,5,20));

        Button eco = new Button();
        eco.setTextFill(Color.BLACK);
        eco.setStyle("-fx-background-color: YELLOW");
        eco.setText("Economy");
        eco.setPadding(new Insets(5,18,5,18));

        Text text11 = new Text();
        text11.setText("");

        Text text12 = new Text();
        text12.setText("");

        Text text4 = new Text();
        text4.setText("");

        Button contact = new Button();
        contact.setText("CONTACT US");
        contact.setTextFill(Color.WHITE);
        contact.setAlignment(Pos.BOTTOM_CENTER);

        Button back = new Button("BACK");

        VBox vBox1 = new VBox(10);
        vBox1.setStyle("-fx-background-color: SKYBLUE");
        vBox1.getChildren().addAll(back,imageView1,text1,tech,spo,bus,eco,text11,text12,text4,contact);
        vBox1.setPadding(new Insets(30));

        BorderPane borderPane = new BorderPane();
        borderPane.setLeft(vBox1);

        Image image5 = new Image(new File("C:\\Users\\Zhandos\\IdeaProjects\\Project2\\src\\main\\java\\com\\example\\project2\\Новая папка\\технология.jpg").toURI().toString());
        Image image2 = new Image(new File("C:\\Users\\Zhandos\\IdeaProjects\\Project2\\src\\main\\java\\com\\example\\project2\\Новая папка\\спорт.jpg").toURI().toString());
        Image image3 = new Image(new File("C:\\Users\\Zhandos\\IdeaProjects\\Project2\\src\\main\\java\\com\\example\\project2\\Новая папка\\бизнес.jpg").toURI().toString());
        Image image4 = new Image(new File("C:\\Users\\Zhandos\\IdeaProjects\\Project2\\src\\main\\java\\com\\example\\project2\\Новая папка\\экономика.jpg").toURI().toString());

        ImageView imageView2 = new ImageView(image5);
        ImageView imageView3 = new ImageView(image2);
        ImageView imageView4 = new ImageView(image3);
        ImageView imageView5 = new ImageView(image4);
        imageView2.setFitHeight(175);
        imageView2.setFitWidth(175);
        imageView2.setX(250);
        imageView2.setY(30);
        imageView3.setFitHeight(175);
        imageView3.setFitWidth(175);
        imageView3.setX(430);
        imageView3.setY(30);
        imageView4.setFitHeight(175);
        imageView4.setFitWidth(175);
        imageView4.setX(250);
        imageView4.setY(210);
        imageView5.setFitHeight(175);
        imageView5.setFitWidth(175);
        imageView5.setX(430);
        imageView5.setY(210);

        Pane pane = new Pane();
        tech.setOnAction(event1 -> {
            Text text5 = new Text("                                             Technology news");
            text5.setFont(Font.font("Serif", FontWeight.BOLD, FontPosture.REGULAR,20));
            text5.setFill(Color.WHITE);

            Button button = new Button();
            button.setStyle("-fx-background-color: YELLOW");
            button.setText("Biotechnology");
            button.setPadding(new Insets(5,50,5,50));

            Button button1 = new Button();
            button1.setStyle("-fx-background-color: YELLOW");
            button1.setText("Artifical Intelligence");
            button1.setPadding(new Insets(5,36.2,5,36.2));

            Button button2 = new Button();
            button2.setStyle("-fx-background-color: YELLOW");
            button2.setText("Audio and visual technology");
            button2.setPadding(new Insets(5,13.3,5,13.3));

            Button button3 = new Button();
            button3.setStyle("-fx-background-color: YELLOW");
            button3.setText("Internet");
            button3.setPadding(new Insets(5,67.5,5,67.5));

            Button button4 = new Button();
            button4.setStyle("-fx-background-color: YELLOW");
            button4.setText("Computers");
            button4.setPadding(new Insets(5,59,5,59));

            Image image6 = new Image(new File("C:\\Users\\Zhandos\\IdeaProjects\\Project2\\src\\main\\java\\com\\example\\project2\\Новая папка\\технология.jpg").toURI().toString());
            ImageView imageView6 = new ImageView(image6);
            imageView6.setFitWidth(615);
            imageView6.setFitHeight(450);

            TextArea textArea = new TextArea();
            textArea.setPromptText("News");
            textArea.setMinWidth(575);
            textArea.setMinHeight(200);

            VBox vBox3 = new VBox(10);
            vBox3.getChildren().addAll(text5,button,button1,button2,button3,button4,textArea);
            vBox3.setPadding(new Insets(0,0,0,20));

            Pane pane1 = new Pane(imageView6,vBox3);

            button.setOnAction(event2 -> {
                textArea.setText("");
                Image image7 = new Image(new File("C:\\Users\\Zhandos\\IdeaProjects\\Project2\\src\\main\\java\\com\\example\\project2\\Новая папка\\biotechnology.jpg").toURI().toString());
                ImageView imageView7 = new ImageView(image7);
                imageView7.setFitHeight(180);
                imageView7.setFitWidth(388);
                imageView7.setX(205);
                imageView7.setY(32);
                pane1.getChildren().add(imageView7);
                textArea.appendText(" Induced pluripotent stem cells offer great therapeutic potential and are a valuable tool for understanding \n" +
                        " how different diseases develop. New research shows that such stem cell lines should be regularly screened \n" +
                        " for genetic mutations to ensure the accuracy of the disease models.");
            });
            button1.setOnAction(event2 -> {
                textArea.setText("");
                Image image7 = new Image(new File("C:\\Users\\Zhandos\\IdeaProjects\\Project2\\src\\main\\java\\com\\example\\project2\\Новая папка\\AI.jpg").toURI().toString());
                ImageView imageView7 = new ImageView(image7);
                imageView7.setFitHeight(180);
                imageView7.setFitWidth(388);
                imageView7.setX(205);
                imageView7.setY(32);
                pane1.getChildren().add(imageView7);
                textArea.appendText(" Like the EU’s General Data Protection Regulation (GDPR) released in 2018, the EU AI Act is expected \n" +
                        " to become a global standard for AI regulation. Parliament is scheduled to vote on the draft by the \n" +
                        " end of March 2023, and if this timeline is met, the final AI Act could be adopted by the end of the year. \n" +
                        " It’s highly predicted that the effects of the AI Act will be felt beyond the EU’s borders \n" +
                        " (read: Brussels effect), albeit it being European regulation. Organizations operating on an\n" +
                        " international scale will be required to directly conform to the legislation. Meanwhile, US \n" +
                        " and other independently-led companies will quickly realize that it’s in their best interest \n" +
                        " to comply with this regulation.");
            });
            button2.setOnAction(event2 -> {
                textArea.setText("");
                Image image7 = new Image(new File("C:\\Users\\Zhandos\\IdeaProjects\\Project2\\src\\main\\java\\com\\example\\project2\\Новая папка\\AV.jpg").toURI().toString());
                ImageView imageView7 = new ImageView(image7);
                imageView7.setFitHeight(180);
                imageView7.setFitWidth(388);
                imageView7.setX(205);
                imageView7.setY(32);
                pane1.getChildren().add(imageView7);
                textArea.appendText(" Audio-visual technology is all around us. From our entertainment systems to our workplaces, AV systems \n" +
                        " really do make the world go round; but what exactly is it, and what’s next for the AV industry? \n" +
                        " If you’re unsure how to answer either of those questions, you’ve come to the right place. We \n " +
                        " appreciate how important it is to be clued up on all things AV before you invest in any expensive \n" +
                        " systems. So, we’ve created this guide to AV technology to help you understand exactly what you’re \n" +
                        " dealing with before you buy. In this article, we discuss AV technology alongside its most basic \n " +
                        " equipment, including a guide to the future of the AV industry and how you can select the right \n " +
                        " systems for your project.");
            });
            button3.setOnAction(event2 -> {
                textArea.setText("");
                Image image7 = new Image(new File("C:\\Users\\Zhandos\\IdeaProjects\\Project2\\src\\main\\java\\com\\example\\project2\\Новая папка\\internet.jpg").toURI().toString());
                ImageView imageView7 = new ImageView(image7);
                imageView7.setFitHeight(180);
                imageView7.setFitWidth(388);
                imageView7.setX(205);
                imageView7.setY(32);
                pane1.getChildren().add(imageView7);
                textArea.appendText(" For instance, allowing parents to read their kids' private messages may be harmful to some children, and \n" +
                        " age verification requirements could give tech companies access to kids' personal information, including \n" +
                        " biometric data, if they use tools such as facial recognition to check ages.Children may be put at increased \n" +
                        " risk if these laws are enforced in such a way that they're not allowed to some privacy, if they are not \n" +
                        " allowed some ability for freedom of speech or autonomy, said Kris Perry, executive director of the nonprofit \n" +
                        " Children and Screens: Institute of Digital Media and Child Development.");
            });
            button4.setOnAction(event2 -> {
                textArea.setText("");
                Image image7 = new Image(new File("C:\\Users\\Zhandos\\IdeaProjects\\Project2\\src\\main\\java\\com\\example\\project2\\Новая папка\\computers.jpg").toURI().toString());
                ImageView imageView7 = new ImageView(image7);
                imageView7.setFitHeight(180);
                imageView7.setFitWidth(388);
                imageView7.setX(205);
                imageView7.setY(32);
                pane1.getChildren().add(imageView7);
                textArea.appendText("Intel co-founder Gordon Moore, a pioneer in the semiconductor industry whose “Moore’s Law” predicted \n" +
                        " a steady rise in computing power for decades, died Friday at the age of 94, the company announced. \n" +
                        " Intel (INTC) and Moore’s family philanthropic foundation said he died surrounded by family at his home \n" +
                        " in Hawaii.Co-launching Intel in 1968, Moore was the rolled-up-sleeves engineer within a triumvirate of \n" +
                        " technology luminaries that eventually put “Intel Inside” processors in more than 80% of the world’s \n" +
                        " personal computers.In an article he wrote in 1965, Moore observed that, thanks to improvements in \n" +
                        " technology, the number of transistors on microchips had roughly doubled every year since integrated \n" +
                        " circuits were invented a few years before. His prediction that the trend would continue became known \n" +
                        " as “Moore’s Law” and, later amended to every two years, it helped push Intel and rival chipmakers to \n" +
                        " aggressively target their research and development resources to make sure that rule of thumb came true.");
            });

            Scene scene = new Scene(pane1,615,450);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("");
            stage.show();
        });
        spo.setOnAction(event1 -> {
            Text text5 = new Text("                                                 Sport news");
            text5.setFont(Font.font("Serif", FontWeight.BOLD, FontPosture.REGULAR,20));
            text5.setFill(Color.WHITE);

            Button button = new Button();
            button.setStyle("-fx-background-color: YELLOW");
            button.setText("Football");
            button.setPadding(new Insets(5,63.5,5,63.5));

            Button button1 = new Button();
            button1.setStyle("-fx-background-color: YELLOW");
            button1.setText("Tennis");
            button1.setPadding(new Insets(5,68,5,68));

            Button button2 = new Button();
            button2.setStyle("-fx-background-color: YELLOW");
            button2.setText("Basketball");
            button2.setPadding(new Insets(5,58,5,58));

            Button button3 = new Button();
            button3.setStyle("-fx-background-color: YELLOW");
            button3.setText("Box");
            button3.setPadding(new Insets(5,75,5,75));

            Button button4 = new Button();
            button4.setStyle("-fx-background-color: YELLOW");
            button4.setText("Volleyball");
            button4.setPadding(new Insets(5,59,5,59));

            Image image6 = new Image(new File("C:\\Users\\Zhandos\\IdeaProjects\\Project2\\src\\main\\java\\com\\example\\project2\\Новая папка\\спорт.jpg").toURI().toString());
            ImageView imageView6 = new ImageView(image6);
            imageView6.setFitWidth(615);
            imageView6.setFitHeight(450);

            TextArea textArea = new TextArea();
            textArea.setPromptText("News");
            textArea.setMinWidth(575);
            textArea.setMinHeight(200);

            VBox vBox3 = new VBox(10);
            vBox3.getChildren().addAll(text5,button,button1,button2,button3,button4,textArea);
            vBox3.setPadding(new Insets(0,0,0,20));

            Pane pane1 = new Pane(imageView6,vBox3);

            button.setOnAction(event2 -> {
                textArea.setText("");
                Image image7 = new Image(new File("C:\\Users\\Zhandos\\IdeaProjects\\Project2\\src\\main\\java\\com\\example\\project2\\Новая папка\\football.jpg").toURI().toString());
                ImageView imageView7 = new ImageView(image7);
                imageView7.setFitHeight(180);
                imageView7.setFitWidth(388);
                imageView7.setX(205);
                imageView7.setY(32);
                pane1.getChildren().add(imageView7);
                textArea.appendText(" Kazakhstan scored twice late on as they came back from two goals down to stun Denmark in their Euro 2024 qualifier.\n" +
                        " Rasmus Hojlund, who scored a hat-trick against Finland on Thursday, scored twice in the first half to put the Danes in control.\n" +
                        " Bakhtiyar Zaynutdinov got one back from the penalty spot in the 73rd minute.Askhat Tagybergen and Abat Aymbetov \n" +
                        " then scored two goals in three minutes to put Kazakhstan ahead with a minute of normal time remaining.\n" +
                        " Aymbetov was sent off deep in stoppage time for a second bookable offence but Kazakhstan held on for a hugely \n" +
                        " impressive win against a side that played at last year's World Cup.");
            });
            button1.setOnAction(event2 -> {
                textArea.setText("");
                Image image7 = new Image(new File("C:\\Users\\Zhandos\\IdeaProjects\\Project2\\src\\main\\java\\com\\example\\project2\\Новая папка\\tennis.jpg").toURI().toString());
                ImageView imageView7 = new ImageView(image7);
                imageView7.setFitHeight(180);
                imageView7.setFitWidth(388);
                imageView7.setX(205);
                imageView7.setY(32);
                pane1.getChildren().add(imageView7);
                textArea.appendText(" Carlos Alcaraz continued his ‘Sunshine Double’ quest in style Sunday, overcoming Dusan Lajovic 6-0, 7-6(5) \n" +
                        " to reach the fourth round at the Miami Open presented by Itau.Arriving off his title run in Indian Wells,\n" +
                        " the World No. 1 has quickly adapted to the faster conditions in Miami,where he is the defending champion.\n" +
                        " In a high-quality performance, the top seed overpowered Lajovic with his relentless aggression on return \n" +
                        " and he demonstrated incredible agility to cover the court and repel attacks from the Serbian.The Spaniard,\n" +
                        " who hit 27 winners to Lajovic's eight, recovered from failing to serve out the match at 5-4 in the second \n" +
                        " set against Lajovic, recomposing himself to seal his eighth consecutive straight-sets win on his fourth match\n" +
                        " point in one hour and 31 minutes. I feel fast on court, I am moving well, said Alcaraz, who is now 16-1 on \n" +
                        " the season. \"I am happy with the variety I am playing [with]. Lots of shots. I am enjoying every single \n" +
                        " second out there.");
            });
            button2.setOnAction(event2 -> {
                textArea.setText("");
                Image image7 = new Image(new File("C:\\Users\\Zhandos\\IdeaProjects\\Project2\\src\\main\\java\\com\\example\\project2\\Новая папка\\basketball.jpg").toURI().toString());
                ImageView imageView7 = new ImageView(image7);
                imageView7.setFitHeight(180);
                imageView7.setFitWidth(388);
                imageView7.setX(205);
                imageView7.setY(32);
                pane1.getChildren().add(imageView7);
                textArea.appendText("Iowa is headed to the Final Four of the women’s N.C.A.A. tournament for the second time in program history after Caitlin \n" +
                        " Clark led an offensive assault on fifth-seeded Louisville in a 97-83 win.An offensive assault is, \n" +
                        " perhaps, an understatement. Clark finished with 41 points, 10 rebounds and 12 assists, the first 40-point \n" +
                        " triple-double in any N.C.A.A. tournament game, men’s or women’s.Even when the Cardinals shrunk Iowa’s \n" +
                        " lead at moments, the question became less about which team would advance to the national semifinals on \n " +
                        " Friday in Dallas and more about what else Clark might accomplish in her spectacle on the floor.");
            });
            button3.setOnAction(event2 -> {
                textArea.setText("");
                Image image7 = new Image(new File("C:\\Users\\Zhandos\\IdeaProjects\\Project2\\src\\main\\java\\com\\example\\project2\\Новая папка\\box.jpg").toURI().toString());
                ImageView imageView7 = new ImageView(image7);
                imageView7.setFitHeight(180);
                imageView7.setFitWidth(388);
                imageView7.setX(205);
                imageView7.setY(32);
                pane1.getChildren().add(imageView7);
                textArea.appendText(" For instance, allowing parents to read their kids' private messages may be harmful to some children, and \n" +
                        " age verification requirements could give tech companies access to kids' personal information, including \n" +
                        " biometric data, if they use tools such as facial recognition to check ages.Children may be put at increased \n" +
                        " risk if these laws are enforced in such a way that they're not allowed to some privacy, if they are not \n" +
                        " allowed some ability for freedom of speech or autonomy, said Kris Perry, executive director of the nonprofit \n" +
                        " Children and Screens: Institute of Digital Media and Child Development.");
            });
            button4.setOnAction(event2 -> {
                textArea.setText("");
                Image image7 = new Image(new File("C:\\Users\\Zhandos\\IdeaProjects\\Project2\\src\\main\\java\\com\\example\\project2\\Новая папка\\volleyball.jpg").toURI().toString());
                ImageView imageView7 = new ImageView(image7);
                imageView7.setFitHeight(180);
                imageView7.setFitWidth(388);
                imageView7.setX(205);
                imageView7.setY(32);
                pane1.getChildren().add(imageView7);
                textArea.appendText("Intel co-founder Gordon Moore, a pioneer in the semiconductor industry whose “Moore’s Law” predicted \n" +
                        " a steady rise in computing power for decades, died Friday at the age of 94, the company announced. \n" +
                        " Intel (INTC) and Moore’s family philanthropic foundation said he died surrounded by family at his home \n" +
                        " in Hawaii.Co-launching Intel in 1968, Moore was the rolled-up-sleeves engineer within a triumvirate of \n" +
                        " technology luminaries that eventually put “Intel Inside” processors in more than 80% of the world’s \n" +
                        " personal computers.In an article he wrote in 1965, Moore observed that, thanks to improvements in \n" +
                        " technology, the number of transistors on microchips had roughly doubled every year since integrated \n" +
                        " circuits were invented a few years before. His prediction that the trend would continue became known \n" +
                        " as “Moore’s Law” and, later amended to every two years, it helped push Intel and rival chipmakers to \n" +
                        " aggressively target their research and development resources to make sure that rule of thumb came true.");
            });

            Scene scene = new Scene(pane1,615,450);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("");
            stage.show();
        });
        bus.setOnAction(event1 -> {
            Text text5 = new Text("                                             Business news");
            text5.setFont(Font.font("Serif", FontWeight.BOLD, FontPosture.REGULAR,20));
            text5.setFill(Color.WHITE);

            Button button = new Button();
            button.setStyle("-fx-background-color: YELLOW");
            button.setText("Biotechnology");
            button.setPadding(new Insets(5,50,5,50));

            Button button1 = new Button();
            button1.setStyle("-fx-background-color: YELLOW");
            button1.setText("Artifical Intelligence");
            button1.setPadding(new Insets(5,36.2,5,36.2));

            Button button2 = new Button();
            button2.setStyle("-fx-background-color: YELLOW");
            button2.setText("Audio and visual technology");
            button2.setPadding(new Insets(5,13.3,5,13.3));

            Button button3 = new Button();
            button3.setStyle("-fx-background-color: YELLOW");
            button3.setText("Internet");
            button3.setPadding(new Insets(5,67.5,5,67.5));

            Button button4 = new Button();
            button4.setStyle("-fx-background-color: YELLOW");
            button4.setText("Computers");
            button4.setPadding(new Insets(5,59,5,59));

            Image image6 = new Image(new File("C:\\Users\\Zhandos\\IdeaProjects\\Project2\\src\\main\\java\\com\\example\\project2\\Новая папка\\бизнес.jpg").toURI().toString());
            ImageView imageView6 = new ImageView(image6);
            imageView6.setFitWidth(615);
            imageView6.setFitHeight(450);

            TextArea textArea = new TextArea();
            textArea.setPromptText("News");
            textArea.setMinWidth(575);
            textArea.setMinHeight(200);

            VBox vBox3 = new VBox(10);
            vBox3.getChildren().addAll(text5,button,button1,button2,button3,button4,textArea);
            vBox3.setPadding(new Insets(0,0,0,20));

            Pane pane1 = new Pane(imageView6,vBox3);

            button.setOnAction(event2 -> {
                textArea.setText("");
                Image image7 = new Image(new File("C:\\Users\\Zhandos\\IdeaProjects\\Project2\\src\\main\\java\\com\\example\\project2\\Новая папка\\biotechnology.jpg").toURI().toString());
                ImageView imageView7 = new ImageView(image7);
                imageView7.setFitHeight(180);
                imageView7.setFitWidth(388);
                imageView7.setX(205);
                imageView7.setY(32);
                pane1.getChildren().add(imageView7);
                textArea.appendText(" Induced pluripotent stem cells offer great therapeutic potential and are a valuable tool for understanding \n" +
                        " how different diseases develop. New research shows that such stem cell lines should be regularly screened \n" +
                        " for genetic mutations to ensure the accuracy of the disease models.");
            });
            button1.setOnAction(event2 -> {
                textArea.setText("");
                Image image7 = new Image(new File("C:\\Users\\Zhandos\\IdeaProjects\\Project2\\src\\main\\java\\com\\example\\project2\\Новая папка\\AI.jpg").toURI().toString());
                ImageView imageView7 = new ImageView(image7);
                imageView7.setFitHeight(180);
                imageView7.setFitWidth(388);
                imageView7.setX(205);
                imageView7.setY(32);
                pane1.getChildren().add(imageView7);
                textArea.appendText(" Like the EU’s General Data Protection Regulation (GDPR) released in 2018, the EU AI Act is expected \n" +
                        " to become a global standard for AI regulation. Parliament is scheduled to vote on the draft by the \n" +
                        " end of March 2023, and if this timeline is met, the final AI Act could be adopted by the end of the year. \n" +
                        " It’s highly predicted that the effects of the AI Act will be felt beyond the EU’s borders \n" +
                        " (read: Brussels effect), albeit it being European regulation. Organizations operating on an\n" +
                        " international scale will be required to directly conform to the legislation. Meanwhile, US \n" +
                        " and other independently-led companies will quickly realize that it’s in their best interest \n" +
                        " to comply with this regulation.");
            });
            button2.setOnAction(event2 -> {
                textArea.setText("");
                Image image7 = new Image(new File("C:\\Users\\Zhandos\\IdeaProjects\\Project2\\src\\main\\java\\com\\example\\project2\\Новая папка\\AV.jpg").toURI().toString());
                ImageView imageView7 = new ImageView(image7);
                imageView7.setFitHeight(180);
                imageView7.setFitWidth(388);
                imageView7.setX(205);
                imageView7.setY(32);
                pane1.getChildren().add(imageView7);
                textArea.appendText(" Audio-visual technology is all around us. From our entertainment systems to our workplaces, AV systems \n" +
                        " really do make the world go round; but what exactly is it, and what’s next for the AV industry? \n" +
                        " If you’re unsure how to answer either of those questions, you’ve come to the right place. We \n " +
                        " appreciate how important it is to be clued up on all things AV before you invest in any expensive \n" +
                        " systems. So, we’ve created this guide to AV technology to help you understand exactly what you’re \n" +
                        " dealing with before you buy. In this article, we discuss AV technology alongside its most basic \n " +
                        " equipment, including a guide to the future of the AV industry and how you can select the right \n " +
                        " systems for your project.");
            });
            button3.setOnAction(event2 -> {
                textArea.setText("");
                Image image7 = new Image(new File("C:\\Users\\Zhandos\\IdeaProjects\\Project2\\src\\main\\java\\com\\example\\project2\\Новая папка\\internet.jpg").toURI().toString());
                ImageView imageView7 = new ImageView(image7);
                imageView7.setFitHeight(180);
                imageView7.setFitWidth(388);
                imageView7.setX(205);
                imageView7.setY(32);
                pane1.getChildren().add(imageView7);
                textArea.appendText(" For instance, allowing parents to read their kids' private messages may be harmful to some children, and \n" +
                        " age verification requirements could give tech companies access to kids' personal information, including \n" +
                        " biometric data, if they use tools such as facial recognition to check ages.Children may be put at increased \n" +
                        " risk if these laws are enforced in such a way that they're not allowed to some privacy, if they are not \n" +
                        " allowed some ability for freedom of speech or autonomy, said Kris Perry, executive director of the nonprofit \n" +
                        " Children and Screens: Institute of Digital Media and Child Development.");
            });
            button4.setOnAction(event2 -> {
                textArea.setText("");
                Image image7 = new Image(new File("C:\\Users\\Zhandos\\IdeaProjects\\Project2\\src\\main\\java\\com\\example\\project2\\Новая папка\\computers.jpg").toURI().toString());
                ImageView imageView7 = new ImageView(image7);
                imageView7.setFitHeight(180);
                imageView7.setFitWidth(388);
                imageView7.setX(205);
                imageView7.setY(32);
                pane1.getChildren().add(imageView7);
                textArea.appendText("Intel co-founder Gordon Moore, a pioneer in the semiconductor industry whose “Moore’s Law” predicted \n" +
                        " a steady rise in computing power for decades, died Friday at the age of 94, the company announced. \n" +
                        " Intel (INTC) and Moore’s family philanthropic foundation said he died surrounded by family at his home \n" +
                        " in Hawaii.Co-launching Intel in 1968, Moore was the rolled-up-sleeves engineer within a triumvirate of \n" +
                        " technology luminaries that eventually put “Intel Inside” processors in more than 80% of the world’s \n" +
                        " personal computers.In an article he wrote in 1965, Moore observed that, thanks to improvements in \n" +
                        " technology, the number of transistors on microchips had roughly doubled every year since integrated \n" +
                        " circuits were invented a few years before. His prediction that the trend would continue became known \n" +
                        " as “Moore’s Law” and, later amended to every two years, it helped push Intel and rival chipmakers to \n" +
                        " aggressively target their research and development resources to make sure that rule of thumb came true.");
            });

            Scene scene = new Scene(pane1,615,450);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("");
            stage.show();
        });
        eco.setOnAction(event1 -> {
            Text text5 = new Text("                                             Economy news");
            text5.setFont(Font.font("Serif", FontWeight.BOLD, FontPosture.REGULAR,20));
            text5.setFill(Color.WHITE);

            Button button = new Button();
            button.setStyle("-fx-background-color: YELLOW");
            button.setText("Biotechnology");
            button.setPadding(new Insets(5,50,5,50));

            Button button1 = new Button();
            button1.setStyle("-fx-background-color: YELLOW");
            button1.setText("Artifical Intelligence");
            button1.setPadding(new Insets(5,36.2,5,36.2));

            Button button2 = new Button();
            button2.setStyle("-fx-background-color: YELLOW");
            button2.setText("Audio and visual technology");
            button2.setPadding(new Insets(5,13.3,5,13.3));

            Button button3 = new Button();
            button3.setStyle("-fx-background-color: YELLOW");
            button3.setText("Internet");
            button3.setPadding(new Insets(5,67.5,5,67.5));

            Button button4 = new Button();
            button4.setStyle("-fx-background-color: YELLOW");
            button4.setText("Computers");
            button4.setPadding(new Insets(5,59,5,59));

            Image image6 = new Image(new File("C:\\Users\\Zhandos\\IdeaProjects\\Project2\\src\\main\\java\\com\\example\\project2\\Новая папка\\экономика.jpg").toURI().toString());
            ImageView imageView6 = new ImageView(image6);
            imageView6.setFitWidth(615);
            imageView6.setFitHeight(450);

            TextArea textArea = new TextArea();
            textArea.setPromptText("News");
            textArea.setMinWidth(575);
            textArea.setMinHeight(200);

            VBox vBox3 = new VBox(10);
            vBox3.getChildren().addAll(text5,button,button1,button2,button3,button4,textArea);
            vBox3.setPadding(new Insets(0,0,0,20));

            Pane pane1 = new Pane(imageView6,vBox3);

            button.setOnAction(event2 -> {
                textArea.setText("");
                Image image7 = new Image(new File("C:\\Users\\Zhandos\\IdeaProjects\\Project2\\src\\main\\java\\com\\example\\project2\\Новая папка\\biotechnology.jpg").toURI().toString());
                ImageView imageView7 = new ImageView(image7);
                imageView7.setFitHeight(180);
                imageView7.setFitWidth(388);
                imageView7.setX(205);
                imageView7.setY(32);
                pane1.getChildren().add(imageView7);
                textArea.appendText(" Induced pluripotent stem cells offer great therapeutic potential and are a valuable tool for understanding \n" +
                        " how different diseases develop. New research shows that such stem cell lines should be regularly screened \n" +
                        " for genetic mutations to ensure the accuracy of the disease models.");
            });
            button1.setOnAction(event2 -> {
                textArea.setText("");
                Image image7 = new Image(new File("C:\\Users\\Zhandos\\IdeaProjects\\Project2\\src\\main\\java\\com\\example\\project2\\Новая папка\\AI.jpg").toURI().toString());
                ImageView imageView7 = new ImageView(image7);
                imageView7.setFitHeight(180);
                imageView7.setFitWidth(388);
                imageView7.setX(205);
                imageView7.setY(32);
                pane1.getChildren().add(imageView7);
                textArea.appendText(" Like the EU’s General Data Protection Regulation (GDPR) released in 2018, the EU AI Act is expected \n" +
                        " to become a global standard for AI regulation. Parliament is scheduled to vote on the draft by the \n" +
                        " end of March 2023, and if this timeline is met, the final AI Act could be adopted by the end of the year. \n" +
                        " It’s highly predicted that the effects of the AI Act will be felt beyond the EU’s borders \n" +
                        " (read: Brussels effect), albeit it being European regulation. Organizations operating on an\n" +
                        " international scale will be required to directly conform to the legislation. Meanwhile, US \n" +
                        " and other independently-led companies will quickly realize that it’s in their best interest \n" +
                        " to comply with this regulation.");
            });
            button2.setOnAction(event2 -> {
                textArea.setText("");
                Image image7 = new Image(new File("C:\\Users\\Zhandos\\IdeaProjects\\Project2\\src\\main\\java\\com\\example\\project2\\Новая папка\\AV.jpg").toURI().toString());
                ImageView imageView7 = new ImageView(image7);
                imageView7.setFitHeight(180);
                imageView7.setFitWidth(388);
                imageView7.setX(205);
                imageView7.setY(32);
                pane1.getChildren().add(imageView7);
                textArea.appendText(" Audio-visual technology is all around us. From our entertainment systems to our workplaces, AV systems \n" +
                        " really do make the world go round; but what exactly is it, and what’s next for the AV industry? \n" +
                        " If you’re unsure how to answer either of those questions, you’ve come to the right place. We \n " +
                        " appreciate how important it is to be clued up on all things AV before you invest in any expensive \n" +
                        " systems. So, we’ve created this guide to AV technology to help you understand exactly what you’re \n" +
                        " dealing with before you buy. In this article, we discuss AV technology alongside its most basic \n " +
                        " equipment, including a guide to the future of the AV industry and how you can select the right \n " +
                        " systems for your project.");
            });
            button3.setOnAction(event2 -> {
                textArea.setText("");
                Image image7 = new Image(new File("C:\\Users\\Zhandos\\IdeaProjects\\Project2\\src\\main\\java\\com\\example\\project2\\Новая папка\\internet.jpg").toURI().toString());
                ImageView imageView7 = new ImageView(image7);
                imageView7.setFitHeight(180);
                imageView7.setFitWidth(388);
                imageView7.setX(205);
                imageView7.setY(32);
                pane1.getChildren().add(imageView7);
                textArea.appendText(" For instance, allowing parents to read their kids' private messages may be harmful to some children, and \n" +
                        " age verification requirements could give tech companies access to kids' personal information, including \n" +
                        " biometric data, if they use tools such as facial recognition to check ages.Children may be put at increased \n" +
                        " risk if these laws are enforced in such a way that they're not allowed to some privacy, if they are not \n" +
                        " allowed some ability for freedom of speech or autonomy, said Kris Perry, executive director of the nonprofit \n" +
                        " Children and Screens: Institute of Digital Media and Child Development.");
            });
            button4.setOnAction(event2 -> {
                textArea.setText("");
                Image image7 = new Image(new File("C:\\Users\\Zhandos\\IdeaProjects\\Project2\\src\\main\\java\\com\\example\\project2\\Новая папка\\computers.jpg").toURI().toString());
                ImageView imageView7 = new ImageView(image7);
                imageView7.setFitHeight(180);
                imageView7.setFitWidth(388);
                imageView7.setX(205);
                imageView7.setY(32);
                pane1.getChildren().add(imageView7);
                textArea.appendText("Intel co-founder Gordon Moore, a pioneer in the semiconductor industry whose “Moore’s Law” predicted \n" +
                        " a steady rise in computing power for decades, died Friday at the age of 94, the company announced. \n" +
                        " Intel (INTC) and Moore’s family philanthropic foundation said he died surrounded by family at his home \n" +
                        " in Hawaii.Co-launching Intel in 1968, Moore was the rolled-up-sleeves engineer within a triumvirate of \n" +
                        " technology luminaries that eventually put “Intel Inside” processors in more than 80% of the world’s \n" +
                        " personal computers.In an article he wrote in 1965, Moore observed that, thanks to improvements in \n" +
                        " technology, the number of transistors on microchips had roughly doubled every year since integrated \n" +
                        " circuits were invented a few years before. His prediction that the trend would continue became known \n" +
                        " as “Moore’s Law” and, later amended to every two years, it helped push Intel and rival chipmakers to \n" +
                        " aggressively target their research and development resources to make sure that rule of thumb came true.");
            });

            Scene scene = new Scene(pane1,615,450);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("");
            stage.show();
        });
        pane.getChildren().addAll(borderPane,imageView2,imageView3,imageView4,imageView5);
        Scene scene = new Scene(pane,615,450);
        primaryStage.setScene(scene);
        primaryStage.setTitle("");
        primaryStage.show();
        back.setOnAction(event1 -> {
            primaryStage.close();
        });
    }
}

class AdminPage extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception {
        Button login11 = new Button("Login");

        TextField adminLogin = new TextField();
        adminLogin.setPromptText("Email");

        PasswordField adminPassword = new PasswordField();
        adminPassword.setPromptText("Password");

        String[] info = new String[2];
        info[0] = "220103393@stu.sdu.edu.kz";
        info[1] = "zhandos04";

        DropShadow dropShadow = new DropShadow();
        dropShadow.setOffsetY(8.0);

        Text q = new Text("");
        Text w = new Text("");
        Text y = new Text("");
        Text u = new Text("");
        Text text11 = new Text();
        text11.setText("                           ADMIN LOGIN PAGE");
        text11.setFont(Font.font("Serif", FontWeight.BOLD, FontPosture.REGULAR,25));
        text11.setFill(Color.WHITE);
        text11.setEffect(dropShadow);

        VBox f = new VBox(q,w,y,u,text11);

        VBox vBox11 = new VBox(30);
        vBox11.setAlignment(Pos.CENTER);
        vBox11.getChildren().addAll(adminLogin,adminPassword,login11);
        vBox11.setPadding(new Insets(5,200,50,200));

        BorderPane borderPane20 = new BorderPane();
        borderPane20.setStyle("-fx-background-color: #03045E");
        borderPane20.setTop(f);
        borderPane20.setCenter(vBox11);

        ProgressBar progressBar = new ProgressBar();
        progressBar.setPadding(new Insets(0,-260,40,260));
        progressBar.setVisible(false);
        Timeline timeline = new Timeline(
                new KeyFrame(Duration.ZERO,new KeyValue(progressBar.progressProperty(),0)),new KeyFrame(Duration.seconds(2),new KeyValue(progressBar.progressProperty(),1))
        );

        login11.setOnAction(event -> {
            if(adminLogin.getText().equals(info[0]) && adminPassword.getText().equals(info[1])){
                borderPane20.setBottom(progressBar);
                progressBar.setVisible(true);
                timeline.play();
                timeline.setOnFinished(event1 -> {
                    NewsPage newsPage = new NewsPage();
                    try {
                        newsPage.start(new Stage(primaryStage.getStyle()));
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                });
            }else if(!adminLogin.getText().isEmpty() && !adminPassword.getText().isEmpty() && !adminLogin.getText().equals(info[0]) && !adminPassword.getText().equals(info[1])){
                ErrorPage errorPage = new ErrorPage();
                adminPassword.setText("");
                adminLogin.setText("");
                try {
                    errorPage.start(new Stage(primaryStage.getStyle()));
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }if (adminLogin.getText().isEmpty() && adminPassword.getText().isEmpty()){
                Text text = new Text(250,225,"Username is Empty!");
                text.setFill(Color.WHITE);
                Text text1 = new Text(250,280,"Password is Empty!");
                text1.setFill(Color.WHITE);
                borderPane20.getChildren().addAll(text,text1);
            }else if (adminLogin.getText().isEmpty()){
                Text text = new Text(250,225,"Username is Empty!");
                text.setFill(Color.WHITE);
                borderPane20.getChildren().add(text);
            }else if (adminPassword.getText().isEmpty()){
                Text text1 = new Text(250,280,"Password is Empty!");
                text1.setFill(Color.WHITE);
                borderPane20.getChildren().add(text1);
            }
        });

        Scene scene = new Scene(borderPane20,600,450);
        primaryStage.setTitle("ADMIN LOGIN PAGE");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

class ErrorPage extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception {
        Text text1 = new Text("Username or password is not correct");
        text1.setX(100);
        text1.setY(30);
        Image image1 = new Image(new File("C:\\Users\\Zhandos\\IdeaProjects\\Project2\\src\\main\\java\\com\\example\\project2\\Новая папка\\ezgif-1-a62d9945a0.jpg").toURI().toString());
        ImageView imageView1 = new ImageView(image1);
        imageView1.setX(30);
        imageView1.setY(20);
        imageView1.setFitHeight(50);
        imageView1.setFitWidth(60);
        Button button1 = new Button();
        button1.setText("OK");
        button1.setLayoutX(425);
        button1.setLayoutY(90);
        button1.setMinWidth(60);
        Pane pane = new Pane(button1,text1,imageView1);
        Scene scene1 = new Scene(pane,500,120);
        primaryStage.setY(500);
        primaryStage.setX(525);
        primaryStage.setTitle("Error");
        primaryStage.setScene(scene1);
        primaryStage.show();
        button1.setOnAction(event -> {
            primaryStage.close();
        });
    }
}