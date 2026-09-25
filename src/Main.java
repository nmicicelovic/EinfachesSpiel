import controller.GewinnController;
import model.GewinnModel;
import view.GewinnView;

public class Main {
    public static void main(String[] args) {
        GewinnModel model = new GewinnModel();

        GewinnView view = new GewinnView();

        GewinnController controller = new GewinnController(model, view);
    }
}