import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LombokSLF4J {

    public LombokSLF4J() {
        System.out.println("===IMPLICITLY DECLARED LOGGER INSTANCE===");
        String importantVariable = "importantVariable";
        // {} is used as placeholder to skip the old string concatenation
        log.info("{} info log", importantVariable);
        log.debug("{} debug log", importantVariable);
        log.trace("{} trace log", importantVariable);
        log.warn("{} warn log", importantVariable);
        log.error("{} error log", importantVariable);
    }
}
