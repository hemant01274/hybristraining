/**
 *
 */
package org.giftwrapping.core.service;

import java.util.List;

import org.giftwrapping.core.enums.GiftWrapType;
import org.giftwrapping.core.model.GiftWrapOptionModel;


/**
 * @author hemantyadav01
 *
 */
public interface GiftWrapService
{
	List<GiftWrapOptionModel> getAllGiftWrap();

	List<GiftWrapOptionModel> getAllGiftWrapForType(GiftWrapType type);

}
