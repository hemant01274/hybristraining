/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Feb 10, 2020 12:56:55 PM                    ---
 * ----------------------------------------------------------------
 */
package org.giftwrapping.core.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.giftwrapping.core.constants.GiftwrappingCoreConstants;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem GiftWrapOption}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedGiftWrapOption extends GenericItem
{
	/** Qualifier of the <code>GiftWrapOption.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>GiftWrapOption.type</code> attribute **/
	public static final String TYPE = "type";
	/** Qualifier of the <code>GiftWrapOption.cost</code> attribute **/
	public static final String COST = "cost";
	/** Qualifier of the <code>GiftWrapOption.description</code> attribute **/
	public static final String DESCRIPTION = "description";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CODE, AttributeMode.INITIAL);
		tmp.put(TYPE, AttributeMode.INITIAL);
		tmp.put(COST, AttributeMode.INITIAL);
		tmp.put(DESCRIPTION, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GiftWrapOption.code</code> attribute.
	 * @return the code - PK
	 */
	public String getCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GiftWrapOption.code</code> attribute.
	 * @return the code - PK
	 */
	public String getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GiftWrapOption.code</code> attribute. 
	 * @param value the code - PK
	 */
	public void setCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GiftWrapOption.code</code> attribute. 
	 * @param value the code - PK
	 */
	public void setCode(final String value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GiftWrapOption.cost</code> attribute.
	 * @return the cost - Cost of gift wrap
	 */
	public Integer getCost(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, COST);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GiftWrapOption.cost</code> attribute.
	 * @return the cost - Cost of gift wrap
	 */
	public Integer getCost()
	{
		return getCost( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GiftWrapOption.cost</code> attribute. 
	 * @return the cost - Cost of gift wrap
	 */
	public int getCostAsPrimitive(final SessionContext ctx)
	{
		Integer value = getCost( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GiftWrapOption.cost</code> attribute. 
	 * @return the cost - Cost of gift wrap
	 */
	public int getCostAsPrimitive()
	{
		return getCostAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GiftWrapOption.cost</code> attribute. 
	 * @param value the cost - Cost of gift wrap
	 */
	public void setCost(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, COST,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GiftWrapOption.cost</code> attribute. 
	 * @param value the cost - Cost of gift wrap
	 */
	public void setCost(final Integer value)
	{
		setCost( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GiftWrapOption.cost</code> attribute. 
	 * @param value the cost - Cost of gift wrap
	 */
	public void setCost(final SessionContext ctx, final int value)
	{
		setCost( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GiftWrapOption.cost</code> attribute. 
	 * @param value the cost - Cost of gift wrap
	 */
	public void setCost(final int value)
	{
		setCost( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GiftWrapOption.description</code> attribute.
	 * @return the description - Description of gift wrap
	 */
	public String getDescription(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedGiftWrapOption.getDescription requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, DESCRIPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GiftWrapOption.description</code> attribute.
	 * @return the description - Description of gift wrap
	 */
	public String getDescription()
	{
		return getDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GiftWrapOption.description</code> attribute. 
	 * @return the localized description - Description of gift wrap
	 */
	public Map<Language,String> getAllDescription(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,DESCRIPTION,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GiftWrapOption.description</code> attribute. 
	 * @return the localized description - Description of gift wrap
	 */
	public Map<Language,String> getAllDescription()
	{
		return getAllDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GiftWrapOption.description</code> attribute. 
	 * @param value the description - Description of gift wrap
	 */
	public void setDescription(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedGiftWrapOption.setDescription requires a session language", 0 );
		}
		setLocalizedProperty(ctx, DESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GiftWrapOption.description</code> attribute. 
	 * @param value the description - Description of gift wrap
	 */
	public void setDescription(final String value)
	{
		setDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GiftWrapOption.description</code> attribute. 
	 * @param value the description - Description of gift wrap
	 */
	public void setAllDescription(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,DESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GiftWrapOption.description</code> attribute. 
	 * @param value the description - Description of gift wrap
	 */
	public void setAllDescription(final Map<Language,String> value)
	{
		setAllDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GiftWrapOption.type</code> attribute.
	 * @return the type - Type of gift wrap
	 */
	public EnumerationValue getType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, TYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GiftWrapOption.type</code> attribute.
	 * @return the type - Type of gift wrap
	 */
	public EnumerationValue getType()
	{
		return getType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GiftWrapOption.type</code> attribute. 
	 * @param value the type - Type of gift wrap
	 */
	public void setType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, TYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GiftWrapOption.type</code> attribute. 
	 * @param value the type - Type of gift wrap
	 */
	public void setType(final EnumerationValue value)
	{
		setType( getSession().getSessionContext(), value );
	}
	
}
