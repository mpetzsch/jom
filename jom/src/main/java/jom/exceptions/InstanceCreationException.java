/**
 * 
 */
package jom.exceptions;

/**
 * @author MPETZSCH
 * 
 */
@SuppressWarnings("serial")
public class InstanceCreationException extends Exception
{
	public InstanceCreationException(Exception cause)
	{
		super(cause);
	}

	public InstanceCreationException(Throwable cause, String message)
	{
		super(message, cause);
	}

	public InstanceCreationException(String str)
	{
		super(str);
	}
}
