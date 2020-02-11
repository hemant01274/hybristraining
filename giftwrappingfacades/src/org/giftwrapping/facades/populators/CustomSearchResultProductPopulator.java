/**
 *
 */
package org.giftwrapping.facades.populators;

import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.commercefacades.search.converters.populator.SearchResultProductPopulator;
import de.hybris.platform.commerceservices.search.resultdata.SearchResultValueData;


/**
 * @author hemantyadav01
 *
 */
public class CustomSearchResultProductPopulator extends SearchResultProductPopulator
{

	@Override
	public void populate(final SearchResultValueData source, final ProductData target)
	{
		super.populate(source, target);
		if (source.getValues() != null)
		{
			// adding our attribute to product data
			target.setGiftWrapAvailable(source.getValues().containsKey("giftWrapAvailable"));

		}

	}



}
