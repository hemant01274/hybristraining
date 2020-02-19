/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Feb 19, 2020 10:53:14 AM                    ---
 * ----------------------------------------------------------------
 */
package org.giftwrapping.core.jalo;

import de.hybris.platform.cms2.jalo.contents.components.SimpleCMSComponent;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.giftwrapping.core.constants.GiftwrappingCoreConstants;
import org.giftwrapping.core.jalo.GiftWrapOption;

/**
 * Generated class for type {@link org.giftwrapping.core.jalo.GiftWrapComponent GiftWrapComponent}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedGiftWrapComponent extends SimpleCMSComponent
{
	/** Qualifier of the <code>GiftWrapComponent.listOfGiftWraps</code> attribute **/
	public static final String LISTOFGIFTWRAPS = "listOfGiftWraps";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(SimpleCMSComponent.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(LISTOFGIFTWRAPS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GiftWrapComponent.listOfGiftWraps</code> attribute.
	 * @return the listOfGiftWraps
	 */
	public List<GiftWrapOption> getListOfGiftWraps(final SessionContext ctx)
	{
		List<GiftWrapOption> coll = (List<GiftWrapOption>)getProperty( ctx, LISTOFGIFTWRAPS);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GiftWrapComponent.listOfGiftWraps</code> attribute.
	 * @return the listOfGiftWraps
	 */
	public List<GiftWrapOption> getListOfGiftWraps()
	{
		return getListOfGiftWraps( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GiftWrapComponent.listOfGiftWraps</code> attribute. 
	 * @param value the listOfGiftWraps
	 */
	public void setListOfGiftWraps(final SessionContext ctx, final List<GiftWrapOption> value)
	{
		setProperty(ctx, LISTOFGIFTWRAPS,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GiftWrapComponent.listOfGiftWraps</code> attribute. 
	 * @param value the listOfGiftWraps
	 */
	public void setListOfGiftWraps(final List<GiftWrapOption> value)
	{
		setListOfGiftWraps( getSession().getSessionContext(), value );
	}
	
}
