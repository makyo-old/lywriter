/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mjs_svc.lywriter.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.Observer;

/**
 * A datamodel is a collection of data providing a unified "store" for objects.
 * This architecture simplifies the creation of data views, loading, and storing data.
 * @author haswell
 */
public interface DataModel<T> extends Observer, Serializable {
	public enum CopyStrategy {
		Reference,
		Copy
	}

	/**
	 * This interface does not specify the order in which objects are returned.
	 * It is the same as calling DataModel.getData(CopyStrategy.Referece)
	 * @return  A list of all the objects that this data model contains.
	 */
	Collection<T> getData();


	/**
	 *
	 */

	Collection<T> getData(CopyStrategy strategy);

	/**
	 * Return 'true' if this data model has changed from its initial state.
	 * Calls to add() and removed() will almost always flag this state to 'true'
	 * @return
	 */
	boolean isDirty();

	/**
	 * Unconditionally set this model to be dirty.  Should dispatch a
	 * DataModelEvent
	 */
	void setDirty();


	/**
	 * Check to see if this data-model contains the item
	 * @param item
	 * @return
	 */
	boolean contains(T item);

	/**
	 * Add an item to the collection.  Return 'true' iff this data-model has been
	 * modified.  Should dispatch a DataModelEvent
	 * @param item
	 * @return
	 */
	boolean add(T item);

	/**
	 * Remove an item from this collection.  Return 'true' iff this data-model has
	 * been modified.
	 * Should dispatch a DataModelEvent
	 * @param item
	 * @return
	 */
	boolean remove(T item);


	/**
	 * Add a listener to this data model
	 * @param l
	 */

	void addDataModelListener(DataModelListener l);

	/**
	 * Remove a listener from this datamodel.  Should return 'false'
	 * iff the backing store of listeners for this datamodel was not modified.
	 * @param l
	 * @return
	 */
	boolean removeDataModelListener(DataModelListener l);







}
