import org.junit.Assert;
import org.junit.Test;
import org.surya.java.util.HelloImpl;
import org.surya.java.feature.IHello;

public class TestHello {

	@Test
	public void test(){
		IHello hello = new HelloImpl();
		Assert.assertEquals("Hello",hello.sayHello());
	}
}
