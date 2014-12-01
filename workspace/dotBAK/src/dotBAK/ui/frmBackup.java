package dotBAK.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.JLabel;
import javax.swing.JTree;
import javax.swing.LayoutStyle.ComponentPlacement;

import java.awt.CardLayout;

import javax.swing.JCheckBox;
import javax.swing.JFormattedTextField;
import javax.swing.JRadioButton;

public class frmBackup extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmBackup frame = new frmBackup();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public frmBackup() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		JLabel lblTime = new JLabel("Time:");
		final JFormattedTextField timeInput = new JFormattedTextField();
		timeInput.setText("12:00 AM");
		
		final JPanel pnlDaySelection = new JPanel();
		contentPane.add(pnlDaySelection, "name_11667643194868");
		
		final JPanel pnlTime = new JPanel();
		contentPane.add(pnlTime, "name_11671923690476");
		
		JButton button = new JButton("Archived");
		
		JButton button_1 = new JButton("Restore");
		
		JButton button_2 = new JButton("Back Up");
		
		JButton button_3 = new JButton("Settings");
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		
		JLabel lblStepTime = new JLabel("Step 2: Time");
		GroupLayout gl_pnlTime = new GroupLayout(pnlTime);
		gl_pnlTime.setHorizontalGroup(
			gl_pnlTime.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlTime.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pnlTime.createParallelGroup(Alignment.LEADING)
						.addComponent(button, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_2, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_3, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(separator_1, GroupLayout.PREFERRED_SIZE, 13, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblStepTime)
					.addContainerGap(217, Short.MAX_VALUE))
		);
		gl_pnlTime.setVerticalGroup(
			gl_pnlTime.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_pnlTime.createSequentialGroup()
					.addContainerGap(43, Short.MAX_VALUE)
					.addGroup(gl_pnlTime.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnlTime.createSequentialGroup()
							.addComponent(lblStepTime)
							.addGap(34)
							.addComponent(button)
							.addGap(11)
							.addComponent(button_1)
							.addGap(11)
							.addComponent(button_2)
							.addGap(11)
							.addComponent(button_3))
						.addComponent(separator_1, GroupLayout.PREFERRED_SIZE, 258, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		pnlTime.setLayout(gl_pnlTime);
		
		JPanel pnlSettings = new JPanel();
		contentPane.add(pnlSettings, "name_11674572131560");
		
		JButton schArchive = new JButton("Archived");
		
		JButton schRestore = new JButton("Restore");
		
		JButton schBackup = new JButton("Back Up");
		
		JButton schSettings = new JButton("Settings");
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		
		JLabel lblCreateABackup = new JLabel("Step 1:");
		
		final JCheckBox chckbxMonday = new JCheckBox("Monday");
		
		final JCheckBox chckbxTuesday = new JCheckBox("Tuesday");
		
		final JCheckBox chckbxWednesday = new JCheckBox("Wednesday");
		
		final JCheckBox chckbxThursday = new JCheckBox("Thursday");
		
		final JCheckBox chckbxFriday = new JCheckBox("Friday");
		
		final JCheckBox chckbxSaturday = new JCheckBox("Saturday");
		
		final JCheckBox chckbxSunday = new JCheckBox("Sunday");
		
		final JCheckBox chckbxEveryDay = new JCheckBox("Every Day");
		
		final JRadioButton rdbtnScheduled = new JRadioButton("Scheduled");
		final JRadioButton rdbtnOnce = new JRadioButton("Once");
		
		chckbxMonday.setEnabled(false);
		chckbxTuesday.setEnabled(false);
		chckbxWednesday.setEnabled(false);
		chckbxThursday.setEnabled(false);
		chckbxFriday.setEnabled(false);
		chckbxSaturday.setEnabled(false);
		chckbxSunday.setEnabled(false);
		chckbxEveryDay.setEnabled(false);
		timeInput.setEditable(false);

		rdbtnScheduled.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chckbxMonday.setEnabled(true);
				chckbxTuesday.setEnabled(true);
				chckbxWednesday.setEnabled(true);
				chckbxThursday.setEnabled(true);
				chckbxFriday.setEnabled(true);
				chckbxSaturday.setEnabled(true);
				chckbxSunday.setEnabled(true);
				chckbxEveryDay.setEnabled(true);
				rdbtnOnce.setSelected(false);
				timeInput.setEditable(true);
			}
		});
		
		rdbtnOnce.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chckbxMonday.setEnabled(false);
				chckbxTuesday.setEnabled(false);
				chckbxWednesday.setEnabled(false);
				chckbxThursday.setEnabled(false);
				chckbxFriday.setEnabled(false);
				chckbxSaturday.setEnabled(false);
				chckbxSunday.setEnabled(false);
				chckbxEveryDay.setEnabled(false);
				rdbtnScheduled.setSelected(false);
				timeInput.setEditable(false);
			}
		});
		
	
		
		JLabel lblBackupType = new JLabel("Backup Type");
		
		JButton btnNewButton = new JButton("Next");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pnlDaySelection.setVisible(false);
				pnlTime.setVisible(true);
			}
		});
		
		GroupLayout gl_pnlDaySelection = new GroupLayout(pnlDaySelection);
		gl_pnlDaySelection.setHorizontalGroup(
			gl_pnlDaySelection.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlDaySelection.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pnlDaySelection.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnlDaySelection.createParallelGroup(Alignment.TRAILING)
							.addComponent(schArchive, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
							.addComponent(schRestore, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE))
						.addComponent(schBackup, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
						.addComponent(schSettings, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, 13, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_pnlDaySelection.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnlDaySelection.createParallelGroup(Alignment.TRAILING)
							.addGroup(gl_pnlDaySelection.createParallelGroup(Alignment.LEADING)
								.addComponent(rdbtnOnce)
								.addComponent(rdbtnScheduled)
								.addGroup(gl_pnlDaySelection.createSequentialGroup()
									.addGap(2)
									.addComponent(lblBackupType)))
							.addComponent(lblCreateABackup, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblTime)
						.addComponent(timeInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(40)
					.addGroup(gl_pnlDaySelection.createParallelGroup(Alignment.LEADING)
						.addComponent(chckbxSaturday, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
						.addComponent(chckbxFriday, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
						.addComponent(chckbxThursday, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
						.addComponent(chckbxWednesday)
						.addComponent(chckbxMonday)
						.addComponent(chckbxSunday, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
						.addComponent(chckbxEveryDay, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton)
						.addComponent(chckbxTuesday, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE))
					.addGap(61))
		);
		gl_pnlDaySelection.setVerticalGroup(
			gl_pnlDaySelection.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlDaySelection.createSequentialGroup()
					.addGroup(gl_pnlDaySelection.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_pnlDaySelection.createSequentialGroup()
							.addGroup(gl_pnlDaySelection.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblCreateABackup)
								.addComponent(btnNewButton))
							.addGap(20)
							.addGroup(gl_pnlDaySelection.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_pnlDaySelection.createSequentialGroup()
									.addGap(5)
									.addComponent(schArchive)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(schRestore)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(schBackup)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(schSettings))
								.addGroup(gl_pnlDaySelection.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_pnlDaySelection.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_pnlDaySelection.createSequentialGroup()
											.addComponent(lblBackupType)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(rdbtnOnce)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(rdbtnScheduled))
										.addGroup(gl_pnlDaySelection.createSequentialGroup()
											.addComponent(chckbxMonday)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(chckbxTuesday)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(chckbxWednesday)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(chckbxThursday)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addGroup(gl_pnlDaySelection.createParallelGroup(Alignment.BASELINE)
												.addComponent(chckbxFriday)
												.addComponent(lblTime))
											.addPreferredGap(ComponentPlacement.RELATED)
											.addGroup(gl_pnlDaySelection.createParallelGroup(Alignment.BASELINE)
												.addComponent(chckbxSaturday)
												.addComponent(timeInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(chckbxSunday)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(chckbxEveryDay))))))
						.addComponent(separator, GroupLayout.PREFERRED_SIZE, 258, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		pnlDaySelection.setLayout(gl_pnlDaySelection);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, "name_28588959449256");
		
	}
}
