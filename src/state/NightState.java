package state;

public class NightState implements State {
	
	private static NightState singleton = new NightState();
	
	public static State getInstance() {
		return singleton;
	}

	@Override
	public void doClock(Context context, int hour) {
		
		if(hour<=9||17<hour) {
			context.changeState(NightState.getInstance());
		}

	}

	@Override
	public void doUse(Context context) {
		context.recordingLog("night use");
	}

	@Override
	public void doAlarm(Context context) {
		context.callSecurity("night alarm");
	}

	@Override
	public void doPhone(Context context) {
		context.recordingLog("night phone");
	}

}
