import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.jms.pool.PooledConnectionFactory;
/*import org.example.untitled.db.DocumentDao;
import org.example.untitled.db.DocumentEntity;*/
import org.example.untitled.mq.Mq;
import org.junit.jupiter.api.Test;

import javax.jms.JMSException;

public class HandlerTest {
    /*private final DocumentDao documentDao = new DocumentDao();*/


    @Test
    void test() {
        /*String input = "test";
        String message = null;
        try {
            Mq.sendMessage(input);
            message = Mq.receiveMessage();
        } catch (JMSException e) {
            e.printStackTrace();
        }

        System.out.println(message);

        final Long id = documentDao.save(new DocumentEntity(message));

        System.out.println(id);*/
    }
}
