import javax.swing.SwingUtilities;

public class MultiThreadSwing {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				new MainFrame("SwingWorker Demo");

			}
		});
	}
}
