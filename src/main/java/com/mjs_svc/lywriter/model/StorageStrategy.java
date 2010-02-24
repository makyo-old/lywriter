/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mjs_svc.lywriter.model;

import java.util.Collection;
import java.util.Observable;

/**
 *
 * @author haswell
 */
public interface StorageStrategy<T> {
	void setupStorageContext(
			Collection<T> data,
			Collection<Observable> observables,
			Collection<DataModelListener> listeners
	);

	Collection<T> copyData(Collection<T> data);
}
