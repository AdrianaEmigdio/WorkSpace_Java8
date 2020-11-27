import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
public class TelinhaDoTimer {

	private int tempo;
	private JLabel rotulo;
	private Thread thread;
	
public TelinhaDoTimer() {
		
		tempo = 20;
		setSize(400,300);
		setTitle("Telinha do Timer");
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		rotulo = new JLabel();
		rotulo.setBounds(100, 100, 100, 100);
		rotulo.setFont(new Font("Arial",1, 35));
		rotulo.setText(tempo+" ");
		getContentPane().add(rotulo);
		
	    addMouseListener(this);
		thread = new Thread(this);
				
	}


	public void run() {
		while (tempo > 0) {
			try {
				tempo--;
				rotulo.setText(tempo+" ");
				Thread.sleep(1000);
			}
			catch(Exception ex) {
				System.out.println("deu ruim");
			}
		}
		thread = null;
		
	}


	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if (thread != null)
			thread.start();
	}

	
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Entrei com o mouse na tela");
	}


	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("sa� da tela");
	}


}	
	

