package dotBAK.ui;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.DefaultListModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JList;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.JLabel;
import javax.swing.JTree;
import javax.swing.LayoutStyle.ComponentPlacement;

import java.awt.CardLayout;
import java.io.File;

import javax.swing.JCheckBox;
import javax.swing.JFormattedTextField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class frmBackup extends JFrame {

	private JPanel contentPane;
	DefaultListModel listModel;
	private JTextField textBackName;
	private JPasswordField passwordBackup;

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
		listModel = new DefaultListModel();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		final dotBAK.ui.frmArchived actArchive = new frmArchived();
		final dotBAK.ui.frmRestore actRestore = new frmRestore();
		final dotBAK.ui.frmSettings actSettings = new frmSettings();
		
		final JFileChooser openFile = new JFileChooser();
		final JList fileList = new JList(listModel);
		
		
		//JLabels
		JLabel lblStepTime = new JLabel("Step 2: Files");
		JLabel lblCreateABackup = new JLabel("Step 1:");
		JLabel lblBackupType = new JLabel("Backup Type");
		JLabel lblTime = new JLabel("Time:");
		final JFormattedTextField timeInput = new JFormattedTextField();
		timeInput.setText("12:00 AM");
		
		//JPanel Declorations
		
		final JPanel pnlDaySelection = new JPanel();
		contentPane.add(pnlDaySelection, "name_11667643194868");
		
		final JPanel pnlFiles = new JPanel();
		contentPane.add(pnlFiles, "name_11671923690476");
		
		final JPanel pnlSettings = new JPanel();
		contentPane.add(pnlSettings, "name_11674572131560");
		
		JButton button_4 = new JButton("Archived");
		
		JButton button_5 = new JButton("Restore");
		
		JButton button_6 = new JButton("Back Up");
		
		JButton button_7 = new JButton("Settings");
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setOrientation(SwingConstants.VERTICAL);
		
		JLabel lblStepSettings = new JLabel("Step 3: Settings");
		
		JButton btnFinish = new JButton("Finish");
		
		JLabel lblName = new JLabel("Name:");
		
		textBackName = new JTextField();
		textBackName.setColumns(10);
		
		JLabel lblCompress = new JLabel("Compress:");
		
		JRadioButton rdbtnCompY = new JRadioButton("Yes");
		
		JRadioButton rdbtnCompN = new JRadioButton("No");
		
		JLabel lblPassword = new JLabel("Password:");
		
		passwordBackup = new JPasswordField();
		
		JButton btnBack_1 = new JButton("Back");
		btnBack_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pnlSettings.setVisible(false);
				pnlFiles.setVisible(true);
			}
		});
		GroupLayout gl_pnlSettings = new GroupLayout(pnlSettings);
		gl_pnlSettings.setHorizontalGroup(
			gl_pnlSettings.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlSettings.createSequentialGroup()
					.addGroup(gl_pnlSettings.createParallelGroup(Alignment.LEADING)
						.addComponent(button_4, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_5, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_6, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_7, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(separator_2, GroupLayout.PREFERRED_SIZE, 13, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_pnlSettings.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnlSettings.createSequentialGroup()
							.addComponent(lblStepSettings)
							.addPreferredGap(ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
							.addComponent(btnBack_1)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnFinish))
						.addGroup(gl_pnlSettings.createSequentialGroup()
							.addComponent(lblName)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textBackName, GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE))
						.addGroup(gl_pnlSettings.createParallelGroup(Alignment.TRAILING, false)
							.addGroup(gl_pnlSettings.createSequentialGroup()
								.addComponent(lblPassword)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(passwordBackup))
							.addGroup(Alignment.LEADING, gl_pnlSettings.createSequentialGroup()
								.addComponent(lblCompress)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(rdbtnCompY)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(rdbtnCompN))))
					.addContainerGap())
		);
		gl_pnlSettings.setVerticalGroup(
			gl_pnlSettings.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlSettings.createSequentialGroup()
					.addGroup(gl_pnlSettings.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnlSettings.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_pnlSettings.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblStepSettings)
								.addComponent(btnFinish)
								.addComponent(btnBack_1))
							.addGroup(gl_pnlSettings.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_pnlSettings.createSequentialGroup()
									.addGap(23)
									.addComponent(button_4)
									.addGap(11)
									.addComponent(button_5)
									.addGap(11)
									.addComponent(button_6)
									.addGap(11)
									.addComponent(button_7))
								.addGroup(gl_pnlSettings.createSequentialGroup()
									.addGap(26)
									.addGroup(gl_pnlSettings.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblName)
										.addComponent(textBackName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(gl_pnlSettings.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblCompress)
										.addComponent(rdbtnCompY)
										.addComponent(rdbtnCompN))
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(gl_pnlSettings.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblPassword)
										.addComponent(passwordBackup, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))))
						.addComponent(separator_2, GroupLayout.PREFERRED_SIZE, 258, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		pnlSettings.setLayout(gl_pnlSettings);
		
		//JSeparators
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		
		//Button Actions Listeners
		
		JButton button = new JButton("Archived");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				actArchive.setVisible(true);
			}
		});
		
		JButton button_1 = new JButton("Restore");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				actRestore.setVisible(true);
			}
		});
		
		JButton button_2 = new JButton("Back Up");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pnlFiles.setVisible(false);
				pnlDaySelection.setVisible(true);
			}
		});
		
		JButton button_3 = new JButton("Settings");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				actSettings.setVisible(true);
			}
		});
		
		
		JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pnlFiles.setVisible(false);
				pnlSettings.setVisible(true);
			}
		});
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pnlFiles.setVisible(false);
				pnlDaySelection.setVisible(true);
			}
		});
		
		JButton schArchive = new JButton("Archived");
		schArchive.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				actArchive.setVisible(true);
			}
		});
		
		JButton schRestore = new JButton("Restore");
		schRestore.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				actRestore.setVisible(true);
			}
		});
		
		JButton schBackup = new JButton("Back Up");
		schBackup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pnlDaySelection.setVisible(true);
			}
		});
		
		JButton schSettings = new JButton("Settings");
		schSettings.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				actSettings.setVisible(true);
			}
		});
		
		JButton btnNewButton = new JButton("Next");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pnlDaySelection.setVisible(false);
				pnlFiles.setVisible(true);
			}
		});
		
		JButton btnAddFile = new JButton("Add File");
		btnAddFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int returnVal = openFile.showOpenDialog(frmBackup.this);
				String str = new String();
				
				if (returnVal == JFileChooser.APPROVE_OPTION) {
		            File file = openFile.getSelectedFile();
		            str = file.getName();
		            
		            listModel.addElement(str);
		            //This is where a real application would open the file.
		            //log.append("Opening: " + file.getName() + "." + newline);
		        } else {
		            //log.append("Open command cancelled by user." + newline);
		        }
			}
		});
		
		JButton btnRemoveFile = new JButton("Remove File");
		btnRemoveFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int index = fileList.getSelectedIndex();
	            listModel.remove(index);
			}
		});
		
		
		
		GroupLayout gl_pnlFiles = new GroupLayout(pnlFiles);
		gl_pnlFiles.setHorizontalGroup(
			gl_pnlFiles.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlFiles.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pnlFiles.createParallelGroup(Alignment.LEADING)
						.addComponent(button, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_2, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_3, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(separator_1, GroupLayout.PREFERRED_SIZE, 13, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_pnlFiles.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnlFiles.createSequentialGroup()
							.addComponent(lblStepTime)
							.addPreferredGap(ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
							.addComponent(btnBack)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnNext))
						.addGroup(gl_pnlFiles.createSequentialGroup()
							.addComponent(btnAddFile)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnRemoveFile))
						.addComponent(fileList, GroupLayout.PREFERRED_SIZE, 230, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		gl_pnlFiles.setVerticalGroup(
			gl_pnlFiles.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlFiles.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(gl_pnlFiles.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnlFiles.createSequentialGroup()
							.addComponent(lblStepTime)
							.addGroup(gl_pnlFiles.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_pnlFiles.createSequentialGroup()
									.addGap(34)
									.addComponent(button)
									.addGap(11)
									.addComponent(button_1)
									.addGap(11)
									.addComponent(button_2)
									.addGap(11)
									.addComponent(button_3))
								.addGroup(gl_pnlFiles.createSequentialGroup()
									.addGap(28)
									.addGroup(gl_pnlFiles.createParallelGroup(Alignment.BASELINE)
										.addComponent(btnAddFile)
										.addComponent(btnRemoveFile))
									.addGap(18)
									.addComponent(fileList, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE))))
						.addComponent(separator_1, GroupLayout.PREFERRED_SIZE, 258, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
				.addGroup(gl_pnlFiles.createSequentialGroup()
					.addGroup(gl_pnlFiles.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNext)
						.addComponent(btnBack))
					.addContainerGap(246, Short.MAX_VALUE))
		);
		pnlFiles.setLayout(gl_pnlFiles);
		
		
		//JCheckBox
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
		
		final JPanel panel = new JPanel();
		contentPane.add(panel, "name_28588959449256");
	}
}
