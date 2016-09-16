package tiy.webapp;

        import org.junit.After;
        import org.junit.Before;
        import org.junit.Test;
        import org.junit.runner.RunWith;
        import org.springframework.boot.test.context.SpringBootTest;
        import org.springframework.test.context.junit4.SpringRunner;

        import java.io.BufferedReader;
        import java.io.InputStreamReader;
        import java.io.PrintWriter;
        import java.net.Socket;
        import java.nio.Buffer;

        import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class WebChatClientTest {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testSendMessage() throws Exception {
        String message = "Test-message";

        WebChatClient myClient = new WebChatClient();

        String response = myClient.sendMessage(message);

        System.out.println(response);





    }

}
