package dotBAK.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.CardLayout;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JList;

public class frmRestore extends JFrame {

	private JPanel contentPane;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmRestore frame = new frmRestore();
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
	public frmRestore() {
		
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e){
			       int result = JOptionPane.showConfirmDialog(null, "Exit Restore Wizard", "Confirm",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
	
			       if(result == JOptionPane.YES_OPTION){
			               dispose();
			       }else{
			               //Do nothing
			       }
			 }
		});
		
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		final JPanel pnlRestoreMain = new JPanel();
		contentPane.add(pnlRestoreMain, "name_280666337581502");
		pnlRestoreMain.setVisible(true);
		
		final JPanel pnlRestore2 = new JPanel();
		contentPane.add(pnlRestore2, "name_280670014915369");
		
		JLabel lblRestoreChooseA = new JLabel("Restore: Choose a file to Restore");
		
		JList chooseFile = new JList();
		
		JList list = new JList();
		
		JButton btnRestore = new JButton("->");
		
		JButton btnRemove = new JButton("<-");
		
		JLabel lblArchive = new JLabel("Archive");
		
		JLabel label = new JLabel("");
		
		JLabel lblRestore = new JLabel("Restore");
		
		JButton btnNext = new JButton("Restore");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result = JOptionPane.showConfirmDialog(null, "Restore Successful", "Confirm",JOptionPane.CLOSED_OPTION,JOptionPane.QUESTION_MESSAGE);
				
			       if(result == JOptionPane.YES_OPTION){
			               dispose();
			       }else{
			               //Do nothing
			       }
			}
		});
		GroupLayout gl_pnlRestore2 = new GroupLayout(pnlRestore2);
		gl_pnlRestore2.setHorizontalGroup(
			gl_pnlRestore2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlRestore2.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pnlRestore2.createParallelGroup(Alignment.LEADING, false)
						.addComponent(lblRestoreChooseA, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblArchive)
						.addComponent(chooseFile, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGroup(gl_pnlRestore2.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_pnlRestore2.createSequentialGroup()
							.addGap(9)
							.addGroup(gl_pnlRestore2.createParallelGroup(Alignment.LEADING)
								.addComponent(btnRestore)
								.addComponent(btnRemove))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_pnlRestore2.createParallelGroup(Alignment.TRAILING)
								.addComponent(list, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
								.addGroup(gl_pnlRestore2.createSequentialGroup()
									.addComponent(lblRestore)
									.addPreferredGap(ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
									.addComponent(label)
									.addGap(44))))
						.addGroup(gl_pnlRestore2.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnNext)))
					.addGap(45))
		);
		gl_pnlRestore2.setVerticalGroup(
			gl_pnlRestore2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlRestore2.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pnlRestore2.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_pnlRestore2.createSequentialGroup()
							.addGroup(gl_pnlRestore2.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblRestoreChooseA)
								.addComponent(btnNext))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_pnlRestore2.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblArchive)
								.addComponent(lblRestore))
							.addGap(4))
						.addGroup(gl_pnlRestore2.createSequentialGroup()
							.addComponent(label)
							.addPreferredGap(ComponentPlacement.UNRELATED)))
					.addGroup(gl_pnlRestore2.createParallelGroup(Alignment.TRAILING)
						.addComponent(chooseFile, GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
						.addGroup(gl_pnlRestore2.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_pnlRestore2.createSequentialGroup()
								.addGap(66)
								.addComponent(btnRestore)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(btnRemove))
							.addComponent(list, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		pnlRestore2.setLayout(gl_pnlRestore2);
		
		JLabel lblRestoreWizard = new JLabel("Restore Wizard");
		
		JButton btnStart = new JButton("Start Restore");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pnlRestoreMain.setVisible(false);
				pnlRestore2.setVisible(true);
			}
		});
		GroupLayout gl_pnlRestoreMain = new GroupLayout(pnlRestoreMain);
		gl_pnlRestoreMain.setHorizontalGroup(
			gl_pnlRestoreMain.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlRestoreMain.createSequentialGroup()
					.addGroup(gl_pnlRestoreMain.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnlRestoreMain.createSequentialGroup()
							.addGap(156)
							.addComponent(btnStart))
						.addGroup(gl_pnlRestoreMain.createSequentialGroup()
							.addGap(164)
							.addComponent(lblRestoreWizard)))
					.addContainerGap(171, Short.MAX_VALUE))
		);
		gl_pnlRestoreMain.setVerticalGroup(
			gl_pnlRestoreMain.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlRestoreMain.createSequentialGroup()
					.addGap(99)
					.addComponent(lblRestoreWizard)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnStart)
					.addContainerGap(105, Short.MAX_VALUE))
		);
		pnlRestoreMain.setLayout(gl_pnlRestoreMain);
		
		
	}
}
