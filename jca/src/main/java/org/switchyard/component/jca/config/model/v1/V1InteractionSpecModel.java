/*
 * JBoss, Home of Professional Open Source Copyright 2009, Red Hat Middleware
 * LLC, and individual contributors by the @authors tag. See the copyright.txt
 * in the distribution for a full listing of individual contributors.
 * 
 * This is free software; you can redistribute it and/or modify it under the
 * terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 * 
 * This software is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with this software; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA, or see the FSF
 * site: http://www.fsf.org.
 */
package org.switchyard.component.jca.config.model.v1;

import javax.xml.namespace.QName;

import org.switchyard.component.jca.JCAConstants;
import org.switchyard.component.jca.config.model.InteractionSpecModel;
import org.switchyard.config.Configuration;
import org.switchyard.config.model.Descriptor;

/**
 * V1 InteractionSpec model.
 * 
 * @author <a href="mailto:tm.igarashi@gmail.com">Tomohisa Igarashi</a>
 *
 */
public class V1InteractionSpecModel extends V1BasePropertyContainerModel implements InteractionSpecModel {

    /**
     * Constructor.
     */
    public V1InteractionSpecModel() {
        super(new QName(JCAConstants.DEFAULT_NAMESPACE, JCAConstants.INTERACTION_SPEC));
        setModelChildrenOrder(JCAConstants.PROPERTY);
    }
    
    /**
     * Constructor.
     * 
     * @param config configuration
     * @param desc descriptor
     */
    public V1InteractionSpecModel(Configuration config, Descriptor desc) {
        super(config, desc);
    }

    @Override
    public String getInteractionSpecClassName() {
        return getModelAttribute(JCAConstants.TYPE);
    }

    @Override
    public InteractionSpecModel setInteractionSpecClassName(String name) {
        setModelAttribute(JCAConstants.TYPE, name);
        return this;
    }

}
