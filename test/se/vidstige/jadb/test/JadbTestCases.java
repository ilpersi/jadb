package se.vidstige.jadb.test;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import se.vidstige.jadb.AndroidDevice;
import se.vidstige.jadb.JadbConnection;

public class JadbTestCases {

	@Test
	public void testGetHostVersion() throws Exception {
		JadbConnection jadb = new JadbConnection();
		jadb.getHostVersion();
	}
	
	@Test
	public void testGetDevices() throws Exception
	{
		JadbConnection jadb = new JadbConnection();
		List<AndroidDevice> actual = jadb.getDevices();
		AndroidDevice[] expected = { new AndroidDevice("emulator-5554") };
		Assert.assertArrayEquals(expected, actual.toArray());
	}
}