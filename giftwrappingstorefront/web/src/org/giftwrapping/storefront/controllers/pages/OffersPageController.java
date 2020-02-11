/**
 *
 */
package org.giftwrapping.storefront.controllers.pages;

import de.hybris.platform.acceleratorstorefrontcommons.controllers.pages.AbstractPageController;
import de.hybris.platform.cms2.exceptions.CMSItemNotFoundException;
import de.hybris.platform.cms2.model.pages.ContentPageModel;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * @author hemantyadav01
 *
 */
@Controller
@Scope("tenant")
@RequestMapping("/giftwraptype")
public class OffersPageController extends AbstractPageController
{
	private static final String GIFTWRAPTYPE_CMS_PAGE = "giftWrapCMSPage";

	@RequestMapping(method = RequestMethod.GET)
	public String getOffers(final Model model) throws CMSItemNotFoundException
	{
		final ContentPageModel giftWrapPage = getContentPageForLabelOrId(GIFTWRAPTYPE_CMS_PAGE);
		storeCmsPageInModel(model, giftWrapPage);
		setUpMetaDataForContentPage(model, giftWrapPage);
		return getViewForPage(model);
	}
}
