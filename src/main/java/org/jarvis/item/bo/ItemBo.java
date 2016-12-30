package org.jarvis.item.bo;

import org.jarvis.item.model.Item;

public interface ItemBo {

	void save(Item item);
	void update(Item item);
	void delete(Item item);
	Item findByItemNo(Long itemNo);
}