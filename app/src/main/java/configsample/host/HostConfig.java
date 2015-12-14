package configsample.host;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import javax.validation.constraints.NotNull;

@Configuration
@ConfigurationProperties(prefix = "host")
public class HostConfig {
    @Setter
    @Getter
    @NotNull
    private String name;

    @Setter
    @Getter
    @NotNull
    private String nickName;
}
