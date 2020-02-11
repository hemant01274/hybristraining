/*
 * [y] hybris Platform
 *
 * Copyright (c) 2018 SAP SE or an SAP affiliate company.  All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package org.giftwrapping.fulfilmentprocess.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import org.giftwrapping.fulfilmentprocess.constants.GiftwrappingFulfilmentProcessConstants;

public class GiftwrappingFulfilmentProcessManager extends GeneratedGiftwrappingFulfilmentProcessManager
{
	public static final GiftwrappingFulfilmentProcessManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (GiftwrappingFulfilmentProcessManager) em.getExtension(GiftwrappingFulfilmentProcessConstants.EXTENSIONNAME);
	}
	
}
