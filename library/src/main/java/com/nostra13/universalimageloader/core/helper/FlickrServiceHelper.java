package com.nostra13.universalimageloader.core.helper;

/**
 * Simple class for remembering the api key and group id (optional) for the Flickr integration.
 * This will need to be set every time the application instantiates from the zygote.
 *
 * @author Matt Allen
 * @project UniversalImageLoader
 */
public class FlickrServiceHelper
{
	private static String flickrApiKey, groupId;

	public static void setApiKey(String key)
	{
		flickrApiKey = key;
	}

	public static String getApiKey()
	{
		return flickrApiKey;
	}

	public static String getUriForLocation(double latitude, double longitude)
	{
		return "flickr://" + String.valueOf(latitude) + "/" + String.valueOf(longitude);
	}

	public static String getGroupId()
	{
		return groupId;
	}

	public static void setGroupId(String id)
	{
		groupId = id;
	}
}
