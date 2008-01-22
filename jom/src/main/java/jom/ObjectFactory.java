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
	<T> T getInstance(Class<T> clazz) throws InstanceCreationException;
}
