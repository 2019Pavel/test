package constants;

import java.util.List;

import static utils.Parser.getBrowserOptions;
import static utils.Parser.getValue;

public class Constants {
    private Constants() {}

    public static final String PATH_TO_CONFIGURATION = "src/main/resources/configuration.json";
    public static final String BROWSER = getValue(PATH_TO_CONFIGURATION, "browser");
    public static final List<String> BROWSER_OPTIONS = getBrowserOptions(PATH_TO_CONFIGURATION, "browser_options");
    public static final String BASE_URL = getValue(PATH_TO_CONFIGURATION, "home_url");
}
