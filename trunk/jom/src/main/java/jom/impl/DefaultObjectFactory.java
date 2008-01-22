/**
 * 
 */
package jom.impl;

import jom.ObjectFactory;
import jom.exceptions.InstanceCreationException;

/**
 * @author MPETZSCH
 * 
 */
public class DefaultObjectFactory implements ObjectFactory
{
	public <T> T getInstance(Class<T> clazz) throws InstanceCreationException
	{
		try
		{
			if (null == clazz)
			{
				throw new InstanceCreationException("[ObjectFactory: "
						+ getClass() + "] Passed null class for creation");
			} else
			{
				return clazz.newInstance();
			}
		} catch (InstantiationException e)
		{
			throw new InstanceCreationException(e, "[ObjectFactory: "
					+ getClass() + "] Could not create instance of class "
					+ clazz);
		} catch (IllegalAccessException e)
		{
			throw new InstanceCreationException(e, "[ObjectFactory: "
					+ getClass() + "] Could not create instance of class "
					+ clazz);
		}
	}

}
