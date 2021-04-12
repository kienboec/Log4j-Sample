import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;
import org.apache.logging.log4j.core.config.Configuration;
import org.apache.logging.log4j.core.config.ConfigurationFactory;
import org.apache.logging.log4j.core.config.ConfigurationSource;
import org.apache.logging.log4j.core.config.Configurator;
import org.apache.logging.log4j.core.util.Source;

import java.io.File;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Sample3 implements Executor {
    private final Logger log;

    public Sample3() {
        Configurator.initialize(null, "sample3.conf.xml");
        log = LogManager.getLogger(Sample3.class);
    }

    @Override
    public void execute() {
        Marker flowMarker =new MarkerManager.Log4jMarker("NORMAL");
        IntStream.range(0,20).parallel().forEach(x -> {
            log.fatal(flowMarker, "entering application"); // check marker here
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            log.info("exiting application");
        });
    }
}
