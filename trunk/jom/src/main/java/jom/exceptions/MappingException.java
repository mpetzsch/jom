/**
 * 
 */
package jom.exceptions;

/**
 * @author MPETZSCH
 * 
 */
@SuppressWarnings("serial")
public class MappingException extends Exception
{
	public MappingException(Throwable cause)
	{
		super(cause);
	}

	public MappingException(String message)
	{
		super(message);
	}
	
	public MappingException(String message, Throwable cause)
	{
		super(message, cause);
	}
}
