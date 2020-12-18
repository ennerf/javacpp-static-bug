package issues.javacpp.staticlib;

import org.bytedeco.javacpp.Loader;
import org.bytedeco.javacpp.annotation.Platform;
import org.bytedeco.javacpp.annotation.Properties;
import org.bytedeco.javacpp.tools.InfoMap;
import org.bytedeco.javacpp.tools.InfoMapper;

@Properties(
        value = @Platform(
                value = "windows",
                include = {"HelloWorld.h"},
                link = {"HelloWorld"}
        ),
        target = "issues.javacpp.staticlib.HelloWorld"
)
public class HelloWorldConfig implements InfoMapper {

    static {
        Loader.checkVersion("issues.javacpp.staticlib", "HelloWorld");
    }

    @Override
    public void map(InfoMap infoMap) {
    }

}
