package state;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SafeFrame extends Frame implements ActionListener, Context {
	
	private TextField textClock = new TextField(60);
	private TextArea textScreen = new TextArea(10,60);
	private Button buttonUse = new Button("use");
	private Button buttonAlarm = new Button("alarm");
	private Button buttonPhone = new Button("phone");
	private Button buttonExit = new Button("fin");
	
	private State state = DayState.getInstance();
	
	public SafeFrame(String title) {
		
		super(title);
		setBackground(Color.lightGray);
		setLayout(new BorderLayout());
		
		add(textClock,BorderLayout.NORTH);
		textClock.setEditable(false);
		
		add(textScreen,BorderLayout.CENTER);
		textScreen.setEditable(false);
		
		Panel panel = new Panel();
		panel.add(buttonUse);
		panel.add(buttonAlarm);
		panel.add(buttonPhone);
		panel.add(buttonExit);
		
		add(panel,BorderLayout.SOUTH);
		
		pack();
		show();
		
		buttonUse.addActionListener(this);
		buttonAlarm.addActionListener(this);
		buttonPhone.addActionListener(this);
		buttonExit.addActionListener(this);
	}

	@Override
	public void setClock(int hour) {
		
		String clockString ="";
		
		if(hour<10) {
			clockString="am";
		}
		else {
			clockString="pm";
		}
		textClock.setText(clockString);
		state.doClock(this, hour);
	}

	@Override
	public void changeState(State state) {
		
		this.state=state;
	}

	@Override
	public void callSecurity(String msg) {
		textScreen.append(msg);
	}

	@Override
	public void recordingLog(String msg) {
		textScreen.append(msg);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource()==buttonUse) {
			state.doUse(this);
		}
		if(e.getSource()==buttonAlarm) {
			state.doAlarm(this);
		}
		if(e.getSource()==buttonPhone) {
			state.doPhone(this);
		}
		if(e.getSource()==buttonExit) {
			System.exit(0);
		}
	}

}
