package dotBAK.ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.LayoutStyle.ComponentPlacement;

public class mainFrame {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainFrame window = new mainFrame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public mainFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnArchived = new JButton("Archived");
		btnArchived.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		JButton btnRestore = new JButton("Restore");
		btnRestore.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton btnBackUp = new JButton("Back Up");
		
		JButton btnSettings = new JButton("Settings");
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btnSettings, GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
						.addComponent(btnBackUp, GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
						.addComponent(btnRestore, GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
						.addComponent(btnArchived, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, 13, GroupLayout.PREFERRED_SIZE)
					.addGap(319))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(40)
					.addComponent(btnArchived)
					.addGap(18)
					.addComponent(btnRestore)
					.addGap(18)
					.addComponent(btnBackUp)
					.addGap(18)
					.addComponent(btnSettings)
					.addContainerGap(61, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(4)
					.addComponent(separator, GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}
