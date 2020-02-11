/**
 *
 */
package org.giftwrapping.core.service.impl;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import de.hybris.bootstrap.annotations.UnitTest;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.giftwrapping.core.DAO.GiftWrapDAO;
import org.giftwrapping.core.enums.GiftWrapType;
import org.giftwrapping.core.model.GiftWrapOptionModel;
import org.junit.Before;
import org.junit.Test;


/**
 * @author hemantyadav01
 *
 */
@UnitTest
public class GiftWrapServiceUnitTest
{
	private GiftWrapServiceImpl giftWrapService;
	private GiftWrapDAO giftWrapDAO;
	private GiftWrapOptionModel giftWrapModel;

	private static final String GIFTWRAP_CODE = "A66";

	private static final int GIFTWRAP_COST = 56;

	private static final String GIFTWRAP_DESCRIPTION = "Medieval";
	private static final GiftWrapType GIFTWRAP_TYPE = GiftWrapType.STANDARD;

	@Before
	public void setUp()
	{

		giftWrapService = new GiftWrapServiceImpl();

		giftWrapDAO = mock(GiftWrapDAO.class);

		giftWrapService.setGiftWrapDAO(giftWrapDAO);
		giftWrapModel = new GiftWrapOptionModel();
		giftWrapModel.setCode(GIFTWRAP_CODE);
		giftWrapModel.setCost(GIFTWRAP_COST);
		giftWrapModel.setDescription(GIFTWRAP_DESCRIPTION);
		giftWrapModel.setType(GIFTWRAP_TYPE);
	}

	@Test
	public void testGetAllGiftWraps()
	{
		// We construct the data we would like the mocked out DAO to return when called
		final List<GiftWrapOptionModel> giftWrapModels = Arrays.asList(giftWrapModel);
		//Use Mockito and compare results
		when(giftWrapDAO.findGiftOptions()).thenReturn(giftWrapModels);
		// Now we make the call to BandService's getBands() which we expect to call the DAOs' findBands() method
		final List<GiftWrapOptionModel> result = giftWrapService.getAllGiftWrap();
		// We then verify that the results returned from the service match those returned by the mocked-out DAO
		assertEquals("We should find one", 1, result.size());
		assertEquals("And should equals what the mock returned", giftWrapModel, result.get(0));
	}

	@Test
	public void testGetGiftWrapByType()
	{
		// Tell Mockito we expect a call to the DAO's getBand(), and, if it occurs, Mockito should return BandModel instance
		when(giftWrapDAO.findGiftOptionsByType(GIFTWRAP_TYPE)).thenReturn(Collections.singletonList(giftWrapModel));
		// We make the call to the Service's getBandForCode() which we expect to call the DAO's findBandsByCode()
		final List<GiftWrapOptionModel> result = giftWrapService.getAllGiftWrapForType(GIFTWRAP_TYPE);
		// We then verify that the result returned from the Service is the same as that returned from the DAO
		assertEquals("Band should equals() what the mock returned", giftWrapModel, result.get(0));
	}

}
