package FontysApp;

import JMS.JmsMessageSender;
import Frames.FontysAppFrame;
import java.util.HashMap;
import javax.jms.Queue;
import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.context.ApplicationContext;

/**
 * RunFontysApp
 * created by @author RY Jin on Jun 20, 2015
 */
public class RunFontysApp {

    private static HashMap<String, String> channels;
    private static ApplicationContext ctx;
    private static JmsMessageSender jmsMessageSender;

    public static void main(String[] args) {
        try {

            final String factoryName = "";
            final String clientOrderRequestQueue = "";
            final String clientOrderReplyQueue = "";

            FontysAppFrame frame = new FontysAppFrame(factoryName, clientOrderRequestQueue, clientOrderReplyQueue);

            frame.setVisible(
                    true);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static String sendMessage(String sendChannel, String message, String jmsMessageID) {
        Queue queueSend = new ActiveMQQueue(sendChannel);
        return jmsMessageSender.send(queueSend, message, jmsMessageID);
    }
}
