package Krypton_Reports.Krypton_Reports;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class PathFetcher {
	public StringBuilder readFile(String paramString) {
		StringBuilder localStringBuilder = new StringBuilder();
		try {
			InputStream localInputStream = PathFetcher.class
					.getResourceAsStream("/REPORTS" + paramString);
			InputStreamReader localInputStreamReader = new InputStreamReader(
					localInputStream);

			BufferedReader localBufferedReader = new BufferedReader(
					localInputStreamReader);

			String str = null;
			while ((str = localBufferedReader.readLine()) != null) {
				localStringBuilder.append(str);
			}
		} catch (Exception localException) {
			localException.printStackTrace();
		}
		return localStringBuilder;
	}
}