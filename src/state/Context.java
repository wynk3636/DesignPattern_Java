package state;

public interface Context {
	
	public abstract void setClock(int hour);
	public abstract void changeState(State state);
	public abstract void callSecurity(String msg);
	public abstract void recordingLog(String msg);

}
