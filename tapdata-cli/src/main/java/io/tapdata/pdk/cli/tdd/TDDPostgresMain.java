package io.tapdata.pdk.cli.tdd;

import io.tapdata.pdk.cli.Main;
import io.tapdata.pdk.core.utils.CommonUtils;

public class TDDPostgresMain {
    public static void main(String... args) {
        CommonUtils.setProperty("pdk_external_jar_path", "./connectors/dist");
        args = new String[]{
//                "test", "-c", "B:\\code\\tapdata\\idaas-pdk\\tapdata-pdk-cli\\src\\main\\resources\\config\\aerospike.json",
//                "test", "-c", "B:\\code\\tapdata\\idaas-pdk\\tapdata-pdk-cli\\src\\main\\resources\\config\\doris.json",
//                "test", "-c", "/Users/aplomb/dev/tapdata/GithubProjects/idaas-pdk/tapdata-pdk-cli/src/main/resources/config/doris.json",
                "test", "-c", "tapdata-cli/src/main/resources/config/postgres.json",
//                "-t", "io.tapdata.pdk.tdd.tests.source.StreamReadTest",
//                "-t", "io.tapdata.pdk.tdd.tests.source.BatchReadTest",
//                "-t", "io.tapdata.pdk.tdd.tests.target.CreateTableTest",
//                "-t", "io.tapdata.pdk.tdd.tests.target.DMLTest",
//                "B:\\code\\tapdata\\idaas-pdk\\connectors\\aerospike-connector\\target\\aerospike-connector-v1.0-SNAPSHOT.jar",
//                "/Users/aplomb/dev/tapdata/GithubProjects/idaas-pdk/dist/doris-connector-v1.0-SNAPSHOT.jar",
//                "/Users/aplomb/dev/tapdata/GithubProjects/idaas-pdk/dist/empty-connector-v1.1-SNAPSHOT.jar",
//                "/Users/aplomb/dev/tapdata/GithubProjects/idaas-pdk/dist/file-connector-v1.0-SNAPSHOT.jar",
				"-m", "/Applications/apache-maven-3.8.1",
                "connectors/postgres-connector",};

		Main.registerCommands().execute(args);
    }
}
