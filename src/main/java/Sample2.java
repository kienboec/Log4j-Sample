import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.Configuration;
import org.apache.logging.log4j.core.config.ConfigurationFactory;
import org.apache.logging.log4j.core.config.ConfigurationSource;
import org.apache.logging.log4j.core.config.Configurator;
import org.apache.logging.log4j.core.util.Source;

import java.io.File;

public class Sample2 implements Executor {
    private final Logger log;

    public Sample2() {
        Configurator.initialize(null, "sample2.conf.xml");
        log = LogManager.getLogger(Sample2.class);
    }

    @Override
    public void execute() {
        for (int i = 0; i < 3; i++) {
            log.info("entering application");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            log.info("exiting application");
        }
    }
}
