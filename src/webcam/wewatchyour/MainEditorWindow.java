package webcam.wewatchyour;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;

public class MainEditorWindow {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Create the application.
	 */
	public MainEditorWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 768, 576);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{20, 0, 10, 0, 10, 25, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{40, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		JLabel lblSampleQuestion = new JLabel("Sample Question");
		lblSampleQuestion.setFont(new Font("Tahoma", Font.BOLD, 11));
		GridBagConstraints gbc_lblSampleQuestion = new GridBagConstraints();
		gbc_lblSampleQuestion.insets = new Insets(0, 0, 5, 5);
		gbc_lblSampleQuestion.gridx = 1;
		gbc_lblSampleQuestion.gridy = 1;
		frame.getContentPane().add(lblSampleQuestion, gbc_lblSampleQuestion);
		
		JLabel label = new JLabel("Question header");
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 1;
		gbc_label.gridy = 3;
		frame.getContentPane().add(label, gbc_label);
		
		JLabel lblNo = new JLabel("No.1");
		lblNo.setFont(new Font("Tahoma", Font.BOLD, 11));
		GridBagConstraints gbc_lblNo = new GridBagConstraints();
		gbc_lblNo.insets = new Insets(0, 0, 5, 5);
		gbc_lblNo.gridx = 2;
		gbc_lblNo.gridy = 3;
		frame.getContentPane().add(lblNo, gbc_lblNo);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 4;
		gbc_textField.gridy = 3;
		frame.getContentPane().add(textField, gbc_textField);
		textField.setColumns(10);
		
		JLabel lblAnswerChoices = new JLabel("Answer choices");
		GridBagConstraints gbc_lblAnswerChoices = new GridBagConstraints();
		gbc_lblAnswerChoices.insets = new Insets(0, 0, 5, 5);
		gbc_lblAnswerChoices.gridx = 1;
		gbc_lblAnswerChoices.gridy = 4;
		frame.getContentPane().add(lblAnswerChoices, gbc_lblAnswerChoices);
		
		JLabel lblA = new JLabel("A.");
		lblA.setFont(new Font("Tahoma", Font.BOLD, 11));
		GridBagConstraints gbc_lblA = new GridBagConstraints();
		gbc_lblA.insets = new Insets(0, 0, 5, 5);
		gbc_lblA.gridx = 2;
		gbc_lblA.gridy = 4;
		frame.getContentPane().add(lblA, gbc_lblA);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 4;
		gbc_textField_1.gridy = 4;
		frame.getContentPane().add(textField_1, gbc_textField_1);
		
		JLabel lblB = new JLabel("B.");
		lblB.setFont(new Font("Tahoma", Font.BOLD, 11));
		GridBagConstraints gbc_lblB = new GridBagConstraints();
		gbc_lblB.insets = new Insets(0, 0, 5, 5);
		gbc_lblB.gridx = 2;
		gbc_lblB.gridy = 5;
		frame.getContentPane().add(lblB, gbc_lblB);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.insets = new Insets(0, 0, 5, 5);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 4;
		gbc_textField_2.gridy = 5;
		frame.getContentPane().add(textField_2, gbc_textField_2);
		
		JLabel lblC = new JLabel("C.");
		lblC.setFont(new Font("Tahoma", Font.BOLD, 11));
		GridBagConstraints gbc_lblC = new GridBagConstraints();
		gbc_lblC.insets = new Insets(0, 0, 5, 5);
		gbc_lblC.gridx = 2;
		gbc_lblC.gridy = 6;
		frame.getContentPane().add(lblC, gbc_lblC);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.insets = new Insets(0, 0, 5, 5);
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.gridx = 4;
		gbc_textField_3.gridy = 6;
		frame.getContentPane().add(textField_3, gbc_textField_3);
		
		JLabel label_2 = new JLabel("B.");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		GridBagConstraints gbc_label_2 = new GridBagConstraints();
		gbc_label_2.insets = new Insets(0, 0, 5, 5);
		gbc_label_2.gridx = 2;
		gbc_label_2.gridy = 7;
		frame.getContentPane().add(label_2, gbc_label_2);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.insets = new Insets(0, 0, 5, 5);
		gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_4.gridx = 4;
		gbc_textField_4.gridy = 7;
		frame.getContentPane().add(textField_4, gbc_textField_4);
		
		JButton btnNewButton = new JButton("Save...");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser fileChooser = new JFileChooser();
				fileChooser.setDialogTitle("Specify Name and Location");
				fileChooser.setBounds(10, 11, 582, 397);
				int userSelection = fileChooser.showSaveDialog(frame);
				 
				if (userSelection == JFileChooser.APPROVE_OPTION) {
				    File fileToSave = fileChooser.getSelectedFile();
				    System.out.println(fileToSave.getName() + " " + fileToSave.getPath()); //debugging, can remove
				    																	   //use file to get desired name and path of output
				}
			}
		});
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton.gridx = 5;
		gbc_btnNewButton.gridy = 8;
		frame.getContentPane().add(btnNewButton, gbc_btnNewButton);
	}
}
