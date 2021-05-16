package state;

public class DayState implements State {
	
	private static DayState singleton = new DayState();
	
	public static State getInstance() {
		return singleton;
	}

	@Override
	public void doClock(Context context, int hour) {
		
		if(hour<9||17<=hour) {
			context.changeState(NightState.getInstance());
		}

	}

	@Override
	public void doUse(Context context) {
		context.recordingLog("day use");
	}

	@Override
	public void doAlarm(Context context) {
		context.callSecurity("day alarm");
	}

	@Override
	public void doPhone(Context context) {
		context.recordingLog("day phone");
	}

}
