package au.edu.rmit.alex.jiang;

public final class Modifier{
	/**1
	 * private
	 * 
     * only for internal use in current class instance
	 * 
	 */
	@SuppressWarnings("unused")
	private void privateMethod()
	{
		
	}
	/**2
	 * default modifier
	 * internal
	 * same package
	 */
	 void defaultMethod()
	{
		
	}
	 
	/**3
	 * protected
	 * internal
	 * smae package
	 * subclass from different package
	 */
	protected void protectedMethod()
	{
			
	}
		
	/**4
	 * public
	 * world-wide
	 */
	public void worldWide()
	{
			
	}
}