package org.ibase4j.service.task;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.ibase4j.core.config.Resources;
import org.springframework.stereotype.Component;

/**
 * @author ShenHuaJie
 * @version 2016年5月20日 下午3:19:19
 */

/**
 * 1、@Service用于标注业务层组件
 * 2、@Controller用于标注控制层组件(如struts中的action)
 * 3、@Repository用于标注数据访问组件，即DAO组件.
 * 4、@Component泛指组件，当组件不好归类的时候，我们可以使用这个注解进行标注。
 */
@Component("coreTask")
public class CoreTask {
    private final Logger logger = LogManager.getLogger();

    /**
     * 定时清除国际化信息
     */
    public void run() {
        Resources.flushMessage();
        logger.info("Messages flushed!");
    }
}
