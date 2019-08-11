import java.io.IOException;

public class TestKingMain {

	public void a() {
		try {
			throw new IOException ();
		} catch (IOException e) {
			System.out.println("A");
		}catch (Exception e) {
			System.out.println("B");
		}
	}

	public static void main(String[] args) {
		
		TestKingMain testKingMain=new TestKingMain();
		testKingMain.a();
		System.out.println("phungle.");
		System.out.println("phungle.1111");
		//le dinh tam phung
	}

}
