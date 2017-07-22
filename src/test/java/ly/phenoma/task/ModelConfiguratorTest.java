package ly.phenoma.task;

import org.junit.Test;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;

public class ModelConfiguratorTest {

    private String readFileAsString(String filename) throws URISyntaxException, IOException {
        URL resource = this.getClass().getClassLoader().getResource(filename);
        if (resource == null) {
            throw new NullPointerException("File " + filename + " is not located on a classpath. " +
                    "Check your workspace configuration.");
        }
        return Files.readAllLines(Paths.get(resource.toURI())).stream().collect(Collectors.joining());
    }

    @Test
    public void shouldConfigureAudiA3() {
        //TODO: check that a car conforms to an input json
    }

    @Test
    public void shouldConfigureAudiA4() {
        //TODO: check that a car conforms to an input json
    }

    @Test
    public void shouldConfigureAudiA6() {
        //TODO: check that a car conforms to an input json
    }

    @Test
    public void shouldBestOfferInteriorBeBetterOrEqualThanOthers() {
        //TODO: check that best offer interior is actually the best (or at least equal) compared to other interiors
    }

    //TODO: any other tests?

}