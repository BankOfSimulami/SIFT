package xyz.stoneworkssift.library.json.interaction;

import xyz.stoneworkssift.library.json.Snowflake;

import java.util.Optional;

public class Interaction {
    private Snowflake id;
    private Snowflake application_id;
    private InteractionType type;
    //data Optional
    private Optional<Snowflake> guild_id; //make possible
    private Optional<Snowflake> channel_id;
    // guild member Optional
    // user Option;
    private String token;
    private int version;
    // message Optional
    private Optional<String> app_permissions;
    private Optional<String> locale;
    private Optional<String> guild_locale;

    @Override
    public String toString() {
        return "Interaction{" +
                "id=" + id +
                ", application_id=" + application_id +
                ", type=" + type +
                ", guild_id=" + guild_id +
                ", channel_id=" + channel_id +
                ", token='" + token + '\'' +
                ", version=" + version +
                ", app_permissions=" + app_permissions +
                ", locale=" + locale +
                ", guild_locale=" + guild_locale +
                '}';
    }
}
