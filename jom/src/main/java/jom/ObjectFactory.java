/**
 * 
 */
package jom;

import jom.exceptions.InstanceCreationException;

/**
 * @author MPETZSCH
 * 
 */
public interface ObjectFactory
{
	Object getInstance(Class<?> clazz) throws InstanceCreationException;
}
