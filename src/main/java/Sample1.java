import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.Configurator;
import org.apache.logging.log4j.core.config.DefaultConfiguration;

public class Sample1 implements Executor {
    private Logger log;

    public Sample1()
    {
        log = LogManager.getLogger(Sample1.class);
        // https://stackoverflow.com/questions/41442024/basicconfigurator-replacement-in-log4j2
        Configurator.initialize(new DefaultConfiguration());
    }

    @Override
    public void execute() {
        log.info("entering application");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.info("exiting application");
    }
}
