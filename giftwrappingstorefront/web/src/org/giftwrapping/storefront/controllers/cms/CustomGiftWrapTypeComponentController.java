/**
 *
 */
package org.giftwrapping.storefront.controllers.cms;

import de.hybris.platform.acceleratorstorefrontcommons.controllers.cms.AbstractCMSComponentController;

import javax.servlet.http.HttpServletRequest;

import org.giftwrapping.core.model.GiftWrapComponentModel;
import org.giftwrapping.storefront.controllers.ControllerConstants;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;





/**
 * @author hemantyadav01
 *
 */

@Controller("CustomGiftWrapTypeComponentController")
@Scope("tenant")
@RequestMapping(value = ControllerConstants.Actions.Cms.CustomGiftWrapComponent)
public class CustomGiftWrapTypeComponentController extends AbstractCMSComponentController<GiftWrapComponentModel>
{

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * de.hybris.platform.acceleratorstorefrontcommons.controllers.cms.AbstractCMSComponentController#fillModel(javax.
	 * servlet.http.HttpServletRequest, org.springframework.ui.Model,
	 * de.hybris.platform.cms2.model.contents.components.AbstractCMSComponentModel)
	 */
	@Override
	protected void fillModel(final HttpServletRequest request, final Model model, final GiftWrapComponentModel component)
	{
		// XXX Auto-generated method stub
		model.addAttribute("description", component.getDescription());

		model.addAttribute("cost", component.getCost());

		model.addAttribute("giftWrapType", component.getGiftWrapType());

		model.addAttribute("productImage", component.getProductImage());

	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * de.hybris.platform.acceleratorstorefrontcommons.controllers.cms.AbstractCMSComponentController#getView(de.hybris.
	 * platform.cms2.model.contents.components.AbstractCMSComponentModel)
	 */
	@Override
	protected String getView(final GiftWrapComponentModel component)
	{
		// XXX Auto-generated method stub
		return null;
	}


}
