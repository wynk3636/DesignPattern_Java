package command;

import java.awt.Point;

public class DrawCommand implements Command {
	
	protected Drawable drawable;
	protected Point position;
	
	public DrawCommand(Drawable drawable, Point point) {
		this.drawable = drawable;
		this.position = position;
	}

	@Override
	public void execute() {
		drawable.draw(position.x, position.y);
	}

}
