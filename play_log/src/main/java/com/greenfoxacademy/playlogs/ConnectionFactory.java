package com.greenfoxacademy.playlogs;

import java.sql.*;

import com.zaxxer.hikari.*;

public class ConnectionFactory {

	private static HikariConfig config = new HikariConfig();
	private static HikariDataSource ds;

	static {
		config.setJdbcUrl( "jdbc:h2:~/testa" );
		config.setUsername( "user" );
		config.setPassword( "pw" );
		config.addDataSourceProperty( "cachePrepStmts" , "true" );
		config.addDataSourceProperty( "prepStmtCacheSize" , "250" );
		config.addDataSourceProperty( "prepStmtCacheSqlLimit" , "2048" );
		ds = new HikariDataSource( config );
	}

	private ConnectionFactory() {}

	public static Connection getConnection() throws SQLException {
		return ds.getConnection();
	}
}
