package mediator;

import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends Frame implements ActionListener, Mediator {
	
	private CollegueCheckBox checkGuest;
	private CollegueCheckBox checkLogin;
	private ColleagueTextField textUser;
	private ColleagueTextField textPass;
	private ColleagueButton buttonOk;
	private ColleagueButton buttonCancel;
	
	public LoginFrame(String title) {
		
		super(title);
		
		setBackground(Color.lightGray);
		
		setLayout(new GridLayout(4,2));
		
		createColleagues();
		
		add(checkGuest);
		add(checkLogin);
		add(new Label("username"));
		add(textUser);
		add(new Label("pass"));
		add(textPass);
		add(buttonOk);
		add(buttonCancel);
		
		colleagueChanged();
		
		pack();
		show();
	}

	@Override
	public void createColleagues() {
		
		CheckboxGroup g = new CheckboxGroup();
		checkGuest = new CollegueCheckBox("guest", g, true);
		checkLogin = new CollegueCheckBox("login", g, false);
		textUser = new ColleagueTextField("", 10);
		textPass = new ColleagueTextField("", 10);
		textPass.setEchoChar('*');
		buttonOk = new ColleagueButton("OK");
		buttonCancel = new ColleagueButton("Cancel");
		
		checkGuest.setMediator(this);
		checkLogin.setMediator(this);
		textUser.setMediator(this);
		textPass.setMediator(this);
		buttonOk.setMediator(this);
		buttonCancel.setMediator(this);
		
		checkGuest.addItemListener(checkGuest);
		checkLogin.addItemListener(checkLogin);
		textUser.addTextListener(textUser);
		textPass.addTextListener(textPass);
		buttonOk.addActionListener(this);
		buttonCancel.addActionListener(this);
	}

	@Override
	public void colleagueChanged() {
		if(checkGuest.getState()) {
			textUser.setColleagueEnabled(false);
			textPass.setColleagueEnabled(false);
			buttonOk.setColleagueEnabled(true);
		}
		else {
			textUser.setColleagueEnabled(true);
			userPassChanged();
		}
	}

	private void userPassChanged() {
		if(textUser.getText().length()>0) {
			textPass.setColleagueEnabled(true);
			if(textPass.getText().length()>0) {
				buttonOk.setColleagueEnabled(true);
			}
			else {
				buttonOk.setColleagueEnabled(false);
			}
		}
		else {
			textPass.setColleagueEnabled(false);
			buttonOk.setColleagueEnabled(false);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
	}

}
