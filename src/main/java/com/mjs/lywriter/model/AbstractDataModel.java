/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mjs.lywriter.model;

import com.mjs.lywriter.model.DataModel.CopyStrategy;
import java.util.Collection;
import java.util.Observable;
import java.util.Set;

/**
 *
 * @author haswell
 */
public class AbstractDataModel<T> implements DataModel<T> {

	private Set<DataModelListener> listeners;
	private Collection<T> data;
	private Set<Observable> observables;
	private boolean dirty = false;

	private StorageStrategy<T> repository;

	public AbstractDataModel(StorageStrategy<T> storageStrategy) {
		repository = storageStrategy;
		repository.setupStorageContext(data, observables, listeners);
	}

	@Override
	public Collection<T> getData(CopyStrategy strategy) {
		Collection<T> result = null;
		if(strategy == CopyStrategy.Reference) {
			result = repository.copyData(data);
		} else {
			result = data;
		}
		return result;
	}


	@Override
	public Collection<T> getData() {
		return getData(CopyStrategy.Reference);
	}

	@Override
	public boolean isDirty() {
		return dirty;
	}

	@Override
	public void setDirty() {
		dirty = true;
	}

	@Override
	public boolean contains(T item) {
		return data.contains(item);
	}

	@Override
	public boolean add(T item) {
		setDirty();
		return data.add(item);
	}

	@Override
	public boolean remove(T item) {
		if(data.remove(item)) {
			return (dirty = true);
		}
		return false;
	}

	@Override
	public void addDataModelListener(DataModelListener l) {
		listeners.add(l);
	}

	@Override
	public boolean removeDataModelListener(DataModelListener l) {
		return listeners.remove(l);
	}

	@Override
	public void update(Observable observable, Object value) {
		observable.notifyObservers(value);
	}


}
