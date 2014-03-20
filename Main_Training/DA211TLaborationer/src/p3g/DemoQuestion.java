package p3g;

public class DemoQuestion {
	public static void main(String[] args) {
		QuizViewer viewer = new QuizViewer();
		Demo2Input input = new Demo2Input();
		YearQuestions provider = new YearQuestions();
		Demo2Controller controller = new Demo2Controller(viewer, input, provider);
		Quiz.newFrame(viewer, "Quiz Viewer", 10, 200);
		Quiz.newFrame(input, "Demo Input", 400, 200);
	}
}
