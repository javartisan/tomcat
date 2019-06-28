/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.webapp.admin.users;


import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionMapping;


/**
 * Form bean for the delete groups page.
 *
 * @author Craig R. McClanahan
 * @version $Id: GroupsForm.java 939536 2010-04-30 01:21:08Z kkolinko $
 * @since 4.1
 */

public final class GroupsForm extends BaseForm {


    // ----------------------------------------------------- Instance Variables


    // ------------------------------------------------------------- Properties


    /**
     * The object names of the specified groups.
     */
    private String groups[] = null;

    public String[] getGroups() {
        return (this.groups);
    }

    public void setGroups(String groups[]) {
        this.groups = groups;
    }


    // --------------------------------------------------------- Public Methods


    /**
     * Reset all properties to their default values.
     *
     * @param mapping The mapping used to select this instance
     * @param request The servlet request we are processing
     */
    public void reset(ActionMapping mapping, HttpServletRequest request) {

        super.reset(mapping, request);
        this.groups = null;

    }


}
