package io.tapdata.pdk.cli.tdd;

import io.tapdata.pdk.cli.Main;
import io.tapdata.pdk.core.utils.CommonUtils;

public class TDDMysqlMain1 {
    public static void main(String... args) {
        CommonUtils.setProperty("pdk_external_jar_path", "./connectors/dist");
        args = new String[]{
            "test",
            "-c",
            "tapdata-cli/src/main/resources/config/mysql.json",
            "./connectors/dist/mysql-connector-v1.0-SNAPSHOT.jar",
        };
        Main.registerCommands().execute(args);
    }
}
