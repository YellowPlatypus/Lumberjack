import ch.qos.logback.classic.encoder.PatternLayoutEncoder
import ch.qos.logback.core.FileAppender

import static ch.qos.logback.classic.Level.DEBUG

appender("FILE", FileAppender) {
    file = "debug.log"
    append = true
    encoder(PatternLayoutEncoder) {
        pattern = "%level %logger - %msg%n"
    }
}

root(DEBUG, ["FILE"])