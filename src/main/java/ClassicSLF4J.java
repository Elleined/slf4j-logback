import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ClassicSLF4J {
    private final static Logger LOG = LoggerFactory.getLogger(ClassicSLF4J.class);

    public ClassicSLF4J() {
        System.out.println("===EXPLICITLY DECLARED LOGGER INSTANCE===");
        String importantVariable = "importantVariable";
        // {} is used as placeholder to skip the old string concatenation
        LOG.info("{} info log", importantVariable);
        LOG.debug("{} debug log", importantVariable);
        LOG.trace("{} trace log", importantVariable);
        LOG.warn("{} warn log", importantVariable);
        LOG.error("{} error log", importantVariable);
    }
}
