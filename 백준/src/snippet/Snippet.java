package snippet;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Snippet {
	public static void main(String[] args) {
		Getter g =new Getter();
		JFrame frame = new JFrame();
		DefaultTableModel model=null;
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Jtable만들기
		JButton btn =new JButton("후기작성");
		Object columnNames[] = { "호텔명","객실정보","방문일자","후기작성"};
		model = new DefaultTableModel(columnNames,0);
		
		System.out.println(g.getName());
		//row추가
		for (int i = 0; i < 2; i++) {
			model.addRow(new String[] {
					g.getName(),g.getName(),g.getName(),g.getName()
			});
			
		}
		final JTable table = new JTable(model);
		JScrollPane scrollPane = new JScrollPane(table);
		//JLabel
		
		table.setAutoResizeMode(JTable.AUTO_RESIZE_SUBSEQUENT_COLUMNS);
		table.setEnabled(false);

		frame.add(scrollPane);
		frame.setSize(500,700);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);

	}

}
