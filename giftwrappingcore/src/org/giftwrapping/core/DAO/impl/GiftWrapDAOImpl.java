/**
 *
 */
package org.giftwrapping.core.DAO.impl;

import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;

import java.util.List;

import org.giftwrapping.core.DAO.GiftWrapDAO;
import org.giftwrapping.core.enums.GiftWrapType;
import org.giftwrapping.core.model.GiftWrapOptionModel;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * @author hemantyadav01
 *
 */

public class GiftWrapDAOImpl implements GiftWrapDAO
{

	@Autowired
	private FlexibleSearchService flexibleSearchService;


	@Override
	public List<GiftWrapOptionModel> findGiftOptions()
	{
		//final String queryString = "SELECT * FROM {GiftWrapOption} ";
		final FlexibleSearchQuery query = new FlexibleSearchQuery("SELECT {pk} FROM {GiftWrapOption}");

		final SearchResult<GiftWrapOptionModel> result = flexibleSearchService.search(query);
		return result.getResult();


	}

	@Override
	public List<GiftWrapOptionModel> findGiftOptionsByType(final GiftWrapType type)
	{
		final String queryString = "SELECT {pk} FROM {GiftWrapOption} WHERE {TYPE} = ?type ";
		final FlexibleSearchQuery query = new FlexibleSearchQuery(queryString);
		query.addQueryParameter("type", type);
		final SearchResult<GiftWrapOptionModel> result = flexibleSearchService.search(query);
		return result.getResult();


	}

}
