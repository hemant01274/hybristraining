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
package org.giftwrapping.core.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import org.giftwrapping.core.constants.GiftwrappingCoreConstants;
import org.giftwrapping.core.setup.CoreSystemSetup;


/**
 * Do not use, please use {@link CoreSystemSetup} instead.
 * 
 */
public class GiftwrappingCoreManager extends GeneratedGiftwrappingCoreManager
{
	public static final GiftwrappingCoreManager getInstance()
	{
		final ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (GiftwrappingCoreManager) em.getExtension(GiftwrappingCoreConstants.EXTENSIONNAME);
	}
}
