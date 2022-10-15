package xyz.stoneworkssift.library.json.interaction.data;

import xyz.stoneworkssift.library.json.Snowflake;

import java.util.Optional;

public class ApplicationCommandData {
    private Snowflake id;
    private String name;
    private int type;
    //resolved Optional
    //options array of application command interaction data option
    private Optional<Snowflake> guild_id;
    private Optional<Snowflake> target_id;
}
