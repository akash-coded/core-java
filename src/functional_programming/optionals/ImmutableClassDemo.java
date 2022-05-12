package src.functional_programming.optionals;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.time.Instant;
import java.util.Optional;
import java.util.concurrent.TimeUnit;

/**
 * 
 * An immutable DTO class
 * 
 * @author akash
 *
 */
class LoginResult {

    private final Instant loginTs;

    private final String authToken;
    private final Duration tokenValidity;

    private final URL tokenRefreshUrl;

    // constructor taking every field and checking nulls
    public LoginResult(Optional<Instant> loginTs, String authToken, Duration tokenValidity, URL tokenRefreshUrl) {
        super();
        this.loginTs = loginTs.get();
        this.authToken = authToken;
        this.tokenValidity = tokenValidity;
        this.tokenRefreshUrl = tokenRefreshUrl;
    }

    // read-only accessors (getters)
    public Instant loginTs() {
        return loginTs;
    }

    public String authToken() {
        return authToken;
    }

    public Duration tokenValidity() {
        return tokenValidity;
    }

    public URL tokenRefreshUrl() {
        return tokenRefreshUrl;
    }

}

public class ImmutableClassDemo {

    public static void main(String[] args) throws MalformedURLException {
        LoginResult loginResult = new LoginResult(
                null,
                "abcd",
                Duration.ofDays(1),
                new URL("http://localhost:8080/login"));
    }

}
