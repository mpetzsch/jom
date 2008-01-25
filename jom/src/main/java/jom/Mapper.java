/**
 * 
 */
package jom;

import jom.exceptions.MappingException;

/**
 * @author MPETZSCH
 * 
 */
public interface Mapper
{
	public <T> T map(Object source, Class<T> destinationClass)
			throws MappingException;

	public <T> T map(Object source, T destination) throws MappingException;

	public boolean isMappingConfigured(Class<? extends Object> sourceClass);

	public boolean isMappingConfigured(Class<? extends Object> sourceClass,
			Class<? extends Object> destinationClass);
}
