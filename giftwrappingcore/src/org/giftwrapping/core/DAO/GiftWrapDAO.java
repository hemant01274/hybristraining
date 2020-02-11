/**
 *
 */
package org.giftwrapping.core.DAO;

import java.util.List;

import org.giftwrapping.core.enums.GiftWrapType;
import org.giftwrapping.core.model.GiftWrapOptionModel;;


/**
 * @author hemantyadav01
 *
 */
public interface GiftWrapDAO
{
	List<GiftWrapOptionModel> findGiftOptions();

	List<GiftWrapOptionModel> findGiftOptionsByType(GiftWrapType type);

}
