/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Feb 10, 2020 12:56:55 PM                    ---
 * ----------------------------------------------------------------
 */
package org.giftwrapping.core.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.giftwrapping.core.constants.GiftwrappingCoreConstants;
import org.giftwrapping.core.jalo.ApparelProduct;
import org.giftwrapping.core.jalo.ApparelSizeVariantProduct;
import org.giftwrapping.core.jalo.ApparelStyleVariantProduct;
import org.giftwrapping.core.jalo.ElectronicsColorVariantProduct;
import org.giftwrapping.core.jalo.GiftWrapComponent;
import org.giftwrapping.core.jalo.GiftWrapOption;

/**
 * Generated class for type <code>GiftwrappingCoreManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedGiftwrappingCoreManager extends Extension
{
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put("giftWrapAvailable", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.product.Product", Collections.unmodifiableMap(tmp));
		DEFAULT_INITIAL_ATTRIBUTES = ttmp;
	}
	@Override
	public Map<String, AttributeMode> getDefaultAttributeModes(final Class<? extends Item> itemClass)
	{
		Map<String, AttributeMode> ret = new HashMap<>();
		final Map<String, AttributeMode> attr = DEFAULT_INITIAL_ATTRIBUTES.get(itemClass.getName());
		if (attr != null)
		{
			ret.putAll(attr);
		}
		return ret;
	}
	
	public ApparelProduct createApparelProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( GiftwrappingCoreConstants.TC.APPARELPRODUCT );
			return (ApparelProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelProduct createApparelProduct(final Map attributeValues)
	{
		return createApparelProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ApparelSizeVariantProduct createApparelSizeVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( GiftwrappingCoreConstants.TC.APPARELSIZEVARIANTPRODUCT );
			return (ApparelSizeVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelSizeVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelSizeVariantProduct createApparelSizeVariantProduct(final Map attributeValues)
	{
		return createApparelSizeVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ApparelStyleVariantProduct createApparelStyleVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( GiftwrappingCoreConstants.TC.APPARELSTYLEVARIANTPRODUCT );
			return (ApparelStyleVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelStyleVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelStyleVariantProduct createApparelStyleVariantProduct(final Map attributeValues)
	{
		return createApparelStyleVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ElectronicsColorVariantProduct createElectronicsColorVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( GiftwrappingCoreConstants.TC.ELECTRONICSCOLORVARIANTPRODUCT );
			return (ElectronicsColorVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ElectronicsColorVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ElectronicsColorVariantProduct createElectronicsColorVariantProduct(final Map attributeValues)
	{
		return createElectronicsColorVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public GiftWrapComponent createGiftWrapComponent(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( GiftwrappingCoreConstants.TC.GIFTWRAPCOMPONENT );
			return (GiftWrapComponent)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating GiftWrapComponent : "+e.getMessage(), 0 );
		}
	}
	
	public GiftWrapComponent createGiftWrapComponent(final Map attributeValues)
	{
		return createGiftWrapComponent( getSession().getSessionContext(), attributeValues );
	}
	
	public GiftWrapOption createGiftWrapOption(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( GiftwrappingCoreConstants.TC.GIFTWRAPOPTION );
			return (GiftWrapOption)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating GiftWrapOption : "+e.getMessage(), 0 );
		}
	}
	
	public GiftWrapOption createGiftWrapOption(final Map attributeValues)
	{
		return createGiftWrapOption( getSession().getSessionContext(), attributeValues );
	}
	
	@Override
	public String getName()
	{
		return GiftwrappingCoreConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.giftWrapAvailable</code> attribute.
	 * @return the giftWrapAvailable - wrapping
	 */
	public Boolean isGiftWrapAvailable(final SessionContext ctx, final Product item)
	{
		return (Boolean)item.getProperty( ctx, GiftwrappingCoreConstants.Attributes.Product.GIFTWRAPAVAILABLE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.giftWrapAvailable</code> attribute.
	 * @return the giftWrapAvailable - wrapping
	 */
	public Boolean isGiftWrapAvailable(final Product item)
	{
		return isGiftWrapAvailable( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.giftWrapAvailable</code> attribute. 
	 * @return the giftWrapAvailable - wrapping
	 */
	public boolean isGiftWrapAvailableAsPrimitive(final SessionContext ctx, final Product item)
	{
		Boolean value = isGiftWrapAvailable( ctx,item );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.giftWrapAvailable</code> attribute. 
	 * @return the giftWrapAvailable - wrapping
	 */
	public boolean isGiftWrapAvailableAsPrimitive(final Product item)
	{
		return isGiftWrapAvailableAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.giftWrapAvailable</code> attribute. 
	 * @param value the giftWrapAvailable - wrapping
	 */
	public void setGiftWrapAvailable(final SessionContext ctx, final Product item, final Boolean value)
	{
		item.setProperty(ctx, GiftwrappingCoreConstants.Attributes.Product.GIFTWRAPAVAILABLE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.giftWrapAvailable</code> attribute. 
	 * @param value the giftWrapAvailable - wrapping
	 */
	public void setGiftWrapAvailable(final Product item, final Boolean value)
	{
		setGiftWrapAvailable( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.giftWrapAvailable</code> attribute. 
	 * @param value the giftWrapAvailable - wrapping
	 */
	public void setGiftWrapAvailable(final SessionContext ctx, final Product item, final boolean value)
	{
		setGiftWrapAvailable( ctx, item, Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.giftWrapAvailable</code> attribute. 
	 * @param value the giftWrapAvailable - wrapping
	 */
	public void setGiftWrapAvailable(final Product item, final boolean value)
	{
		setGiftWrapAvailable( getSession().getSessionContext(), item, value );
	}
	
}
