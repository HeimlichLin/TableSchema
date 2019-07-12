package com.tableSchema.common.db;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.tableSchema.common.codegenerate.CodeParm;
import com.tableSchema.common.codegenerate.DBsetting;
import com.tableSchema.common.context.AppContext;
import com.tableSchema.common.utils.FileLoaderUtil;

public class ConnectionUitls {
	
	private static Logger LOGGER = LoggerFactory.getLogger(ConnectionUitls.class);
	
	public static Connection getConnection(String dbString) {
		System.setProperty(CodeParm.DB_SETTING.name(), dbString);
		return getConnection();
	}

	public static Connection getConnection() {
		final String dbProperties = AppContext.get().getValue(CodeParm.DB_SETTING.name(), "db.properties");
		final File f = FileLoaderUtil.getResourcesFile(ConnectionUitls.class, dbProperties);
		final Properties properties = new Properties();
		try {
			properties.load(new FileInputStream(f));
		} catch (final FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (final IOException e1) {
			e1.printStackTrace();
		}

		final String url = properties.getProperty(DBsetting.URL.toText());
		final String driver = properties.getProperty(DBsetting.DRIVER_CLASS_NAME.toText());
		Connection conn = null;
		final Properties props = new Properties();
		props.put("remarksReporting", "true");
		props.put("user", properties.getProperty(DBsetting.USERNAME.toText()));
		props.put("password", properties.getProperty(DBsetting.PASSWORD.toText()));

		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, props);
		} catch (final SQLException e) {
			LOGGER.error(e.getMessage(), e);
		} catch (final ClassNotFoundException e) {
			LOGGER.error(e.getMessage(), e);
		}
		return conn;
	}
	
	public static void closeConnection(Connection conn, PreparedStatement ps) 
			throws SQLException {
		try {			
			if (ps != null) {
				ps.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void close(Connection conn, PreparedStatement ps, ResultSet rs) 
			throws SQLException {
		try {
			if (rs != null) {
				rs.close();
			}
			if (ps != null) {
				ps.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
