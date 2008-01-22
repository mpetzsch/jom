/**
 * 
 */
package jom.impl;

import static org.junit.Assert.*;

import java.util.Collection;

import jom.ObjectFactory;
import jom.exceptions.InstanceCreationException;

import org.junit.Test;

/**
 * @author MPETZSCH
 * 
 */
public class DefaultObjectFactoryTest
{

	private ObjectFactory objectFactory = new DefaultObjectFactory();

	/**
	 * Test method for
	 * {@link jom.impl.DefaultObjectFactory#getInstance(java.lang.Class)}.
	 */
	@Test
	public void testGetInstance()
	{
		try
		{
			DefaultObjectFactory of = objectFactory
					.getInstance(DefaultObjectFactory.class);
			assertNotNull(of);

			try
			{
				Collection iff = objectFactory.getInstance(Collection.class);
				fail("Creation of instance of interface should fail");
			} catch (InstanceCreationException ice)
			{

			}

		} catch (InstanceCreationException ice)
		{
			fail(ice.toString());
		}
	}

}
