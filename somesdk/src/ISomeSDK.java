import com.sun.jna.Library;

public interface ISomeSDK extends Library {

	int getVersion();

	int add(int a,int b);
}
