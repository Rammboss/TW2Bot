package GUIController;

import com.sun.jna.platform.win32.User32;
import com.sun.jna.platform.win32.WinDef;
import com.sun.jna.platform.win32.WinDef.HWND;

import settings.Keys;

public class MouseRobot {

	private HWND hWnd;

	public MouseRobot(HWND hWnd) {
		this.hWnd = hWnd;
	}

	public void click(Button b) {
		
		WinDef.WPARAM xx = new WinDef.WPARAM(0);

		WinDef.LPARAM yy = new WinDef.LPARAM(b.getPoint().x + (b.getPoint().y << 16));
		User32.INSTANCE.PostMessage(hWnd, Keys.WM_LBUTTONDOWN, xx, yy);

		User32.INSTANCE.PostMessage(hWnd, Keys.WM_LBUTTONUP, xx, yy);

	}

}
