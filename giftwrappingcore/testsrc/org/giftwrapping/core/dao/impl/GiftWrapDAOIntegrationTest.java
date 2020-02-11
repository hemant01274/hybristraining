/**
 *
 */
package org.giftwrapping.core.dao.impl;

import static org.junit.Assert.assertTrue;

import de.hybris.bootstrap.annotations.IntegrationTest;
import de.hybris.platform.servicelayer.ServicelayerTransactionalTest;
import de.hybris.platform.servicelayer.model.ModelService;

import java.util.List;

import javax.annotation.Resource;

import org.giftwrapping.core.DAO.GiftWrapDAO;
import org.giftwrapping.core.enums.GiftWrapType;
import org.giftwrapping.core.model.GiftWrapOptionModel;
import org.junit.Assert;
import org.junit.Test;


/**
 * @author hemantyadav01
 *
 */
@IntegrationTest
public class GiftWrapDAOIntegrationTest extends ServicelayerTransactionalTest
{


	@Resource
	private GiftWrapDAO giftWrapDAO;

	@Resource
	private ModelService modelService;

	private static final String GIFTWRAP_CODE = "A65";
	/** Name of test band. */
	private static final int GIFTWRAP_COST = 45;
	/** History of test band. */
	private static final String GIFTWRAP_DESCRIPTION = "All rock band formed ";
	/** Albums sold */
	private static final GiftWrapType GIFTWRAP_TYPE = GiftWrapType.STANDARD;



	@Test
	public void giftWrapDAOTest()
	{
		// check that our test gift wrap is not already present in the database
		List<GiftWrapOptionModel> giftWrapByType = giftWrapDAO.findGiftOptionsByType(GIFTWRAP_TYPE);
		assertTrue("No gift wrap should be returned", giftWrapByType.isEmpty());

		// retrieve all Giftwraps currently in the database
		List<GiftWrapOptionModel> allgifts = giftWrapDAO.findGiftOptions();
		final int size = allgifts.size();

		// add our test band to the database
		final GiftWrapOptionModel giftWrapModel = modelService.create(GiftWrapOptionModel.class);
		giftWrapModel.setCode(GIFTWRAP_CODE);
		giftWrapModel.setCost(GIFTWRAP_COST);
		giftWrapModel.setDescription(GIFTWRAP_DESCRIPTION);
		giftWrapModel.setType(GIFTWRAP_TYPE);
		modelService.save(giftWrapModel);

		// check we now get one more Gift wrap back than previously and our test gift wrap is in the list
		allgifts = giftWrapDAO.findGiftOptions();
		Assert.assertEquals(size + 1, allgifts.size());
		Assert.assertTrue("gifts not found", allgifts.contains(giftWrapModel));

		// check we can locate our test band by its code
		giftWrapByType = giftWrapDAO.findGiftOptionsByType(GIFTWRAP_TYPE);
		Assert.assertEquals("Did not find the Band we just saved", 1, giftWrapByType.size());
		Assert.assertEquals("A65", GIFTWRAP_CODE);
		Assert.assertEquals(45, GIFTWRAP_COST, giftWrapByType.get(0).getCost());
		Assert.assertEquals("Retrieved Band's albumSales attribute incorrect", GIFTWRAP_DESCRIPTION,
				giftWrapByType.get(0).getDescription());
		Assert.assertEquals("Retrieved Band's history attribute incorrect", GIFTWRAP_TYPE, giftWrapByType.get(0).getType());
	}

	@Test
	public void testFindGiftWrap_EmptyStringParam()
	{
		//calling findGiftOptionsByType() with an empty String - returns no results
		final List<GiftWrapOptionModel> gifts = giftWrapDAO.findGiftOptionsByType(GiftWrapType.STANDARD);
		Assert.assertTrue("No gifts should be returned", gifts.isEmpty());
	}

	@Test(expected = IllegalArgumentException.class)
	public void testfindGiftWrap_NullParam()
	{
		//calling findGiftOptionsByType with null should throw an IllegalArgumentException
		giftWrapDAO.findGiftOptionsByType(null); //method's return value not captured
	}


}
