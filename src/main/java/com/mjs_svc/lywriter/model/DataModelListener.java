/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mjs_svc.lywriter.model;

import java.util.EventListener;

/**
 *
 * @author haswell
 */
public interface DataModelListener extends EventListener {

	DataModel getSource();
	void dataModelChanged(DataModelEvent event);
}
