package p3g;

public class DemoQuizViewer {
	public static void main(String[] args) {
		QuizViewer viewer = new QuizViewer();
		Demo1Input input = new Demo1Input();
		Demo1Controller controller = new Demo1Controller(viewer, input);
		Quiz.newFrame(viewer, "Quiz Viewer", 10, 200);
		Quiz.newFrame(input, "Demo Input", 400, 200);
	}
}
