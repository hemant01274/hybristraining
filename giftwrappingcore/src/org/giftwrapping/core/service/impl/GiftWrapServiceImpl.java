/**
 *
 */
package org.giftwrapping.core.service.impl;

import java.util.List;

import org.giftwrapping.core.DAO.GiftWrapDAO;
import org.giftwrapping.core.enums.GiftWrapType;
import org.giftwrapping.core.model.GiftWrapOptionModel;
import org.giftwrapping.core.service.GiftWrapService;
import org.springframework.beans.factory.annotation.Required;


/**
 * @author hemantyadav01
 *
 */
public class GiftWrapServiceImpl implements GiftWrapService
{

	private GiftWrapDAO giftWrapDAO;

	/*
	 * (non-Javadoc)
	 *
	 * @see org.giftwrapping.core.service.GiftWrapService#getGiftWrap()
	 */
	@Override
	public List<GiftWrapOptionModel> getAllGiftWrap()
	{
		// XXX Auto-generated method stub
		return giftWrapDAO.findGiftOptions();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.giftwrapping.core.service.GiftWrapService#getGiftWrapForType(org.giftwrapping.core.enums.GiftWrapType)
	 */
	@Override
	public List<GiftWrapOptionModel> getAllGiftWrapForType(final GiftWrapType type)
	{
		// XXX Auto-generated method stub
		return giftWrapDAO.findGiftOptionsByType(type);
	}

	@Required
	public void setGiftWrapDAO(final GiftWrapDAO giftWrapDAO)
	{
		this.giftWrapDAO = giftWrapDAO;
	}

}
