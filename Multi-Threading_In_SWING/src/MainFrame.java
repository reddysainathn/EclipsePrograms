import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.concurrent.ExecutionException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingWorker;

public class MainFrame extends JFrame {
	private JLabel countLabel1 = new JLabel("0");
	private JLabel statusLabel = new JLabel("Task Not Completed.");
	private JButton startButoon = new JButton("Start");

	public MainFrame(String title) {
		super(title);
		setLayout(new GridBagLayout());

		GridBagConstraints gc = new GridBagConstraints();

		gc.fill = GridBagConstraints.NONE;

		gc.gridx = 0;
		gc.gridy = 0;
		gc.weightx = 1;
		gc.weighty = 1;
		add(countLabel1, gc);

		gc.gridx = 0;
		gc.gridy = 1;
		gc.weightx = 1;
		gc.weighty = 1;
		add(statusLabel, gc);

		gc.gridx = 0;
		gc.gridy = 2;
		gc.weightx = 1;
		gc.weighty = 1;
		add(startButoon, gc);

		startButoon.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				start();
			}

		});
		setSize(200, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

	}

	private void start() {
		// TODO Auto-generated method stub
		// System.out.println("Start.");
		SwingWorker<Boolean, Integer> worker = new SwingWorker<Boolean, Integer>() {

			@Override
			protected Boolean doInBackground() throws Exception {
				// TODO Auto-generated method stub

				for (int i = 0; i < 30; i++) {
					Thread.sleep(100);
					System.out.println("Hello  :" + i);

					publish(i);
				}

				return true;

			}

			@Override
			protected void process(List<Integer> chunks) {

				int value = chunks.get(chunks.size() - 1);

				countLabel1.setText("Current Value :" + value);

			}

			// Done method is called at the end
			@Override
			protected void done() {
				// TODO Auto-generated method stub
				super.done();
				System.out.println("Done.");
				try {
					Boolean status = get();
					statusLabel.setText("Completed with status :" + status);
				} catch (InterruptedException | ExecutionException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		};
		worker.execute();
	}
}
