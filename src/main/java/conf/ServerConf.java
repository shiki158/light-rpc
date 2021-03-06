package conf;

import lombok.Data;
import server.ServiceBeanProvider;

import java.util.List;

/**
 * Created by jiangzhiwen on 17/2/18.
 */
@Data
public class ServerConf {
    private String appId;
    private Protocol protocol;
    private int port;
    private ServiceBeanProvider serviceBeanProvider;
    private List<Class<?>> interfaces;
    private int threadPoolSize;
}
