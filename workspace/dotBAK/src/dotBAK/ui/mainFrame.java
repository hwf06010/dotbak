package dotBAK.ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.Color;

import org.eclipse.wb.swing.FocusTraversalOnArray;

import java.awt.Component;

public class mainFrame {

	private JFrame frame;
	
	public static void GoBack(){
		
	}

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
		frame.getContentPane().setForeground(new Color(0, 0, 0));
		frame.setBounds(100, 100, 450, 300);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		final dotBAK.ui.frmArchived actArchive = new frmArchived();
		final dotBAK.ui.frmRestore actRestore = new frmRestore();
		final dotBAK.ui.frmSettings actSettings = new frmSettings();
		final dotBAK.ui.frmBackup actBackUp = new frmBackup();
		JButton btnArchived = new JButton("Archived");
		btnArchived.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
				actArchive.setVisible(true);
			}
		});
		
		JButton btnRestore = new JButton("Restore");
		btnRestore.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//frame.setVisible(false);
				actRestore.setVisible(true);
			}
		});
		
		JButton btnBackUp = new JButton("Back Up");
		btnBackUp.addActionListener(new ActionListener(){
			public void actionPerformed (ActionEvent e){
				frame.dispose();
				actBackUp.setVisible(true);
			}
		});
		
		
		
		JButton btnSettings = new JButton("Settings");
		btnSettings.addActionListener(new ActionListener(){
			public void actionPerformed (ActionEvent e){
				frame.setVisible(false);
				actSettings.setVisible(true);
			}
		});
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		
		JLabel lblNewLabel = new JLabel("(dot)BAK ");
		
		JLabel lblASuperAwesome = new JLabel("A super awesome backup utility");
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
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(64)
							.addComponent(lblASuperAwesome))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(85)
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)))
					.addGap(74))
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
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(55)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblASuperAwesome)
					.addContainerGap(72, Short.MAX_VALUE))
		);
		frame.getContentPane().setLayout(groupLayout);
		frame.getContentPane().setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{btnSettings, btnBackUp, btnRestore, btnArchived, separator, lblNewLabel}));
	}
}
