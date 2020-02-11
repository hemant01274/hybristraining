/**
 *
 */
package org.giftwrapping.core.service.impl;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import de.hybris.bootstrap.annotations.IntegrationTest;
import de.hybris.platform.servicelayer.ServicelayerTransactionalTest;
import de.hybris.platform.servicelayer.model.ModelService;

import java.util.List;

import javax.annotation.Resource;

import org.giftwrapping.core.enums.GiftWrapType;
import org.giftwrapping.core.model.GiftWrapOptionModel;
import org.giftwrapping.core.service.GiftWrapService;
import org.junit.Test;


/**
 * @author hemantyadav01
 *
 */
@IntegrationTest
public class GiftWrapServiceIntegrationTest extends ServicelayerTransactionalTest
{
	@Resource
	private GiftWrapService giftWrapService;
	@Resource
	private ModelService modelService;
	/** Test band */
	private GiftWrapOptionModel giftWrapModel;
	/** Name of test band. */
	private static final String GIFTWRAP_CODE = "A85";
	/** Name of test band. */
	private static final int GIFTWRAP_COST = 90;
	/** History of test band. */
	private static final String GIFTWRAP_DESCRIPTION = "New contemporary, 7-piece Jaz unit from London, formed in 2015";
	/** Albums sold by test band. */
	private static final GiftWrapType GIFTWRAP_TYPE = GiftWrapType.STANDARD;


	@Test(expected = IllegalArgumentException.class)
	public void testFailBehavior()
	{
		giftWrapService.getAllGiftWrapForType(null);
	}

	@Test
	public void testGiftWapService()
	{
		List<GiftWrapOptionModel> giftWrapModels = giftWrapService.getAllGiftWrap();
		final int size = giftWrapModels.size();

		giftWrapModel = modelService.create(GiftWrapOptionModel.class);
		giftWrapModel.setCode(GIFTWRAP_CODE);
		giftWrapModel.setCost(GIFTWRAP_COST);
		giftWrapModel.setDescription(GIFTWRAP_DESCRIPTION);
		giftWrapModel.setType(GIFTWRAP_TYPE);

		modelService.save(giftWrapModel);

		giftWrapModels = giftWrapService.getAllGiftWrap();
		assertEquals(size + 1, giftWrapModels.size());
		assertEquals("Unexpected band found", giftWrapModel, giftWrapModels.get(giftWrapModels.size() - 1));
		final List<GiftWrapOptionModel> persistedGiftWrapModel = giftWrapService.getAllGiftWrapForType(GIFTWRAP_TYPE);
		assertNotNull("No gift found", persistedGiftWrapModel);
		assertEquals("Different band found", giftWrapModel, persistedGiftWrapModel.get(0));
	}

}
