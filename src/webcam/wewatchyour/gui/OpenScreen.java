package webcam.wewatchyour.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFileChooser;

public class OpenScreen {

	private JFrame frame;

	/**
	 * Create the application.
	 */
	public OpenScreen() {
		OpenScreen window = new OpenScreen();
		initialize();
		window.frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			e.printStackTrace();
		}
		frame = new JFrame("Test Creator Version 0.1.0 BETA");
		frame.setBounds(100, 100, 960, 530);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(UIManage.resizeImgIcon(new ImageIcon("C:\\Users\\Nicholas\\OneDrive\\School\\Test Creator\\Test Creator\\res\\Latex logo.png"), 64, 26)));
		label.setBounds(550, 138, 64, 35);
		frame.getContentPane().add(label);
		
		JLabel lblNewLabel = new JLabel("Welcome to TestCreator!");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(352, 200, 140, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNew = new JButton("New...");
		btnNew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainEditorWindow editorWindow = new MainEditorWindow();
			}
		});
		btnNew.setBounds(543, 236, 71, 23);
		frame.getContentPane().add(btnNew);
		
		JLabel lblCreateNewProject = new JLabel("Create new test");
		lblCreateNewProject.setBounds(352, 240, 93, 14);
		frame.getContentPane().add(lblCreateNewProject);
		
		JLabel lblOpenExistingProject = new JLabel("Open existing test");
		lblOpenExistingProject.setBounds(352, 274, 103, 14);
		frame.getContentPane().add(lblOpenExistingProject);
		
		JButton btnOpen = new JButton("Open...");
		btnOpen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser fileChooser = new JFileChooser();
				fileChooser.setBounds(10, 11, 582, 397);
				fileChooser.showOpenDialog(frame);
			}
		});
		btnOpen.setBounds(543, 270, 71, 23);
		frame.getContentPane().add(btnOpen);
		
		JLabel lblTestCreator = new JLabel("Test Creator");
		lblTestCreator.setFont(new Font("Times New Roman", Font.BOLD, 48));
		lblTestCreator.setBounds(349, 74, 262, 58);
		frame.getContentPane().add(lblTestCreator);
		
		JLabel lblWith = new JLabel("with");
		lblWith.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		lblWith.setBounds(509, 144, 32, 14);
		frame.getContentPane().add(lblWith);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmOpen = new JMenuItem("Open");
		mntmOpen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFileChooser fileChooser = new JFileChooser();
				fileChooser.setBounds(10, 11, 582, 397);
				fileChooser.showOpenDialog(frame);
			}
		});
		
		JMenuItem mntmNew = new JMenuItem("New");
		mntmNew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFileChooser fileChooser = new JFileChooser();
				fileChooser.setBounds(10, 11, 582, 397);
				fileChooser.showOpenDialog(frame);
			}
		});
		mnFile.add(mntmNew);
		mnFile.add(mntmOpen);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mnFile.add(mntmExit);
	}
}
