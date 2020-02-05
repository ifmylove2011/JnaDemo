import com.sun.jna.Native;

public class SomeSDK {

	private static class Holder {
		private static SomeSDK INSTANCE = new SomeSDK();
	}

	public static SomeSDK getInstance() {
		return Holder.INSTANCE;
	}

	private static ISomeSDK SDK;

	private SomeSDK() {
		SDK = Native.loadLibrary("SimpleDll", ISomeSDK.class);
	}

	public int getSDKVersion() {
		return SDK.getVersion();
	}

	public int add(int a, int b) {
		return SDK.add(a, b);
	}
}
