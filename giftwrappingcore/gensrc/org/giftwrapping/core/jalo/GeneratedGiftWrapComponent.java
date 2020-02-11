/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Feb 10, 2020 12:56:55 PM                    ---
 * ----------------------------------------------------------------
 */
package org.giftwrapping.core.jalo;

import de.hybris.platform.cms2.jalo.contents.components.SimpleCMSComponent;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.media.Media;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.giftwrapping.core.constants.GiftwrappingCoreConstants;

/**
 * Generated class for type {@link org.giftwrapping.core.jalo.GiftWrapComponent GiftWrapComponent}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedGiftWrapComponent extends SimpleCMSComponent
{
	/** Qualifier of the <code>GiftWrapComponent.giftWrapType</code> attribute **/
	public static final String GIFTWRAPTYPE = "giftWrapType";
	/** Qualifier of the <code>GiftWrapComponent.cost</code> attribute **/
	public static final String COST = "cost";
	/** Qualifier of the <code>GiftWrapComponent.description</code> attribute **/
	public static final String DESCRIPTION = "description";
	/** Qualifier of the <code>GiftWrapComponent.productImage</code> attribute **/
	public static final String PRODUCTIMAGE = "productImage";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(SimpleCMSComponent.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(GIFTWRAPTYPE, AttributeMode.INITIAL);
		tmp.put(COST, AttributeMode.INITIAL);
		tmp.put(DESCRIPTION, AttributeMode.INITIAL);
		tmp.put(PRODUCTIMAGE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GiftWrapComponent.cost</code> attribute.
	 * @return the cost - Cost of Gift Wrap
	 */
	public Double getCost(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, COST);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GiftWrapComponent.cost</code> attribute.
	 * @return the cost - Cost of Gift Wrap
	 */
	public Double getCost()
	{
		return getCost( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GiftWrapComponent.cost</code> attribute. 
	 * @return the cost - Cost of Gift Wrap
	 */
	public double getCostAsPrimitive(final SessionContext ctx)
	{
		Double value = getCost( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GiftWrapComponent.cost</code> attribute. 
	 * @return the cost - Cost of Gift Wrap
	 */
	public double getCostAsPrimitive()
	{
		return getCostAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GiftWrapComponent.cost</code> attribute. 
	 * @param value the cost - Cost of Gift Wrap
	 */
	public void setCost(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, COST,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GiftWrapComponent.cost</code> attribute. 
	 * @param value the cost - Cost of Gift Wrap
	 */
	public void setCost(final Double value)
	{
		setCost( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GiftWrapComponent.cost</code> attribute. 
	 * @param value the cost - Cost of Gift Wrap
	 */
	public void setCost(final SessionContext ctx, final double value)
	{
		setCost( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GiftWrapComponent.cost</code> attribute. 
	 * @param value the cost - Cost of Gift Wrap
	 */
	public void setCost(final double value)
	{
		setCost( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GiftWrapComponent.description</code> attribute.
	 * @return the description - Description of Wrap Type
	 */
	public String getDescription(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedGiftWrapComponent.getDescription requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, DESCRIPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GiftWrapComponent.description</code> attribute.
	 * @return the description - Description of Wrap Type
	 */
	public String getDescription()
	{
		return getDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GiftWrapComponent.description</code> attribute. 
	 * @return the localized description - Description of Wrap Type
	 */
	public Map<Language,String> getAllDescription(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,DESCRIPTION,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GiftWrapComponent.description</code> attribute. 
	 * @return the localized description - Description of Wrap Type
	 */
	public Map<Language,String> getAllDescription()
	{
		return getAllDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GiftWrapComponent.description</code> attribute. 
	 * @param value the description - Description of Wrap Type
	 */
	public void setDescription(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedGiftWrapComponent.setDescription requires a session language", 0 );
		}
		setLocalizedProperty(ctx, DESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GiftWrapComponent.description</code> attribute. 
	 * @param value the description - Description of Wrap Type
	 */
	public void setDescription(final String value)
	{
		setDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GiftWrapComponent.description</code> attribute. 
	 * @param value the description - Description of Wrap Type
	 */
	public void setAllDescription(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,DESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GiftWrapComponent.description</code> attribute. 
	 * @param value the description - Description of Wrap Type
	 */
	public void setAllDescription(final Map<Language,String> value)
	{
		setAllDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GiftWrapComponent.giftWrapType</code> attribute.
	 * @return the giftWrapType - type can be standard or premium for gift wrapping
	 */
	public EnumerationValue getGiftWrapType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, GIFTWRAPTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GiftWrapComponent.giftWrapType</code> attribute.
	 * @return the giftWrapType - type can be standard or premium for gift wrapping
	 */
	public EnumerationValue getGiftWrapType()
	{
		return getGiftWrapType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GiftWrapComponent.giftWrapType</code> attribute. 
	 * @param value the giftWrapType - type can be standard or premium for gift wrapping
	 */
	public void setGiftWrapType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, GIFTWRAPTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GiftWrapComponent.giftWrapType</code> attribute. 
	 * @param value the giftWrapType - type can be standard or premium for gift wrapping
	 */
	public void setGiftWrapType(final EnumerationValue value)
	{
		setGiftWrapType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GiftWrapComponent.productImage</code> attribute.
	 * @return the productImage - Image of Gift Wrap
	 */
	public Media getProductImage(final SessionContext ctx)
	{
		return (Media)getProperty( ctx, PRODUCTIMAGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GiftWrapComponent.productImage</code> attribute.
	 * @return the productImage - Image of Gift Wrap
	 */
	public Media getProductImage()
	{
		return getProductImage( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GiftWrapComponent.productImage</code> attribute. 
	 * @param value the productImage - Image of Gift Wrap
	 */
	public void setProductImage(final SessionContext ctx, final Media value)
	{
		setProperty(ctx, PRODUCTIMAGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GiftWrapComponent.productImage</code> attribute. 
	 * @param value the productImage - Image of Gift Wrap
	 */
	public void setProductImage(final Media value)
	{
		setProductImage( getSession().getSessionContext(), value );
	}
	
}
